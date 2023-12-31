import java.util.Scanner;
public class solution4_2_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        System.out.println("Enter all of the students’ test scores (separated by spaces):");
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            sum += num;
            i++;
        } 
        double average = (double) sum / i;
        System.out.println(average);
    }
}