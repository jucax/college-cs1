import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuGamePart5
{   
    public static void main(String[] args) throws FileNotFoundException
    {    
        SudokuPart5 sudoku = new SudokuPart5 (args[0]);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(sudoku);
            System.out.println("Enter the next row, column, and value (separated by spaces):");

            //We verify if the user introduced a number
            if (scanner.hasNextInt()) {

                //We store each value that the user introduced
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                int val = scanner.nextInt();

                //We verify if the row value is valid, if not then prompt the user and repeat the loop
                if (!(row >= 1 && row <= 9)) { //Row has to be between 1 - 9
                    System.out.println("Invalid row");
                    System.out.println();
                    continue;
                //We verify if the column value is valid, if not then promp the user and repeat the loop
                } else if (!(col >= 1 && col <= 9)) { //Column has to be between 1 - 9
                    System.out.println("Invalid column");
                    System.out.println();
                    continue;
                //We verify if the number to place is valid, if not then prompt the user and repeat the loop
                } else if (!(val >= 0 && val <= 9)) { //Column has to be between 0 - 9 because 0 erease
                    System.out.println("Invalid number");
                    System.out.println();
                    continue;
                }

                //If all the values are valid, then we verify if it is valid according to sudoku rules, we just use 
                //the isValid method for this
                if (sudoku.isValid(row,col,val)) {
                    sudoku.setValue(row,col,val); //If the value pass all the verifications, then we place it with setValue
                //If the isValid method is false then we prompt the user and repeat the loop
                } else {
                    System.out.println("Invalid move");
                    System.out.println();
                    continue;
                }
            //If the user introduce "q", then the game is over and we break the loop
            } else if (scanner.next().equals("q")) {
                break;
            //If the user introduce anything else, then is an invalid comand
            } else {
                System.out.println("Invalid comand");
                System.out.println();
                continue;
            }
        }           
    }
}
