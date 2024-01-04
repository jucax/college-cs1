public class solution3_4_5 {
    public static void printReversedDigits(int num) {
        String nums = ""+num;
        int i = 1;
    
        while ( i <= nums.length()) {
            System.out.println(nums.charAt(nums.length() - i)); 
            i++;
        }   
    }
}