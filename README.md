📦 Item Management REST API (Java – Spring Boot)
📌 Overview

This is a simple Java backend REST API built using Spring Boot.
The application manages a collection of items (similar to an e-commerce product list).

Data is stored in memory using ArrayList

No database is used

APIs are tested using Postman

**Live Demo**
Render Live Demo Link: https://item-api-e0xy.onrender.com/

**🛠 Technologies Used**

Java 21

Spring Boot

Maven

Spring Web

Bean Validation (jakarta.validation)

IntelliJ IDEA

▶️ How to Run the Application
Step 1: Open Project

Open IntelliJ IDEA

Open the project folder

Step 2: Run Application

Open ItemApiApplication.java

Click Run (▶)

Step 3: Server Starts

Application will start on:

http://localhost:8080
📮 Testing APIs Using Postman
🔹 1. Add New Item (POST API)

Endpoint

POST http://localhost:8080/api/items

Headers

Content-Type: application/json

Body (raw → JSON)

{
  "name": "iPhone 15",
  "description": "Apple smartphone",
  "price": 79999
}

Success Response (200 OK)

{
  "id": 1,
  "name": "iPhone 15",
  "description": "Apple smartphone",
  "price": 79999
}
🔹 2. Get Item by ID (GET API)

Endpoint

GET http://localhost:8080/api/items/1

Success Response (200 OK)

{
  "id": 1,
  "name": "iPhone 15",
  "description": "Apple smartphone",
  "price": 79999
}

If Item Not Found (404)

404 Not Found
✅ Input Validation Rules

While adding a new item:

name → required

description → required

price → required

❌ Example Invalid Request
{
  "name": "",
  "description": "",
  "price": null
}
❌ Validation Error Response
400 Bad Request
🧠 Important Notes

Data is stored in ArrayList, so it will be cleared when application restarts

No database is used as per task requirement

Application follows RESTful API design

Service & Controller layers are used for clean architecture

📁 Project Structure
src/main/java/com/example/itemapi
│
├── controller   → REST API endpoints
├── model        → Item class
├── repository   → In-memory ArrayList storage
├── service      → Business logic
└── ItemApiApplication.java
**🧪 Tools Used for Testing**

Postman for API testing

IntelliJ IDEA for development
