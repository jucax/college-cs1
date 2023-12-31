import java.util.ArrayList;
public class solution4_4_9 {
    public static ArrayList<Integer> secondHalf(ArrayList<Integer> nums) {
        ArrayList<Integer> secondHalfList = new ArrayList<Integer>();
        int half = 0;

        if (nums.size() % 2 == 0) {
            half = nums.size() / 2;
        } else if (nums.size() % 2 == 1) {
            half = (nums.size() + 1) / 2;
        } else {
            half = 1;    
        }

        for (int i = half ; i < nums.size() ; i++) {
            secondHalfList.add(nums.get(i));
        }

        return secondHalfList;
    }
}