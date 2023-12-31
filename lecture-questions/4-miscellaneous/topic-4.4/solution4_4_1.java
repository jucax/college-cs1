import java.util.ArrayList;
public class solution4_4_1 {
    public static int minValue(ArrayList<Integer> nums) {
        int min = nums.get(0);

        for (int i : nums) {
            if (i < min) {
                min = i;        
            }     
        }

        return min;
    }
}