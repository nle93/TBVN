## Run locally

### Environment
+ JAVA 8
+ MySQL

### Configuration
+ Edit three properties below in src/main/resources/application.properties to connect to your database

```
spring.datasource.url
spring.datasource.username
spring.datasource.password
```

### Run
```
mvnw spring-boot:run
```

Use this URL to see the API: http://localhost:8080/api/employee/all

Use this URL to see the View: http://localhost:8080/view/employee/all

### Login
```
Username: user
Password: password
```