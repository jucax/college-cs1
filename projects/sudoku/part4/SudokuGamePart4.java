public class SudokuGamePart4
{   
    public static void main(String[] args)
    {
        int[][] exampleGrid = {{5, 3, 0, 0, 7, 0, 0, 0, 0}, 
                               {6, 0, 0, 1, 9, 5, 0, 0, 0},
                               {0, 9, 8, 0, 0, 0, 0, 6, 0},
                               {8, 0, 0, 0, 6, 0, 0, 0, 3},
                               {4, 0, 0, 8, 0, 3, 0, 0, 1},
                               {7, 0, 0, 0, 2, 0, 0, 0, 6},
                               {0, 6, 0, 0, 0, 0, 2, 8, 0},
                               {0, 0, 0, 4, 1, 9, 0, 0, 5},
                               {0, 0, 0, 0, 8, 0, 0, 7, 9}};
        
        
        SudokuPart4 sudoku = new SudokuPart4(exampleGrid);
        System.out.println(sudoku);
        System.out.println();
        
        System.out.println("Can I put a 2 at row 3, column 1?");
        System.out.println(sudoku.isValid(3, 1, 2));
        System.out.println();
        
        System.out.println("Can I put an 8 at row 4, column 6?");
        System.out.println(sudoku.isValid(4, 6, 8));
        System.out.println();

        System.out.println("Can I put a 3 at row 6, column 2?");
        System.out.println(sudoku.isValid(6, 2, 3));
        System.out.println();

        System.out.println("Can I put a 9 at row 7, column 4?");
        System.out.println(sudoku.isValid(7, 4, 9));
        System.out.println();

        System.out.println("Can I put a 4 at row 7 column 9?");
        System.out.println(sudoku.isValid(7, 9, 4));
        System.out.println();         
    }
}