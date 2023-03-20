# graphql-example
A Spring Boot - Graphql Service Application

## Tech Stack
- Java 11
- Spring Boot 2.7.9
- MySQL 8.0.22

## Pre-Requisites

####  Creating .env file
Create a .env file under the root directory of the project with the following variables in order to run the application properly.
```
SPRING_DATASOURCE_URL=<MySQL Connection URL>
SPRING_DATASOURCE_USERNAME=<MySQL Username>
SPRING_DATASOURCE_PASSWORD=<MySQL Password>
SPRING_DATASOURCE_DRIVERCLASSNAME=<MySQL Driver Classname e.g. com.mysql.jdbc.Driver>
```

#### Install dependencies & Run Project
To install project dependencies, run below commands
```
mvn install
mvn spring-boot:run
```

## Testing the Application
You can test the queries on your local by using `GraphiQL`. You can access `GraphiQL` from http://localhost:8080/graphiql when the app is running on your local environment.
