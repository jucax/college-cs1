import java.util.Scanner;
public class solution4_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}