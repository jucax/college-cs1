import java.util.ArrayList;
public class solution4_4_8 {
    public static ArrayList<Integer> firstHalf(ArrayList<Integer> nums) {
        ArrayList<Integer> firstHalfList = new ArrayList<Integer>();
        int half = 0;

        if (nums.size() % 2 == 0) {
            half = nums.size() / 2;
        } else if (nums.size() % 2 == 1) {
            half = (nums.size() + 1) / 2;
        } else {
            half = 1;    
        }

        for (int i = 0 ; i < half ; i++) {
            firstHalfList.add(nums.get(i));
        }
        
        return firstHalfList;
    }
}