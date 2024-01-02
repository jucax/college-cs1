import java.util.Scanner;
public class solution2_2_7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String remainer = "";
        String binaryNum = "";
        String sum = "";
        int i = 1;

        do {
            remainer = ""+(num % 2);
            sum += remainer;
            num /= 2;
        } while (num>0);

        while(i <= sum.length()){
            binaryNum += (sum.charAt((sum.length() - i)));
            i++;
        }
    }
}