# Employee Management System

## Overview

The Employee Management System is a backend application built with Spring Boot 3 and Java 17. It is designed to provide companies with a robust way to manage their employees. This CRUD (Create, Read, Update, Delete) application allows operations such as adding, listing, updating, and removing employee data stored in a MySQL database.

---

## Features

- **Add Employees**: Add new employee records to the system.
- **View Employees**: Retrieve and display all employees in the system.
- **Update Employees**: Edit existing employee details.
- **Delete Employees**: Remove employee records from the system.

---

## Technologies Used

### Backend
- **Spring Boot 3**
- **Java 17**
- **MySQL**

### Tools and Frameworks
- Maven (Dependency Management)
- Hibernate (ORM)
- REST API (CRUD Endpoints)
- Spring Data JPA

---

## Setup and Installation

### Prerequisites
- Java 17 installed
- Maven installed
- MySQL server installed and running

### Steps to Set Up the Application

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd employee-management-system
   ```

2. **Configure the Database**
   Update the `application.properties` file with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build the Application**
   Use Maven to build the project:
   ```bash
   mvn clean install
   ```

4. **Run the Application**
   Execute the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**
   The application will run on `http://localhost:8080`. Use the provided endpoints to interact with the API.

---

## API Endpoints

| HTTP Method | Endpoint            | Description                  |
|-------------|---------------------|------------------------------|
| GET         | `/api/employees`    | Fetch all employees          |
| POST        | `/api/employees`    | Add a new employee           |
| PUT         | `/api/employees/:id`| Update an existing employee  |
| DELETE      | `/api/employees/:id`| Delete an employee by ID     |

---

## Example API Usage

### Add an Employee
```json
POST /api/employees
{
    "name": "John Doe",
    "email": "johndoe@example.com",
    "position": "Software Engineer"
}
```

### Update an Employee
```json
PUT /api/employees/1
{
    "name": "John Smith",
    "email": "johnsmith@example.com",
    "position": "Senior Software Engineer"
}
```

---

## Future Enhancements

- Implement front-end integration.
- Add user authentication and authorization.
- Enable file uploads for employee documents.

---

## License
This project is licensed under the MIT License.

