import java.util.Scanner;
public class solution4_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[10][1];

        System.out.println("Enter all of the students’ test scores (separated by spaces):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num > -1 && num < 10) {
                grid[0][0] += 1;
            } else if (num > 9 && num < 20) {
                grid[1][0] += 1;   
            } else if (num > 19 && num < 30) {
                grid[2][0] += 1;
            } else if (num > 29 && num < 40) {
                grid[3][0] += 1;
            } else if (num > 39 && num < 50) {
                grid[4][0] += 1;
            } else if (num > 49 && num < 60) {
                grid[5][0] += 1;
            } else if (num > 59 && num < 70) {
                grid[6][0] += 1;
            } else if (num > 69 && num < 80) {
                grid[7][0] += 1;
            } else if (num > 79 && num < 90) {
                grid[8][0] += 1;
            } else if (num > 89 && num < 101) {
                grid[9][0] += 1;
            }
        }

        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[i][0] ; j++) {
                System.out.print("*");        
            }
            
            System.out.println("");
        }
    }
}