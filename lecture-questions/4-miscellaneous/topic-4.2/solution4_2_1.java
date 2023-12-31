import java.util.Scanner;
public class solution4_2_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter the minimum character count:");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum character count:");
        int max = scanner.nextInt();
        if (sentence.length() < min){
            System.out.println("Too short");    
        } else if (sentence.length() > max) {
            System.out.println("Too long");    
        } else {
            System.out.println("Goldilocks");    
        }
    }
}