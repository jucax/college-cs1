import java.util.Scanner;
public class solution1_2_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCars = scanner.nextInt();
        int numFamilies = scanner.nextInt();

        int carsPerFamily = numCars / numFamilies;
        int distributedCars = numFamilies * carsPerFamily;
        int leftoverCars = numCars - distributedCars;
        boolean isEnough = (carsPerFamily >= 2);

    }
}