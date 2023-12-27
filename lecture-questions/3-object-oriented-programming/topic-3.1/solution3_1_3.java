import java.util.ArrayList;
public class solution3_1_3 {
    public static void main (String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Southwestern");
        words.add("University");

        for (int i = 0; i < words.size(); i++){
            String get = words.get(i);
            System.out.print(get);
            if (i < (words.size() - 1)){
                System.out.print("|");    
            }   
        }
    }
}