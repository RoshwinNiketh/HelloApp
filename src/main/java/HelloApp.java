/**
 * HelloApp.java - A Java application that personalizes a greeting using
 * command-line arguments.
 *
 * This is the second step in the HelloApp journey (UC2). The application
 * has been upgraded from a static message to accept a user's name passed 
 * at runtime. It evaluates the command-line arguments array (args) and uses 
 * conditional logic to print a personalized "Hello, [Name]!" message. If no 
 * argument is provided, it safely defaults to the classic "Hello, World!".
 *
 * @author Developer Name
 * @version 2.0
 */

/**
 * Key Java Concepts Used:
 * 1. Class Declaration - Defines a blueprint for objects
 * 2. Main Method - Entry point for program execution
 * 3. String Argument Array - Command-line arguments parameter
 * 4. Conditional Logic (if/else) - Decision making based on input
 * 5. Array Indexing - Accessing specific data in an array (args[0])
 * 6. String Concatenation - Combining text strings and variables
 * 7. System.out.println() - Standard output stream for printing
 */
public class HelloApp {
    public static void main(String[] args) {
        // Check if at least one argument was provided by the user
        if (args.length > 0) {
            // Retrieve the first argument (the user's name)
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback default message if no arguments are passed
            System.out.println("Hello, World!");
        }
    }
}