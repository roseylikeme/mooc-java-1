
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        // Keeps asking for numbers until number -1 is given
        System.out.println("Give numbers");
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            } else if (num%2 == 0){
                even += 1;
            } else{
                odd += 1;
            }
            sum += num; // totals up each num input
            count += 1; // counts how much numbers were given
            
            
        }
        avg = 1.0*sum/count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
