import java.util.Scanner;
public class solution2_2_8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for (int i = 1; i <= (str.length()); i++){
            System.out.println(str.charAt((str.length()-i)));    
        }
    }
}