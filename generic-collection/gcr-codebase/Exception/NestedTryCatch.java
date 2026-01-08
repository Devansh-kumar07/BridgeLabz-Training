public class NestedTryCatch {
    public static void main(String args) {
        int numbers = {10, 20, 30};
        int index = 1; 
        int divisor = 0; 
             try {
            System.out.println("Trying to access array element at index: " + index);
            int element = numbers[index]; 

            try {
                System.out.println("Trying to divide by: " + divisor);
                int result = element / divisor; 
                System.out.println("The result is: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}