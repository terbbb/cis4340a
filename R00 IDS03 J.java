/******************************************************************************
 *  Compilation:  javac Cis4340.java
 *  Execution:    java Cis4340
 *
 *  Prints 
 *    "Hello, World - from the class of cis4340 - Spring 2024 - UCF Bret Geyer".
 *  By tradition, this is everyone's first program.
 *
 * Revision History:
 *   % java Cis4340
 *  Hello, World - from the class of cis4340 - Spring 2024 - UCF Bret Geyer
 *  %
 *
 ******************************************************************************/

import java.util.regex.Pattern;

public class Cis4340 {

    public static void main(String[] args) {
        System.out.println("Hello, World – from the class of cis4340 – Spring 2024 – UCF Bret Geyer");

        // Example usage
        String username = "untrusted input";
        boolean loginSuccessful = false; 
        if (loginSuccessful) {
            System.out.println("User login succeeded for: " + sanitizeUser(username));
        } else {
            System.out.println("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("^[a-zA-Z0-9_]+$", username) ? username : "unauthorized user";
    }
}
