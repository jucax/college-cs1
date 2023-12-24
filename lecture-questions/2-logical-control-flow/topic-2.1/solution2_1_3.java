import java.util.Scanner;
public class solution2_1_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner();
        int cardValue = scanner.nextInt();

        System.out.println("The card value is " + cardValue);
        
        if (cardValue >= 2 && cardValue <= 10){
            System.out.println("This is a numeric card!");
        } else if (cardValue >= 11 && cardValue <= 14){
            System.out.println("This is a face card!");
        } else {
            System.out.println("This is not a valid card value!");
        }    
    }
}