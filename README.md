# Kdrama-API

Kdrama-API is a backend application designed to manage and provide information on various Korean dramas (Kdramas). 
This RESTful API allows users to retrieve, add, and delete Kdrama listings from a self-managed database, showcasing backend development capabilities with client-server interactions and modern web technologies.

## Screenshots

Below are screenshots demonstrating the API responses and how they appear when accessed through a web browser:

<img width="1065" alt="Screenshot 2024-07-25 at 12 34 39 PM" src="https://github.com/user-attachments/assets/82a4c3d3-517c-4bdb-89d2-febc08b41921">
<img width="953" alt="Screenshot 2024-07-25 at 12 34 59 PM" src="https://github.com/user-attachments/assets/ebfa06bd-62a4-4be2-b903-9d115d758be4">
<img width="951" alt="Screenshot 2024-07-25 at 12 35 14 PM" src="https://github.com/user-attachments/assets/6e9783b3-625d-4004-a636-71dbbf69439c">

*This screenshots shows the JSON response from the API when listing all Kdramas. It includes details like ID, title, release date, and links to posters and trailers.*



## Technologies Used
- **Java**: Core programming language
- **Spring Boot**: Framework for creating stand-alone, production-grade Spring based applications easily
- **Maven**: Dependency management
- **Spring Data JPA**: To persist data in SQL stores with Java Persistence API using Spring Data and Hibernate
- **Spring Web**: Build web, including RESTful, applications using Spring MVC
- **MySQL**: Database for storing Kdrama details
- **Postman**: Tool used for API testing and interacting with RESTful services

## Features
- **Retrieve Kdrama Details**: Users can get details about Kdramas including titles, release dates, and links to trailers.
- **Add New Kdramas**: Users can add new Kdramas to the database.
- **Delete Existing Kdramas**: Users can remove Kdramas from the database.

## Installation

### Prerequisites
- Java JDK 11 or later
- Maven
- MySQL Server and Workbench

### Setup
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/Kdrama-API.git
   cd Kdrama-API

2.	Configure MySQL
	•	Open MySQL Workbench and create a new schema named kdrama.
	•	Update the src/main/resources/application.properties file with your MySQL username and password.
3.	Run the Application
	•	Build the project with Maven:
                               mvn clean install
•	Start the application:
                               mvn spring-boot:run
	4.	Populate the Database[Uploading kdorama-list.json…]()

	•	Use the kdorama-list.json file to populate your database with initial data:

Usage

Access the API endpoints through:

	•	List all Kdramas: GET http://localhost:8080/api/doramas
	•	Add a Kdrama: POST http://localhost:8080/api/doramas
	•	Delete a Kdrama: DELETE http://localhost:8080/api/doramas/{id}

For full API usage, please refer to the Postman collection included in the repository.

License

This project is licensed under the MIT License - see the LICENSE.md file for details.
Contact

	•	GitHub: laylopardayeva
	•	Email: laylopardayeva2005@gmail.com
