# Inventario

Inventario is a Spring Boot application for managing inventory.

## Features

- Inventory management (CRUD operations)
- RESTful APIs

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Getting Started

### Prerequisites

- JDK 21 or higher
- Maven 3.x or higher
- MySQL server

### Database Setup

1. Ensure you have a MySQL server running.
2. Create a database named `inventario`.
3. The application will automatically create the necessary tables based on the `import.sql` file and JPA entity definitions when it starts up. You may need to update the database credentials in `src/main/resources/application.properties` if they differ from the default (username: `root`, password: ``).

### Running the Application

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```
2. Build the project and run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
3. The application will start on `http://localhost:8080`.

## API Endpoints

The following are the main API endpoints provided by the application:

