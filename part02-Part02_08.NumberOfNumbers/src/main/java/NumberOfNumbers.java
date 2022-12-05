
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0; // tracks how much numbers given
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0){
                break; // if num = 0; break out of loop and count how much num given
            } else {
                count = count + 1; // if a num other than 0 given, increase num count
            }
        }
        System.out.println("Number of numbers: " + count);
    }
}
