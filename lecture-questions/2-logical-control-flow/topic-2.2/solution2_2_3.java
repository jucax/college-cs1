import java.util.Scanner;
public class solution2_2_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grootLines = scanner.nextInt();
        
        int i = 0;
        while (i < grootLines){
            System.out.println("I am Groot: take " + (i +1 ));
            i++;
        }
    }
}