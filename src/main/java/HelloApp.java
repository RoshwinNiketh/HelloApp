/**
 * HelloApp.java - A Java application that greets the user by name or 
 * defaults to "World".
 *
 * This is the third step in the HelloApp journey (UC3). The application
 * handles command-line arguments to personalize the greeting. It improves 
 * upon UC2 by initializing a default name and updating it only if an 
 * argument is present, reducing code duplication and ensuring robustness.
 *
 * @author Developer Name
 * @version 3.0
 */

/**
 * Key Java Concepts Used:
 * 1. Variable Initialization - Setting a default string value
 * 2. Conditional Logic - Overriding the default if input is detected
 * 3. Array Indexing - Accessing command-line arguments securely
 * 4. DRY Principle - Reducing duplicate print statements
 */
public class HelloApp {
    public static void main(String[] args) {
        // Initialize with the default value
        String name = "World";

        // Check if the user provided an argument
        if (args.length > 0) {
            // Override the default with the user's input
            name = args[0];
        }

        // Print the final greeting (executes only once)
        System.out.println("Hello, " + name + "!");
    }
}