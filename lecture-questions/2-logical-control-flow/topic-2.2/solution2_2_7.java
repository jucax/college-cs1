import java.util.Scanner;
public class solution2_2_7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += (i * i);       
        }
        System.out.print(sum);
    }
}