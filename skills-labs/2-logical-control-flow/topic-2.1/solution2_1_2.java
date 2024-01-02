import java.util.Scanner;
public class solution2_1_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = scanner.nextDouble();
        double p = grade * 100;
        
        if ( p >= 97){
            System.out.println("A+");    
        } else if ( p >= 93 && p < 97){
            System.out.println("A");
        } else if ( p >= 90 && p < 93){
            System.out.println("A-");
        } else if ( p >= 87 && p < 90){
            System.out.println("B+");
        } else if ( p >= 83 && p < 87){
            System.out.println("B");    
        } else if ( p >= 80 && p < 83){
            System.out.println("B-");   
        } else if ( p >= 77 && p < 80){
            System.out.println("C+");    
        } else if ( p >= 73 && p < 77){
            System.out.print("C");    
        } else if ( p >= 70 && p < 73){
            System.out.println("C-");    
        } else if ( p >= 60 && p < 70){
            System.out.println("D");    
        } else if ( p >= 0 && p < 60){
            System.out.println("F");    
        }
    }
}