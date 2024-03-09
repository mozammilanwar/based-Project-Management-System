# Project Management System

This is a simple Project Management System built with Java 17 and Spring Boot, implementing CRUD operations.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Setup](#project-setup)
- [Database Configuration](#database-configuration)
- [Model Creation](#model-creation)
- [Repository Layer](#repository-layer)
- [Service Layer](#service-layer)
- [Controller Layer](#controller-layer)
- [Exception Handling](#exception-handling)
- [Data Validation](#data-validation)
- [Testing](#testing)
- [Documentation](#documentation)
- [Run the Application](#run-the-application)
- [Postman Usage](#postman-usage)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

- Java 17
- Spring Boot
- Maven
- Postman (for testing)

## Project Setup

1. Initialize a new Spring Boot project using [Spring Initializr](https://start.spring.io/).
    - Project Metadata: Choose a Group and Artifact name.
    - Dependencies: Select Spring Web, Spring Data JPA, H2 Database.

2. Download the generated project and import it into your preferred IDE.

## Database Configuration

1. Open `src/main/resources/application.properties`.
2. Configure the H2 in-memory database:
   ```properties
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=root
   spring.datasource.password=Moz@0786
   spring.h2.console.enabled=true

Model Creation
Create a Project model class in the src/main/java/com/example/project/Entity package.
Repository Layer
Create a ProjectRepository interface extending JpaRepository to handle data operations.
Service Layer
Implement a ProjectService class to handle business logic.
Controller Layer
Develop a ProjectController class to handle HTTP requests.
Exception Handling
Implement global exception handling using @ControllerAdvice to manage exceptions.
Data Validation
Add validation annotations to the Project model class for fields that need validation.
Testing
Write unit tests for ProjectService methods using JUnit.
Write integration tests for ProjectController using tools like MockMvc.
Documentation
Use Swagger or a similar tool for API documentation.
Add Swagger dependencies.
Configure Swagger in a SwaggerConfig class.
Run the Application
Run the Spring Boot application.
Test the CRUD operations using tools like Postman or curl.
Postman Usage
1. Create a New Project (POST)
   Set the request type to POST.
   Enter the URL for creating a new project (e.g., http://localhost:7171/projects).
   Go to the "Body" tab and provide the project details in JSON format.
   Click "Send" to create the project.
2. Get All Projects (GET)
   Set the request type to GET.
   Enter the URL for retrieving all projects (e.g., http://localhost:7171/projects).
   Click "Send" to get a list of all projects.
   ...

Contributing
Feel free to contribute to this project by opening issues or creating pull requests.

License
This project is licensed under the MIT License - see the LICENSE file for details.