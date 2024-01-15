public class SudokuGamePart3
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
        
        
        SudokuPart3 sudoku = new SudokuPart3(exampleGrid);
        System.out.println(sudoku);
        System.out.println();
        
        System.out.print("Row 2: ");
        sudoku.printRow(2);
        System.out.println();
        
        System.out.print("Column 9: ");
        sudoku.printCol(9);
        System.out.println();
        
        System.out.print("Box 5: ");
        sudoku.printBox(5);
        System.out.println();
                        
    }
}