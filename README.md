# GraalVM Java-Node.js Integration Example

This repository demonstrates how to call a Node.js library from a Java application using GraalVM. The project uses the Lodash library as an example.

## Prerequisites

- GraalVM installed
- Maven installed

## Setup

1. Clone the repository:

    ```sh
    git clone https://github.com/slingr-stack/graalvm-java-node-example.git
    cd graalvm-java-node-example
    ```

2. Install Node.js dependencies:

    ```sh
    cd src/main/resources
    npm install
    cd ../../../
    ```

3. Build the project:

    ```sh
    mvn clean install
    ```

4. Run the application:

    ```sh
    mvn exec:java -Dexec.mainClass="com.example.NodeJsExample"
    ```

## Project Structure

- `src/main/java/com/example/NodeJsExample.java`: Java code to call the Node.js library.
- `src/main/resources/package.json`: Node.js dependencies.
- `pom.xml`: Maven configuration file.