public class PalindromeCheckerApp {

    // Main method - Entry point
    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check palindrome using if-else
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        // Exit message
        System.out.println("Program execution completed.");
    }
}