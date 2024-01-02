import java.util.Scanner;
public class solution2_2_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int n1 = 0;
        int n2 = 1;

        System.out.println(n1);
        System.out.println(n2);

        while(i <= num){
            System.out.println(n1+n2);
            int temp = n1;
            n1 = n2;
            n2 = temp + n2;
            i = n1 + n2;
        }
    }
}