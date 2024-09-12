# Calculator Implementation

This implementation provides a simple, extensible calculator in Java that supports multiple operations.

## Design Decisions

* I have used an enum to define the operations to ensure type safety and ease of extension.
* i have used an `EnumMap` to store operation handlers, allowing for efficient lookup and registration of new operations.
* Implemented a functional interface `OperationHandler` to handle each operation, enabling easy addition of new operations.
* Designed the `Calculator` class to be IoC-compatible, allowing for external management of dependencies.

## Assumptions

* The calculator will only perform operations on two numbers at a time.
* The `chainOperations` method will always receive at least one operation.

## Future Improvements

* Add support for more advanced operations (e.g., modulo, exponentiation).
* Implement a more robust error handling mechanism.
* Consider using a more efficient data structure for storing operation handlers.

## Tools and Technologies

* Java 17
* Log4j2 for logging
* Maven for build management
* JUnit 5 for unit testing

## Future Improvement Possibilities:

* Support for more advanced operations: Add support for operations like modulo, exponentiation, roots, etc.
* Error handling: Implement a more robust error handling mechanism to handle edge cases and invalid inputs.
* User interface: Create a graphical user interface (GUI) or a web-based interface for easier user interaction.
* Performance optimization: Optimize the code for better performance and efficiency.
* Support for multiple data types: Allow the calculator to handle different data types, such as integers, floats, and complex numbers.
* History and memory functions: Add features to store and recall previous calculations and results.
* Unit tests and integration tests: Expand the test suite to cover more scenarios and edge cases.

## Tools and Technologies Used:

* Java 17: The latest version of the Java programming language.
* Log4j2: A popular logging framework for Java.
* Maven: A build automation tool for managing dependencies and building the project.
* JUnit 5: A testing framework for unit testing and integration testing.
* EnumMap: A data structure used to store operation handlers.
* Functional interfaces: Used to define operation handlers.

##  Note that this is not an exhaustive list, and there are many other tools and technologies that could be used to improve and extend the calculator project.
