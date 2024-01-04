public class solution3_4_6 {
    public static int sumDigits(int num) {
        int sum = 0;
        
        if (num == 0) {
            return num;    
        } else {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            return sum;
        }    
    }
}