import java.util.ArrayList;
public class solution4_4_2 {
    public static int minIndex(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int minIndex = 0;

        for (int i = 0 ; i < nums.size() ; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
                minIndex = i;
            }
        }
        
        return minIndex;
    }
}