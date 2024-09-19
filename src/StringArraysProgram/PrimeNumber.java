package StringArraysProgram;

public class PrimeNumber {
	
	public static void main(String[] args) {
        int number = 8;
        int count = 0;

        for (int i = 2; i < number; i++) { 
            if (number % i == 0) {
                count++;
                
            }
        }

        if (count == 0) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}