Catalog Management System
This is a Spring Boot application for managing a catalog of products, with functionality for CRUD operations, searching, and filtering by various attributes. This project uses MySQL for data persistence and includes endpoints for interacting with product data.

Table of Contents
Features
Technologies Used
Getting Started
Prerequisites
Setup and Configuration
Running the Application
API Endpoints
Create a Product
Get All Products
Get Product by ID
Update Product by ID
Delete Product by ID
Search Products by Name
Filter Products by Brand
Filter Products by Category
Filter Products by Price Range
Version and Dependencies
Additional Notes
Features
CRUD operations for managing product data
Search by product name (partial match)
Filter products by brand, category, and price range
Data validation with clear error responses
Centralized exception handling
Logging using SLF4J/Logback
Technologies Used
Java 17
Spring Boot 3.x
Spring Data JPA
MySQL
SLF4J for logging
Jakarta Bean Validation (for input validation)
Getting Started
Prerequisites
Java 17: Install from Java Downloads.
MySQL: Install MySQL and create a database.
Postman or cURL (optional): For testing API endpoints.
Setup and Configuration
Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/catalog-management-system.git
cd catalog-management-system
Configure MySQL:

Open src/main/resources/application.properties.
Update the MySQL configuration:
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/catalogdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
Install Dependencies:

Use Maven to install the required dependencies.
bash
Copy code
mvn clean install
Running the Application
Start the Spring Boot application with Maven:

bash
Copy code
mvn spring-boot:run
The application should start on http://localhost:8080.

API Endpoints
1. Create a Product
URL: POST /api/products
Description: Adds a new product to the catalog.
Request Body:
json
Copy code
{
  "name": "Smartphone",
  "brand": "BrandY",
  "description": "Latest model with advanced features",
  "price": 799.99,
  "quantity": 25,
  "category": "Electronics"
}
Response: Returns the created product with 201 Created status.
2. Get All Products
URL: GET /api/products
Description: Retrieves a list of all products.
Response: Returns a JSON array of products with 200 OK status.
3. Get Product by ID
URL: GET /api/products/{id}
Description: Retrieves a specific product by its ID.
Response: Returns the product with 200 OK or 404 Not Found if the product does not exist.
4. Update Product by ID
URL: PUT /api/products/{id}
Description: Updates an existing product by its ID.
Request Body: JSON payload with the updated product details.
Response: Returns the updated product with 200 OK.
5. Delete Product by ID
URL: DELETE /api/products/{id}
Description: Deletes a product by its ID.
Response: Returns 204 No Content if successful.
6. Search Products by Name
URL: GET /api/products/search?name={name}
Description: Searches for products by a partial name match (case-insensitive).
Response: Returns matching products with 200 OK.
7. Filter Products by Brand
URL: GET /api/products/filter/brand?brand={brand}
Description: Filters products based on the brand name.
Response: Returns matching products with 200 OK.
8. Filter Products by Category
URL: GET /api/products/filter/category?category={category}
Description: Filters products based on the category.
Response: Returns matching products with 200 OK.
9. Filter Products by Price Range
URL: GET /api/products/filter/price?minPrice={minPrice}&maxPrice={maxPrice}
Description: Filters products within the specified price range.
Response: Returns matching products with 200 OK.
Version and Dependencies
Spring Boot Version: 3.x
Additional Dependencies:
spring-boot-starter-data-jpa
spring-boot-starter-web
spring-boot-starter-validation
mysql-connector-java
spring-boot-starter-logging (default)
Additional Notes
Exception Handling: This application uses a GlobalExceptionHandler to return structured error responses for various exceptions.
Logging: SLF4J with Logback is configured for logging.
Data Validation: The application validates incoming data using Jakarta Bean Validation annotations, returning detailed error responses for invalid inputs.
For more information or troubleshooting, please refer to the Spring Boot documentation.
