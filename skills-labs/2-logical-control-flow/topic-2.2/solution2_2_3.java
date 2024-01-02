import java.util.Scanner;
public class solution2_2_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int i = 0;

        System.out.print("*");

        while(i < (name.length()+30)){
            System.out.print("*");
            i++;
        }

        System.out.println("*");
        System.out.print("*");
        i = 0;

        while(i < (name.length()+30)){
            System.out.print(" ");
            i++;
        }

        System.out.println("*");
        System.out.println("* Hello, " + name + "! Welcome to CS 7! :) *");
        System.out.print("*");
        i = 0;

        while(i < (name.length()+30)){
            System.out.print(" ");
            i++;
        }

        System.out.println("*");
        System.out.print("*");
        i = 0;

        while(i < (name.length()+30)){
            System.out.print("*");
            i++;
        }
        
        System.out.println("*");
    }
}