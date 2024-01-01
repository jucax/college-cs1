import java.util.Scanner;
public class solution1_2_5 {
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

		System.out.print(d4);
		System.out.print(d3);
		System.out.print(d2);
		System.out.print(d1);
		System.out.print(d0);
    }
}