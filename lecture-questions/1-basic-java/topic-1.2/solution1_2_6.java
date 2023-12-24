import java.util.Scanner;
public class solution1_2_6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();
        
        boolean isFeasible = (numStudents >= 50) || (numStudents >= 10 && (numStudents % 4) == 0);

        System.out.println(isFeasible); 
    }
}