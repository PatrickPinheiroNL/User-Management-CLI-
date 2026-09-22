# User Management CLI

A simple command-line user management application built with Java to practice object-oriented programming, collections, and CRUD operations.

This project is being developed incrementally as part of my Java backend learning journey, with a focus on understanding core Java concepts before moving into frameworks such as Spring Boot.

## Features

* Create users
* List users
* Find users by ID
* Update users
* Delete users
* In-memory data storage
* Interactive command-line interface

> **Current status:** The project is under development. Features are being implemented progressively as part of the learning process.

## Technologies

* Java
* IntelliJ IDEA
* Git
* GitHub

No external database or framework is currently used. User data is stored in memory using Java collections.

## Project Structure

```text
src/
├── Main.java
├── User.java
└── UserManager.java
```

### `Main.java`

Responsible for the application entry point and command-line interface.

It handles:

* Menu display
* User input
* Menu navigation
* Calling the appropriate `UserManager` operations

### `User.java`

Represents a user in the application.

The class contains:

* `id`
* `name`
* `email`
* `password`

It also provides constructors, getters, and setters to practice encapsulation.

### `UserManager.java`

Responsible for managing users and performing operations on the user collection.

It currently handles:

* User creation
* User listing
* User search by ID

Additional CRUD operations will be implemented as the project progresses.

## Concepts Practiced

This project focuses on building a solid foundation in Java and object-oriented programming.

### Object-Oriented Programming

* Classes and objects
* Constructors
* Encapsulation
* Access modifiers
* Getters and setters
* Methods
* Object references
* `this` keyword

### Collections

* `List`
* `ArrayList`
* Iterating with `for-each`

### Control Flow

* `if / else`
* `switch`
* `while`
* Boolean conditions

### Methods

* Parameters
* Return types
* Returning objects
* `null`
* Method responsibilities

## Example

Creating users:

```java
manager.createUser(1, "Patrick", "patrick@gmail.com", "password123");
manager.createUser(2, "Ingrid", "ingrid@gmail.com", "password456");
```

Finding a user by ID:

```java
User foundUser = manager.getElementById(2);

System.out.println(foundUser.getName());
```

## Roadmap

The project will evolve gradually as new Java concepts are introduced.

* [x] Create `User` class
* [x] Create `UserManager`
* [x] Create users
* [x] Store users using `ArrayList`
* [x] List users
* [x] Find user by ID
* [ ] Update user
* [ ] Delete user
* [ ] Improve input validation
* [ ] Handle invalid user searches
* [ ] Introduce `Map`
* [ ] Practice basic Streams
* [ ] Introduce `Optional`
* [ ] Add unit tests
* [ ] Refactor the application
* [ ] Add persistent storage
* [ ] Migrate the backend to Spring Boot

## Purpose

The main goal of this project is not to build a production-ready application, but to develop a strong understanding of Java fundamentals through practical implementation.

The project is intentionally being built step by step, with each feature reinforcing concepts that will later be used in Java backend development and Spring Boot applications.

## Author

**Patrick Freitas Pinheiro**

Computer Science student focused on Java backend development.
