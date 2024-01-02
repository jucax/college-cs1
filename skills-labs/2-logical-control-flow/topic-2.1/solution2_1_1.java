import java.util.Scanner;
public class solution2_1_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int time = scanner.nextInt();
        int maxSpeed = scanner.nextInt();

        if ((maxSpeed * time) >= distance){
            System.out.println("possible");   
        } else {
            System.out.println("impossible");
        }
    }
}