import java.util.ArrayList;
public class solution4_4_7 {
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

    public static void arrayListSwap(ArrayList<Integer> nums, int firstPos, int secondPos) {
        int temporal = nums.get(firstPos);

        nums.set(firstPos, nums.get(secondPos));
        nums.set(secondPos, temporal);
    }

    public static void selectionSortInPlace(ArrayList<Integer> nums) {
        int smallestNumIndex = 0;
        
        for (int i = 0 ; i < nums.size() - 1 ; i++) {
            smallestNumIndex = minIndexStartingFrom(nums, i);
            arrayListSwap(nums, i, smallestNumIndex);
        }
    }
}