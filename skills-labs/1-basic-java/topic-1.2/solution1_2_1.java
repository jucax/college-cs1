import java.util.Scanner;
public class solution1_2_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int height = scanner.nextInt();

        double area = ((double)base * (double)height) / 2;
        System.out.print(area);
    }
}