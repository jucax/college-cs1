import java.util.Scanner;
public class solution2_1_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardValue = scanner.nextInt();

        System.out.println("The card value is " + cardValue);

        if(cardValue >= 2 && cardValue <= 14){
            System.out.println("This is a valid card value!");
        } else {
            System.out.println("This is not a valid card value!");
        }
    }
}