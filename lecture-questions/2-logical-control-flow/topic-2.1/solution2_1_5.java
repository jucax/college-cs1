import java.util.Scanner;
public class solution2_1_5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner();
        String lightColor = scanner.next();
        double distanceToStoplight = scanner.next();
        double acceleration = scanner.next();

        if (lightColor == "red"){
            acceleration = -20;     
        } else if (lightColor == "yellow" && distanceToStoplight < 50){
            acceleration = 20;
        } else if (lightColor == "yellow" && distanceToStoplight >= 50){
            acceleration /= 2;    
        }  
    }
}