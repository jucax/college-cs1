import java.util.ArrayList;
public class solution4_4_4 {
    public static int minValueStartingFrom(ArrayList<Integer> nums, int startIndex) {
        int min = nums.get(startIndex);
        int minIndex = 0;

        for (int i = startIndex ; i < nums.size() ; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
                minIndex = i;
            }
        }
        
        return min;
    }
}