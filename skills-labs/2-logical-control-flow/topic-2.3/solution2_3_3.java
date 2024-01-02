import java.util.Scanner;
public class solution2_3_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        String condensedSentence = "";
        char empty = ' ';

        for(int i = 0; i < (sentence.length()); i++){
            if(sentence.charAt(i) == empty){
                continue;    
            }

            condensedSentence += sentence.charAt(i);        
        }
    }
}