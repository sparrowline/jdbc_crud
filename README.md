# Java JDBC CRUD Operations

![Java](https://img.shields.io/badge/Java-1.8-blue)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![JDBC](https://img.shields.io/badge/JDBC-4.2-blue)

This repository contains a Java program that demonstrates CRUD (Create, Read, Update, Delete) operations using JDBC (Java Database Connectivity) with MySQL. It serves as a foundational guide for implementing database interactions within Java applications.

## Features

- **Create:** Insert new records into the database.
- **Read:** Retrieve and display records from the database.
- **Update:** Modify existing records in the database.
- **Delete:** Remove records from the database.

## Prerequisites

- Java Development Kit (JDK) 1.8 or higher
- MySQL Database Server 8.0 or higher
- MySQL Connector/J (JDBC Driver)

## Setup

1. Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/your-username/java-jdbc-crud.git
```

2. Open the project in your favorite Java IDE (Eclipse, IntelliJ, etc.).

3. Ensure that you have the MySQL Connector/J (JDBC Driver) added to your project's build path.

4. Configure the database connection properties in the `config.properties` file, located in the `src` folder. Provide your MySQL database URL, username, and password.

## Usage

1. The `CRUDOperations` class contains the main method to execute the CRUD operations. Run this class to interact with the database.

2. The program will present you with a menu to select the desired operation (Create, Read, Update, or Delete).

3. Follow the on-screen instructions to perform the respective operation. For example, if you choose to create a new record, you will be prompted to enter the record details.

4. The program will handle the database connections and execute the selected operation accordingly.

## Database Schema

The program assumes a simple database schema with a single table named `employees`. Modify the database schema and the corresponding Java classes as per your project requirements.

## Sample Data

A few sample records are already inserted into the database for testing purposes.

## Contributions

Contributions to this project are welcome. If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.


