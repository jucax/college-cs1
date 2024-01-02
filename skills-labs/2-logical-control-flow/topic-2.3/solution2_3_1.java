import java.util.Scanner;
public class solution2_3_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        int x = num;

        while (x > 0) {
            for (int j = 0; j < ((num-i)/2); j++){
                System.out.print("-");    
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");   
            }
            for (int l = 0; l < ((num-i)/2); l++){
                System.out.print("-");    
            }
            
            System.out.println("");
            x -= 2;
            i += 2;
        }
    }
}