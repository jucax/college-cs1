import java.util.Scanner;
public class solution2_1_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int days = 0;

        switch (month){
            case 12:
            days += 31;
            case 11:
            days += 30;
            case 10:
            days += 31;
            case 9:
            days += 30;
            case 8:
            days += 31; 
            case 7:    
            days += 31; 
            case 6:
            days += 30;
            case 5:
            days += 31;
            case 4:
            days += 30;
            case 3:
            days += 31;
            case 2:
            days += 28;
            case 1:
            days += 31;
            break;
                
        }

        System.out.println(days);
    }
}