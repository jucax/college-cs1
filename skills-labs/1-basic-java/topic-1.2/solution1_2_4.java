import java.util.Scanner;
public class solution1_2_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean veto = scanner.nextBoolean();
        int houseVotes = scanner.nextInt();
        int senateVotes = scanner.nextInt();

        Boolean billPasses = ((veto==false && houseVotes >= 218 && senateVotes >= 51) || (veto==true && houseVotes >= 290 && senateVotes >= 67));
        System.out.print(billPasses);
    }
}