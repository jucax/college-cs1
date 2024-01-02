import java.util.Scanner;
public class solution2_3_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rest = 0;
        String result = "Prime";

        for (int i = 2; i < num; i++){
            rest = num % i;
            if(rest == 0){
                result = "Composite";
                break;
            }
        }

        System.out.print(result);
    }
}