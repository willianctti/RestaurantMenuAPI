# Restaurant API

Welcome to **Restaurant API**! This project is a Java-based web application built using Spring Web, Lombok, and JPA. The aim of this project is to 
study and review what I already know in Java!

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Usage](#usage)

## Introduction

**Restaurant** is designed to study. With a simple backend powered by Spring Web and JPA. 

## Features

- **Feature 1**: Get in all foods available in a restaurant
- **Feature 2**: Make a post on the api
- **Feature 3**: I will integrate with the front end soon!

## Technologies Used

- **Java**: The core programming language used.
- **Spring Web**: Framework for building the web layer.
- **Lombok**: For reducing boilerplate code.
- **JPA (Java Persistence API)**: For handling database operations.

## Getting Started

### Prerequisites

Ensure you have the following installed on your machine:

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL/PostgreSQL](https://www.mysql.com/downloads/)

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/willianctti/RestaurantMenuAPI.git
   cd restaurant

2. **Configure the database:**
   Update the application.properties file with your database configuration.
   
  spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
  spring.datasource.username=yourusername
  spring.datasource.password=yourpassword
  spring.jpa.hibernate.ddl-auto=update

3. **Usage**
   Once the application is running, you can access it at http://localhost:8080. The API endpoints available include:
    GET && POST 
