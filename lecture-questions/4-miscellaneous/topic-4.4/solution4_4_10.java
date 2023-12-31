import java.util.ArrayList;
public class solution4_4_10 {
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
}