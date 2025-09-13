# SRP Practice - SOLID Principles

This repository shows the difference between a program written without applying SOLID principles and the same program refactored by applying the **Single Responsibility Principle (SRP)**.  
It includes evidence of the code **Before** (everything in a single class) and **After** (modular code with separated responsibilities), as well as output files (`users.txt`, `app.log`).  
The objective is to demonstrate how SRP improves readability, maintainability, and scalability in software projects.

---

## 📌 Project Description

In software development, it is common to start by writing programs in a very compact way, usually putting all the logic inside a single file or class.  
While this approach might work for very small programs, it quickly becomes problematic when the software grows or needs to be maintained by different developers.

This repository provides a simple but clear example of how applying the **Single Responsibility Principle (SRP)**, one of the five SOLID principles, can improve the structure and quality of the code.  

- **Before (Without SRP):**  
  The program handles multiple tasks in a single class: creating users, saving them to a file, sending emails, and logging actions. This design violates SRP because the class has more than one responsibility.

- **After (With SRP):**  
  The same program is refactored into several smaller classes, each with only one responsibility:  
  - `User` → Represents user data.  
  - `UserRepository` → Responsible for saving users to a file.  
  - `EmailService` → Responsible for sending emails.  
  - `Logger` → Responsible for writing logs.  
  - `UserRegistrationService` → Orchestrates the registration process.  
  - `Main` → Entry point of the application.  

By separating concerns, the code becomes easier to understand, test, and maintain. If a change is needed in how logs are stored, for example, it can be done in the `Logger` class without affecting the rest of the system. This modularity is exactly what SRP encourages and is a fundamental step toward professional software design.

---

## 📊 ASCII Diagram: Before vs After

```text
BEFORE (No SRP)
--------------------------------
+-------------------------------+
|           Main.java           |
|-------------------------------|
| - Create user                 |
| - Save to file                |
| - Send email                  |
| - Write logs                  |
+-------------------------------+

AFTER (With SRP)
--------------------------------
+--------------------+     +--------------------+
|       User         |     |  UserRepository    |
| (represents data)  |     | (saves to file)    |
+--------------------+     +--------------------+
           |                          ^
           v                          |
+--------------------+     +--------------------+
|   EmailService     |     |       Logger       |
| (sends emails)     |     | (writes logs)      |
+--------------------+     +--------------------+
           ^                          ^
           |                          |
           +-----------+--------------+
                       |
                       v
         +----------------------------+
         |  UserRegistrationService   |
         | (coordinates the process)  |
         +----------------------------+
                       |
                       v
              +-----------------+
              |      Main       |
              | (entry point)   |
              +-----------------+

```

## ✍️ Author: [Himer Jerly Condor Luna]
## 📅 Email: jerly.condor@gmail.com
