# school_information_system

School Information System using Vuejs and Spring Boot

# Setup and Run

// Mysql db script

- cd db_script
- execute the sql dumps file

// Back end setup

- inside the src folder, mvn install (first time only)
- Update the application.properties file, set to your local database (one time only)

spring.datasource.url=jdbc:mysql://<local_database_link>/school
spring.datasource.username=<dbadmin_username>
spring.datasource.password=<dbadmin_password>

- mvn spring-boot:run or run in eclipse/IntelliJ IDE (will run in port 8080)

// Front end setup

- cd src/frontend
- npm install (first time only)
- npm run serve (will run in port 3000)
