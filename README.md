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

## Model Creation
- Create a Project model class in the src/main/java/com/example/project/Entity package.
Repository Layer
- Create a ProjectRepository interface extending JpaRepository to handle data operations.
Service Layer
- Implement a ProjectService class to handle business logic.
Controller Layer
- Develop a ProjectController class to handle HTTP requests.
Exception Handling
- Implement global exception handling using @ControllerAdvice to manage exceptions.
Data Validation
- Add validation annotations to the Project model class for fields that need validation.
Testing
- Write unit tests for ProjectService methods using JUnit.
- Write integration tests for ProjectController using tools like MockMvc.
Documentation
- Use Swagger or a similar tool for API documentation.
- Add Swagger dependencies.
- Configure Swagger in a SwaggerConfig class.
Run the Application
- Run the Spring Boot application.


## Project Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/mozammilanwar/based-Project-Management-System.git
    ```

2. Open the project in your preferred IDE.

3. Build the project:

    ```bash
    mvn clean install
    ```

## Run the Application

1. Start the Spring Boot application:

    ```bash
    mvn spring-boot:run
    ```

   The application will be accessible at `http://localhost:7171`.

## Test CRUD Operations in Postman

### 1. Create a New Project (POST):

- **URL:** `http://localhost:7171/projects`
- **Method:** `POST`
- **Body:**
    ```json
    {
      "name": "Project A",
      "description": "This is Project A",
      "startDate": "2022-01-01",
      "endDate": "2022-12-31"
    }
    ```

### 2. Get All Projects (GET):

- **URL:** `http://localhost:7171/projects`
- **Method:** `GET`

### 3. Get a Specific Project by ID (GET):

- **URL:** `http://localhost:7171/projects/{id}` (replace `{id}` with an actual project ID)
- **Method:** `GET`

### 4. Update a Project (PUT):

- **URL:** `http://localhost:7171/projects/{id}` (replace `{id}` with an actual project ID)
- **Method:** `PUT`
- **Body:**
    ```json
    {
      "name": "Updated Project A",
      "description": "This is the updated Project A",
      "startDate": "2022-01-01",
      "endDate": "2022-12-31"
    }
    ```

### 5. Delete a Project (DELETE):

- **URL:** `http://localhost:8080/projects/{id}` (replace `{id}` with an actual project ID)
- **Method:** `DELETE`
