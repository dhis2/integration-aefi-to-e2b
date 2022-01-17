# AEFI to E2B DHIS2 Facade

**Requirements**: JDK 11, Maven 3

## Quickstart

First compile the project (we will publish JARs later on)

```shell
$ mvn package
```

This should give you a file inside of `target/` named `aefi-to-e2b.jar`.

Before you start the project you need to set up some basic configuration, this you should put in a file called `application.yml` in your root directory.

```yaml
aefi-to-e2b:
  e2b:
    country: <<ISO3166 Country Code>>
    sender_id: MU-DHIS2
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

Using default configuration it will bind on `127.0.0.1:8080`.

You can now get a E2B version of any patient you have in your system by using that patients `uid`.

`http://localhost:8080/api/aefi-to-e2b/<<UID>>`.

Search capability etc will be added later.
