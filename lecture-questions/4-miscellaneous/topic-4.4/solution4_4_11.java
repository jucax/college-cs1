import java.util.ArrayList;
public class solution4_4_11 {
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
    
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> sortedNums1, ArrayList<Integer> sortedNums2) {
        ArrayList<Integer> mergeList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while ((i < sortedNums1.size()) && (j < sortedNums2.size())) {
            if (sortedNums1.get(i) < sortedNums2.get(j)) {
                mergeList.add(sortedNums1.get(i));
                i++;
            } else {
                mergeList.add(sortedNums2.get(j));
                j++;
            } 
        }

        while (i < sortedNums1.size()) {
            mergeList.add(sortedNums1.get(i));
            i++;   
        }

        while (j < sortedNums2.size()) {
            mergeList.add(sortedNums2.get(j));
            j++;    
        }

        return mergeList;
    }
    
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> nums) {
        ArrayList<Integer> firstHalfList = new ArrayList<Integer>();
        ArrayList<Integer> secondHalfList = new ArrayList<Integer>();
        ArrayList<Integer> mergeList = new ArrayList<Integer>();

        if (nums.size() == 0 || nums.size() == 1) {
            return nums;
        } else {
            firstHalfList = mergeSort(firstHalf(nums));
            secondHalfList = mergeSort(secondHalf(nums));
            return mergeSorted(firstHalfList, secondHalfList);
        } 
    }
}