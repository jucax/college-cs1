import java.util.Scanner;
public class solution2_1_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardValue = scanner.nextInt();

        if (cardValue >= 2 && cardValue <= 14){
            switch (cardValue){
                case 14:
                    System.out.println("Ace");
                    break;
                case 13:
                    System.out.println("King");
                    break;
                case 12:
                    System.out.println("Queen");
                    break;
                case 11:
                    System.out.println("Jack");
                    break;
                default:
                    System.out.println(cardValue);
            }
        } else {
            System.out.println("This is not a valid card value!");
        }
    }
}