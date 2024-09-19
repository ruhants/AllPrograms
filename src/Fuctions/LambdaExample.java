package Fuctions;
public class LambdaExample {
    public static void main(String[] args) {
 int number = 10; // Effectively final variable

        
        Runnable runnable = () -> {
            System.out.println("Number: " + number);
        };
        
        runnable.run();
    }
}
