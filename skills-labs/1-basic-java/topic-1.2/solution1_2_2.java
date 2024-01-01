import java.util.Scanner;
public class solution1_2_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();
        char delim = scanner.next().charAt(0);

        String concat = firstString + delim + secondString;
        System.out.print(concat);
    }
}