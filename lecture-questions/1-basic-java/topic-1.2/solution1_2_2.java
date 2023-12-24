import java.util.Scanner;
public class solution1_2_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int lastDigit = num % 10;

        System.out.println(lastDigit); 
    }
}