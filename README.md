# 📘 Book Library JDBC App
A simple Java console application that connects to MySQL using JDBC and performs **CRUD (Create, Read, Update, Delete)** operations on a `books` table.

## 🚀 Features
- Connects to MySQL database (`library`)
- Inserts a new book record via console input
- Displays all books in the table
- Easily expandable to include update/delete functionality

## 🛠️ Tech Stack
- Java (JDK 8 or higher)
- JDBC API
- MySQL Server
- MySQL Workbench (for DB visualization)

## 🧑‍💻 Setup Instructions

### 📌 Step 1: Create MySQL Database & Table

1. Open MySQL Workbench
2. Run the following SQL:

```
CREATE DATABASE library;
USE library;

CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    year INT
);
````

---

### ⚙️ Step 2: Add JDBC Driver

1. Download **MySQL Connector/J**: [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)
2. Place the JAR file (e.g., `mysql-connector-java-8.0.xx.jar`) inside the `lib` folder.

---

### 👨‍💻 Step 3: Run the Java Program
#### 🟢 Compile:
```
javac -cp "lib/*" -d bin src/day6/BookManager.java
```
#### ▶️ Run:
```
java -cp "bin;lib/*" day6.BookManager
```
> Replace `;` with `:` in the classpath if you're on Linux/macOS.
---

## ✅ Sample Output
```
Enter Book Title: Atomic Habits
Enter Author: James Clear
Enter Year: 2018

Book inserted!

Current Book Records:
1 | Atomic Habits | James Clear | 2018
```


