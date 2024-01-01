import java.util.Scanner;
public class solution1_1_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        
        int x = firstNum;
        firstNum = secondNum;
        secondNum = x;
    }
 }