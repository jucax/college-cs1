import java.util.Scanner;
public class solution1_2_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int leadingDigits = num / 10;

        System.out.println(leadingDigits); 
    }
}