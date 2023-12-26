import java.util.Scanner;
public class solution2_2_9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String reversedStr = "";
        int a = 1;
        for(int i = 0 ; i < str.length() ; i += 1){
            reversedStr += str.charAt(str.length() - a); 
            a++;
        }
    }
}