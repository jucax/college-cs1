import java.util.Scanner;
public class solution2_3_3 {
    public static void main (String[] args) {        
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean hasOddFactor = false;
        int rest = 0;

        for (int i = 3; i <= num; i += 2) {
            rest = num % i;
            if (rest == 0) {
                hasOddFactor = true;
                break;
            } else {
                hasOddFactor = false;
            }
        }
    }
}