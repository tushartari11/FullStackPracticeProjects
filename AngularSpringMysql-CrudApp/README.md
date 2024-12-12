# Employee Management System

## Overview

The Employee Management System is a full-stack CRUD application designed for companies to manage their employee data efficiently. The application allows users to list, add, update, and delete employee records through a user-friendly interface.

---

## Features

- **Add Employees**: Easily add new employees to the database.
- **View Employees**: Display a list of all employees with their details.
- **Update Employees**: Modify existing employee information.
- **Delete Employees**: Remove employees from the system.

---

## Technologies Used

### Frontend
- Angular 10
- HTML5, CSS3, Bootstrap 5

### Backend
- Spring Boot (Java)

### Database
- MySQL

---

## Setup and Installation

### Prerequisites
- Node.js and Angular CLI installed
- Java JDK 11 or later
- MySQL Server installed and running

### Backend Setup
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd employee-management-backend
   ```
2. Update the `application.properties` file with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```
3. Build and run the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```

### Frontend Setup
1. Navigate to the frontend directory:
   ```bash
   cd employee-management-frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the Angular application:
   ```bash
   ng serve
   ```
4. Open your browser and navigate to `http://localhost:4200`.

---

## API Endpoints

| HTTP Method | Endpoint             | Description                  |
|-------------|----------------------|------------------------------|
| GET         | `/api/employees`     | Fetch all employees          |
| POST        | `/api/employees`     | Add a new employee           |
| PUT         | `/api/employees/:id` | Update an existing employee  |
| DELETE      | `/api/employees/:id` | Delete an employee by ID     |

---

## UI Screenshot
Include screenshots of the application once built.

---

## License
This project is licensed under the MIT License.