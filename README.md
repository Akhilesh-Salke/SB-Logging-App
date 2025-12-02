
**Spring Boot Logging Demo**

A simple Spring Boot application demonstrating logging using SLF4J and Logback.
It shows how to log messages at different levels like DEBUG, INFO, and ERROR while handling exceptions.

_🛠 Tech Stack_
Technology	Version
Java	17
Spring Boot	3.x
Logging	SLF4J + Logback
Build Tool	Maven
IDE	Eclipse / IntelliJ
📌 Features

REST API endpoint with logging enabled

Demonstrates different logging levels

Exception logging using try-catch

Simple and beginner-friendly example

📂 Project Structure
src/main/java
 └── in.akhilesh
     └── MsgRestController.java

src/main/resources
 └── application.properties

pom.xml

🚀 How to Run the Project
1️⃣ Clone the repository
git clone https://github.com/<your-username>/<repo-name>.git

2️⃣ Move into project folder
cd <repo-name>

3️⃣ Run the application
mvn spring-boot:run


or simply run Application.java from your IDE.

🌐 Test the REST API

Open browser / Postman and enter:

http://localhost:8080/welcome


You will receive a string response:

Welcome to First Spring Application


Logs will be visible in the console (and file if configured).

🧪 Controller Logging Example
logger.debug("method started");
logger.info("method executed successfully");
logger.error(e.getMessage());


This project intentionally triggers a NullPointerException to show error logging inside the catch block.

🔧 Dependencies Used
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>


Spring Boot starter already includes SLF4J and Logback.

📈 Future Enhancements

Add custom logging pattern (logback.xml)

Save logs into files with rotation policy

Integrate monitoring tools (ELK / Splunk)

🙌 Contributing

Contributions are welcome!
Feel free to fork and enhance the project.
