import java.util.Scanner;
public class solution1_2_6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = scanner.nextInt();
		int d4 = num % 10;
		num /= 10;
		int d3 = num % 10;
		num /= 10;
		int d2 = num % 10;
		num /= 10;
		int d1 = num % 10;
		num /= 10;
		int d0 = num % 10;

		System.out.print(d4 + d3 + d2 + d1 + d0);
    }
}