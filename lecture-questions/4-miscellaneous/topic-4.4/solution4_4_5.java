import java.util.ArrayList;
public class solution4_4_5 {
    public static int minIndexStartingFrom(ArrayList<Integer> nums, int startIndex) {
        int min = nums.get(startIndex);
        int minIndex = startIndex;

        for (int i = startIndex ; i < nums.size() ; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
                minIndex = i;
            }
        }

        return minIndex;
    }
}