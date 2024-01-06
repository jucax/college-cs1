import java.util.Scanner;
public class solution4_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dollars and cents you have in your bank account (separated by a space):");
        
        int dollars = scanner.nextInt();
        int cents = scanner.nextInt();

        if (dollars < 0) {
            System.out.println("Invalid dollars");
        } else if (cents < 0 || cents > 99) {
            System.out.println("Invalid cents");
        } else {
            System.out.println("You have " + dollars + " dollars and " + cents + " cents");    
        }
    }
}