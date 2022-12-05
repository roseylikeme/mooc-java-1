
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break; // If number is 0, break out of loop
            } else if (num < 0){
                System.out.println("Unsuitable number"); // If num is negative number then print.
            } else {
                System.out.println(num*num); // If num is positive number return num^2
            }
        }
    }
}
