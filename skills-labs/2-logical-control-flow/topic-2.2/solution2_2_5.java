import java.util.Scanner;
public class solution2_2_5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String nums = ""+num;
        int i = 1;
        int length = nums.length();
        
        while ( i <= (nums.length())){
            System.out.print(nums.charAt((length - i))); 
            i++;
        }
    }
}