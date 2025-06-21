# Daily Log 📝

**Daily Log** is a simple yet powerful journaling web application built with Spring Boot. It lets users create, view, update, and delete daily journal entries with ease.

## 🚀 Features

- CRUD operations for journal entries via RESTful API
- Entry structure includes date, title, and content
- Data persistence with H2 in-memory database (switchable to MySQL/PostgreSQL)
- Spring Boot starter setup for easy deployment
- Follows best practices such as layered architecture and DTO mapping

## 💾 Prerequisites

- Java 17+ (OpenJDK or Oracle)
- Maven 3.6+ installed globally
- (Optional) MySQL/PostgreSQL if switching from H2 to an external DB


## 🛠️ Getting Started

### 1. Clone the repo

```bash
git clone https://github.com/Khushi0389/DailyLog.git
cd journalApp

2. Build & Run
# Build the application
mvn clean install

# Run with Maven
mvn spring-boot:run

# Or run the built JAR
java -jar target/journalApp-0.0.1-SNAPSHOT.jar
The app runs on http://localhost:8080.

📚 API Usage
All endpoints accept and return JSON.

Method	Endpoint	Description
GET	/entries: 	List all journal entries
GET	/entries/{id}: 	Get a single entry by ID
POST	/entries: 	Create a new entry
PUT	/entries/{id}: 	Update an existing entry
DELETE	/entries/{id}: 	Delete an entry by ID

Example: Creating an Entry
Request:
POST /entries
{
  "title": "My First Entry",
  "content": "Today I started building Daily Log.",
  "entryDate": "2025-06-22"
}
Response:
{ "id": 1, "title": "My First Entry", "content": "...", "entryDate": "2025-06-22" }

🧪 Testing
Basic unit tests are included using Spring Boot Test:
mvn test
🔧 Switching Database
By default, the app uses H2 (file-based). To use MySQL or PostgreSQL:

Add the proper driver dependency in pom.xml.

Update application.properties like:
spring.datasource.url=jdbc:mysql://localhost:3306/dailylog
spring.datasource.username=root
spring.datasource.password=secret
spring.jpa.hibernate.ddl-auto=update
Remove or comment out the H2 config.

