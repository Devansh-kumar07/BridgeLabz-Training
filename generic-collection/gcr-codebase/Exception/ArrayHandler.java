public class ArrayHandler {
    public static void main(String args) {
        int numbers = null; 
        int index = 2; 
          try {
               int value = numbers[index]; 
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
                 System.out.println("Invalid index!");
        } catch (NullPointerException e) {
                 System.out.println("Array is not initialized!");
        }
    }
}