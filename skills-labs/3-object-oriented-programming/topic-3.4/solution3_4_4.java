public class solution3_4_4 {
    public void reverse(int[] nums) {
        int [] reverse = new int[nums.length];

        for (int i = 0 ; i < nums.length ; i++) {
            reverse[i] = nums[nums.length - 1 - i]; 
        }

        for (int j = 0 ; j < reverse.length ; j++) {
            nums[j] = reverse[j]; 
        }
    }
}