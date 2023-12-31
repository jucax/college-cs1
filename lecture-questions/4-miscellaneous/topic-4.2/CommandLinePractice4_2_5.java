public class CommandLinePractice4_2_5 {
    public static void main (String[] args) {
        double sum = 0;
        double average = 0;

        for (String num : args) {
            sum += Integer.parseInt(num);      
        }

        average = sum / args.length;
        
        System.out.println(average);
    }
}