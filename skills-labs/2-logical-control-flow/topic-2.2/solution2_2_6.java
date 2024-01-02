import java.util.Scanner;
public class solution2_2_6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        if (num==0){
            System.out.print(num);    
        } else {
            while (num > 0) {
            sum += num % 10;
            num /= 10;
            }
            
            System.out.print(sum);
        }
    }
}