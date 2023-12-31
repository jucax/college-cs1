public class CommandLinePractice4_2_4 {
    public static void main (String[] args) {
        int sum = 0;
        
        for (String value : args) {
            sum += (value.length());        
        }
        System.out.println(sum);
    }
}