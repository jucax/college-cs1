import java.util.Scanner;
public class solution4_2_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What direction are you facing? Enter either North, South, East, West, or a number between 0 and 360:");
        
        if (scanner.hasNextDouble()){
            double num = scanner.nextDouble();
            if (num > -1 && num < 361) {
                System.out.println(num);    
            } else {
                System.out.println("Invalid direction");
            }
        } else {
            String direction = scanner.nextLine();
            switch (direction){
                case "North":
                    System.out.println("0");
                break;
                case "East":
                    System.out.println("90");
                break;
                case "South":
                    System.out.println("180");
                break;
                case "West":
                    System.out.println("270");
                break;
                default:
                    System.out.println("Invalid direction");
                break;
            }
        }
    }
}