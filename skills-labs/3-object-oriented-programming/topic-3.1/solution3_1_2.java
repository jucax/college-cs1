import java.util.Scanner;
import java.util.ArrayList;
public class solution3_1_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();

        int j = 0;
        int n1 = 0;
        int n2 = 1;

        fibonacciNumbers.add(n1);
        fibonacciNumbers.add(n2);

        while(j <=num){
            fibonacciNumbers.add(n1+n2);
            int temp = n1;
            n1 = n2;
            n2 = temp + n2;
            j= n1 + n2;
        }
    }
}