## Requirements
1. JDK 11
2. Maven 3
3. MySQL 8

## Steps helpful in CI

**To package**

```bash
mvn clean package
```
Executable Jar file will be generated as target/notes-app-1.0.0.jar.

JUnit test report will be generated under target/surefire-reports/.

Jacoco Code Coverage report will be generated as target/jacoco.exec.


**Run SonarQube analysis**


Set SonarQube environment variables correctly with URL and token
```bash
mvn sonar:sonar
```


## Steps to run post package

**Setup MySQL**

An instance of MySQL 8.
Note the username and password.


**Create a database**

Run this MySQL Query
```bash
create database notes_app
```


**Set environment variables and run the app**

Replace the <instanceUrl> with IP or appropriate endpoint.
Replace the <username> and <password> with appropriate values.

```bash
export SPRING_DATASOURCE_URL="jdbc:mysql://<instanceUrl>:3306/notes_app?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false"
export SPRING_DATASOURCE_USERNAME=<username>
export SPRING_DATASOURCE_PASSWORD=<password>
java -jar target/notes-app-1.0.0.jar
```

The app will start running at <http://localhost:8080>.


## Explore Rest APIs

Health URL

    GET /actuator/health

The app defines following CRUD APIs.

    GET /api/notes
    POST /api/notes
    GET /api/notes/{noteId}
    PUT /api/notes/{noteId}
    DELETE /api/notes/{noteId}