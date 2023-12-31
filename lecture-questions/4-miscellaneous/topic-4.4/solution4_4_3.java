import java.util.ArrayList;
public class solution4_4_3 {
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> nums) {
        ArrayList<Integer> sortedNums = new ArrayList<Integer>();

        while (nums.size() > 0) {
            int min = nums.get(0);
            int minIndex = 0;

            for (int i = 0 ; i < nums.size() ; i++) {
                if (nums.get(i) < min) {
                    min = nums.get(i);
                    minIndex = i;
                }
            }

            nums.remove(minIndex);
            sortedNums.add(min);     
        }
        
        return sortedNums;
    }
}