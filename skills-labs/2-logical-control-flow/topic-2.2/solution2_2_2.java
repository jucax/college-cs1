import java.util.Scanner;
public class solution2_2_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSpaces = scanner.nextInt();
        int i = 0;

        System.out.print("*");

        while(i < numSpaces){
            System.out.print(" ");
            i++;
        }

        System.out.print("*");
    }
}