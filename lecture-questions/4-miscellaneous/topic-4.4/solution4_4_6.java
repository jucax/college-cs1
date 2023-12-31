import java.util.ArrayList;
public class solution4_4_6 {
    public static void arrayListSwap(ArrayList<Integer> nums, int firstPos, int secondPos) {
        int temporal = nums.get(firstPos);

        nums.set(firstPos, nums.get(secondPos));
        nums.set(secondPos, temporal);
    }
}