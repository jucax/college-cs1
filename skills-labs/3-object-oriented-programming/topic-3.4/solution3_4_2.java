import java.util.ArrayList;
public class solution3_4_2 {
    public int maxOdd(ArrayList<Integer> nums) {
        int largest = 0;

        for(int i = 0 ; i < nums.size() ; i++) {
            if ((nums.get(i) % 2) == 1 && nums.get(i) > largest) {
                largest = nums.get(i);    
            }
        }

        return largest;
    }
}