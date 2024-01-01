import java.util.Scanner;
public class solution1_1_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a city, state, and zip code (separated by spaces, with no commas):");

        String city = scanner.next();
        String state = scanner.next();
        long zipCode = scanner.nextLong();
    }
 }