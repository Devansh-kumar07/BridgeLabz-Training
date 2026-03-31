public class ExceptionPropagation {
      public static void method1() {
        System.out.println("Executing method1...");
             int result = 10 / 0; 
    }

    public static void method2() {
        System.out.println("Executing method2, calling method1...");
        method1(); 
    }

    public static void main(String args) {
        System.out.println("Executing main, calling method2...");
        try {
            method2(); 
        } catch (ArithmeticException e) {
             System.out.println("Handled exception in main");
        }
        System.out.println("Program continues normally...");
    }
}