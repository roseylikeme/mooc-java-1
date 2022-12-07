
public class AdvancedAstrology {

    public static void printStars(int number) {
        String str = "*";
		int n=number;
		String repeated = new String(new char[n]).replace("\0", str);
		System.out.print(repeated);
        System.out.println("");
    }

    public static void printSpaces(int number) {
        String str = " ";
		int n=number;
		String repeated = new String(new char[n]).replace("\0", str);
		System.out.print(repeated);
    }

    public static void printTriangle(int size) {
        int i = size; // width of triangle at base
        int j = 1; 
        while(j<=i){
            printSpaces(i-j);
            printStars(j);
            j++;
//            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
