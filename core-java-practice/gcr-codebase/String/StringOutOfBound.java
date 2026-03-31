package String;

public class StringOutOfBound {

	public static void main(String[] args) {
		System.out.println("generating IndexOutOfBoundsException");
        try {
        	generateException();
        }catch(Exception e) {
        	System.out.println("Exception occurred in generateException()");
        }
        System.out.println("\nHandling IndexOutOfBoundsException:");
        // Calling method that handles exception
        handleException();
	}
	
	static void generateException() {
		String text = "dev";
		int i=4;
		char storingText = text.charAt(i);
		System.out.println("trying to store char beyond length:"+storingText);// exception generated here
	}
	static void handleException() {
		String text = "dev";
		int i=4;
		
		try {
			char storingText = text.charAt(i);
			System.out.println( "trying to store char beyond length:"+storingText);
		}catch(IndexOutOfBoundsException e) {
			  System.out.println("IndexOutOfBoundsException caught!");
	            System.out.println("Reason: Attempted to access a method on a oversized object.");
		}
	}
	
}
