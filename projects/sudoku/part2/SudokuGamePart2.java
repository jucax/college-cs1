public class SudokuGamePart2
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
        
        
        SudokuPart2 sudoku = new SudokuPart2(exampleGrid);
        
        System.out.println("Initial grid");
        System.out.println(sudoku);
        System.out.println();
        
        System.out.println("Row 6, column 5 has a " + sudoku.getValue(6, 5));
        System.out.println();
        
        System.out.println("Putting a 9 in row 6, column 7");
        sudoku.setValue(6, 7, 9);
                
        System.out.println(sudoku);               
    }
}