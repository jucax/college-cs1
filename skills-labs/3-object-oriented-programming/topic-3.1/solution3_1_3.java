import java.util.Scanner;
public class solution3_1_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] products = new int[n][n];
        
        for (int i = 0; i < products.length; i++){
            for(int j = 0; j < products[i].length; j++){
                products[i][j] = (i + 1) * (j + 1);     
            }
        }
    }
}