
# Singleton Design Pattern Example

## Overview

This project demonstrates the use of the Singleton design pattern in Java. The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

## Table of Contents

1. [Introduction](#introduction)
2. [Installation](#installation)
3. [Usage](#usage)
4. [Code Structure](#code-structure)
5. [Example](#example)
6. [Contributing](#contributing)
7. [License](#license)

## Introduction

The Singleton design pattern is used to restrict the instantiation of a class to one single instance. This is useful when exactly one object is needed to coordinate actions across the system. The Singleton pattern involves a single class that is responsible for creating an instance of itself and ensuring that no other instance is created.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/singleton-example.git
    ```
2. Navigate to the project directory:
    ```bash
    cd singleton-example
    ```
3. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).

## Usage

To run the example, execute the `main` method in the `Demo` class.

## Code Structure

- `Singleton`: The class implementing the Singleton pattern.
- `Demo`: The main class that demonstrates the use of the Singleton pattern.

## Example

### Singleton

#### `Singleton.java`
```java
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```


## images

![Screenshot 2024-06-06 090322](https://github.com/Sandaluthushan20/Design-Patternn/assets/108582011/77e20b56-bc46-4426-bb62-8ae0d28aff94)
