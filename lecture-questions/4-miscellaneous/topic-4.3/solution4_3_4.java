import java.util.ArrayList;
public class solution4_3_4 {
    public static ArrayList<Integer> combinedArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combined = new ArrayList<Integer>();
        combined.addAll(list1);
        combined.addAll(list2);
        return combined;
    }
}