package String;
public class NullPointerExceptionDemo {

    // Method to generate Exception
    static void generateException() {
        String text = null;  // initialized to null
        System.out.println("Length of text: " + text.length()); // Exception occurs here
    }

    // Method to handle Exception
    static void handleException() {
        String text = null;  // initialized to null

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Reason: Attempted to access a method on a null object.");
        }
    }

    public static void main(String[] args) {

        // Calling method that generates exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException()");
        }

        System.out.println("\nHandling NullPointerException:");
        // Calling method that handles exception
        handleException();
    }
}
