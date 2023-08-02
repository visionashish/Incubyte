# Chandrayaan3 Mission

Welcome to the Chandrayaan3 Mission! This project simulates the movement of a rover on the moon's surface using simple commands.

## Table of Contents

- [Introduction](#introduction)
- [Installation and Setup](#installation-and-setup)
- [Usage](#usage)
- [Testing](#testing)
- [Contributing](#contributing)

## Introduction

The Chandrayaan3 Mission is a Java-based project that simulates the movement of a lunar rover. The rover can move forward, backward, turn left, turn right, and change its orientation vertically.

## Installation and Setup

To run this project locally, follow these steps:

1. Clone the repository to your local machine:

git clone https://github.com/your-username/Chandrayaan3.git

2. Navigate to the project directory:

cd Chandrayaan3

3. Build the project using Maven:

mvn clean package


## Usage

The `Chandrayaan3` class contains methods to move the rover and change its orientation. You can customize the rover's movement by providing a sequence of commands using the `executeCommands(char[] commands)` method.

```java
public class Main {
 public static void main(String[] args) {
     Chandrayaan3 chandrayaan3 = new Chandrayaan3();
     char[] commands = {'f', 'r', 'u', 'b', 'l'};
     chandrayaan3.executeCommands(commands);

     // Output the final position and direction
     System.out.println("Final Position: (" + chandrayaan3.getX() + ", " + chandrayaan3.getY() + ", " + chandrayaan3.getZ() + ")");
     System.out.println("Final Direction: " + chandrayaan3.getDirection());
 }
}


Testing
The project includes JUnit tests to ensure the correctness of the rover's movement and orientation. To run the tests, use the following command:

mvn test


Contributing
We welcome contributions from the community! If you have any bug fixes, improvements, or new features to propose, please follow these steps:

Fork the repository to your GitHub account.
Create a new branch with a descriptive name.
Make your changes and commit them.
Push the changes to your forked repository.
Submit a pull request, explaining the changes you've made.
We appreciate your contributions!

