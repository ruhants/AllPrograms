package StringArraysProgram;

public class Recursive {
    
    // Recursive method to print table of 11
    public static void printTable(int num, int multiplier) {
        if (multiplier > 10) {  
            return;
        }
        
        System.out.println(num + " x " + multiplier + " = " + (num * multiplier));
        printTable(num, multiplier + 1);
    }

    public static void main(String[] args) {
        int num = 11;
        printTable(num, 1);  
    }
}

