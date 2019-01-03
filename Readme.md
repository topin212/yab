## Installation instructions

Clone the repo and copy the configuration file:
```
    git clone https://github.com/topin212/yab.git

    cd src/main/resources
    cp application-global.yaml application.yaml
```

Then enter your database credentials in `application.yaml`.

And:
```
    mvn spring-boot:run
```