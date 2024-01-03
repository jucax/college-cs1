import java.util.Scanner;
public class solution3_1_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = {1, 2, 3, 4, 5};
        
        float sum = 0;
        float average = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];         
        }

        average = sum / nums.length;
        System.out.print(average);
    }
}