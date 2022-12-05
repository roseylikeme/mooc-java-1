
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        double avg = 0;
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            if (num > 0){
                count = count + 1; // adds up how much numbers input
                sum = sum + num; // adds up numbers total
            }
        }
        if (count == 0){
            System.out.println("Cannot calculate the average");
        } else{
            avg = 1.0 * sum / count;
            System.out.println(avg);
        }
    }
}
