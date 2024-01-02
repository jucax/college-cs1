import java.util.Scanner;
public class solution2_2_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAsterisks = scanner.nextInt();
        int i = 0;
        
        while(i < numAsterisks){
            System.out.print("*");
            i++;
        }
    }
}