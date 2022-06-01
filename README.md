# AEFI to E2B DHIS2 Gateway

![Build Status](https://github.com/dhis2/integration-aefi-to-e2b/workflows/CI/badge.svg)

**Requirements**: JDK 11, Maven 3

## Quickstart

Compile the project or download the most recent war file (links under releases).

```shell
$ mvn package
```

This should give you a file inside of `target/` named `aefi-to-e2b.jar`.

Before you start the project you need to set up some basic configuration, this you should put in a file called `application.yml` in your root directory.

```yaml
aefi-to-e2b:
  e2b:
    country: <<ISO3166 Country Code>>
    sender_id: <<Sender ID, could be CountryCode-DHIS2 for example>>
    receiver_id: <<Country Vigiflow organisation>>
    receiver_organization: <<Country Vigiflow organisation>>
    receiver_code: <<ISO3166 Country Code>>
  dhis2:
    base_url: <<URL to your DHIS2 instance>>
    username: <<Username>>
    password: <<Password>>
```

After this, you can now run the facade with

```shell
$ java -jar target/aefi-to-e2b.jar
```

Using default configuration it will bind on `127.0.0.1:8080`. If you need to do more complex configuration (for example remapping UIDs), please [see](https://github.com/dhis2/integration-aefi-to-e2b/blob/main/src/main/resources/application.yml#L1).

### AEFI API

After the system is up and running (and you are using the default endpoint) you can now access the main
API at `http://localhost:8080/api/aefi-to-e2b`.

1. Using the `lastUpdated` parameter you can now get a list of the most recent AEFI cases inside of DHIS2.
2. If you know the specific UID, you can go to `/api/aefi-to-e2b/<<UID>>`.

### AEFI Mail

If you instead of using the API gateway want a daily/weekly/monthly email sent to your inbox with the latest cases, that is now also supported.

First (in your `application.properties` file) you need to enable a mail server (example below for a simple local running SMTPD server)

```yaml
spring:
  mail:
    host: localhost
    port: 25
    username: test
    password: test
```

After that you need to enable the internal scheduler to send this scheduled emails

```yaml
aefi-to-e2b:
  mail:
    enabled: true
    to: morten@dhis2.org
    from: noreply@dhis2.org
    schedule: "0 0 * * * *"
```

For example would email you every night. Please note that there will be a new file created in the current directory called `state.properties`, this file keep tracker
of when the last successful run was. If you delete this file, it will start over.

By default, it will start at `2022-01-01`. If you want another default, please create a file called `state.properties` with

```properties
mail.last-updated=2022-05-01 (or whatever date you want to start at)
```
