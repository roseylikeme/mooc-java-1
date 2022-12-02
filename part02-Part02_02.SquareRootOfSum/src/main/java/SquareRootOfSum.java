
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Write a program that reads two integers from the user and prints
        //the square root of the sum of these integers. 
        //The program does not need to work with negative values.
        
        // Grab two ints
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        // Sqrt of two ints
        double squareRoot = Math.sqrt(first + second);
        // Print out 
        System.out.println(squareRoot);
    }
}
