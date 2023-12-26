import java.util.Scanner;
public class solution2_2_6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println(i*i);   
        }
    }
}