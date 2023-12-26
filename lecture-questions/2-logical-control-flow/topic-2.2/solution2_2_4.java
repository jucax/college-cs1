import java.util.Scanner;
public class solution2_2_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstFriday = scanner.nextInt();
        
        while (firstFriday <= 365){
            System.out.println(firstFriday);
            firstFriday += 7;
        }
    }
}