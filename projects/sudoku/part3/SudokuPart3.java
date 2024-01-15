import java.util.ArrayList;

public class SudokuPart3
{
    private int[][] grid;
    
    /**
     * Parameterized constructor that allows the user to create a Sudoku object
     *
     * @param grid - the 2D array containing all of the initial values for the Sudoku
     */
    public SudokuPart3 (int[][] grid)
    {
        this.grid = grid;
    }
    
    /**
     * Retrieves the value at a specified position in the Sudoku puzzle
     * 
     * @param row - the desired row number at which to retrieve the value
     * @param col - the desired column number at which to retrieve the value
     * @return the grid value at position (row, col) in the 2D Sudoku grid
     */ 
    public int getValue(int row, int col)
    {
        return grid[row - 1][col - 1];
    }
    
    /**
     * Modifies the Sudoku puzzle by placing a 
     * 
     * @param row - the desired row number at which to retrieve the value
     * @param col - the desired column number at which to retrieve the value
     * @return the grid value at position (row, col) in the 2D Sudoku grid
     */
    public void setValue(int row, int col, int val)
    {
        grid[row - 1][col - 1] = val;
    }
    
    /**
     * Creates a String representation of the Sudoku grid. Every row is put
     * on a new line. There are vertical dividers between every third column
     * and horizontal dividers between every third row. A dash is used to 
     * represent unfilled numbers (which are represented as a 0 in the
     * internal 2-D array)
     *
     * @return a String containing a 9x9 representation of the Sudoku grid
     */
    public String toString()
    {
        String output = "";

        // iterate over the rows
        for(int row = 0; row < grid.length; row++)
        {
            // iterate over the columns
            for(int col = 0; col < grid.length; col++)
            {
                int val = grid[row][col];
                if (val == 0)
                {
                    output += "- ";
                }
                else
                {
                    output += val + " ";
                }

                // add a divider after 3rd and 6th columns
                if(col == 2 || col == 5)
                {
                    output += "| ";
                }
            }
            // add a line break at the end of the row
            output += "\n";
            
            // add a divider after 3rd and 6th row
            if(row == 2 || row == 5)
            {
                output += "---------------------\n";
            }            
        }
        return output;
    }
    
    // DON'T MODIFY THE CODE ABOVE HERE
    
    /**
     * Method that get all the non-zero numbers in one specific row and store it in an ArrayList<Integer>.
     * @param row - the row whose values we want to store. This should be a number from 1-9
     * @return the ArrayList with the numbers in that row.
     */
    private ArrayList<Integer> getRowValues (int row) {
        // We create the ArrayList to store the numbers of the row
        ArrayList<Integer> rowValues = new ArrayList<Integer>();
        // We iterate in al the numbers of that specific row
        for (int i = 0 ; i < grid[row].length ; i++) {
            // We add just the non-zero numbers in the ArrayList
            if (grid[row - 1][i] != 0) {
                rowValues.add(grid[row - 1][i]);
            }
        }
        return rowValues;
    }

    /**
     * Method that get all the non-zero numbers in one specific column and store it in an ArrayList<Integer>.
     * @param col - the column whose values we want to store. This should be a number from 1-9
     * @return the ArrayList with the numbers in that column.
     */
    private ArrayList<Integer> getColumnValues (int col) {
        // We create the ArrayList to store the numbers of the column
        ArrayList<Integer> colValues = new ArrayList<Integer>();
        // We iterate in al the numbers of that specific column
        for (int i = 0 ; i < grid.length ; i++) {
            // We add just the non-zero numbers in the ArrayList
            if (grid[i][col - 1] != 0) {
                colValues.add(grid[i][col - 1]);
            }
        }
        return colValues;
    }

    /**
     * Method that get all the non-zero numbers in one specific box and store it in an ArrayList<Integer>.
     * @param box - the box whose values we want to store. This should be a number from 1-9
     * @return the ArrayList with the numbers in that box.
     */
    private ArrayList<Integer> getBoxValues (int box) {
        // We create the ArrayList to store the numbers of the box
        ArrayList<Integer> boxValues = new ArrayList<Integer>();
        // Since each box has 3 x 3 squares, we can calculate the topmost row and leftmost col number with the next formula
        // Rest 1 to use the 0-based indexing and then use the int division because all the boxes in the same row level will have the same division result
        int topMostRow = (box - 1) / 3 * 3;
        // Rest 1 to use the 0-based indexing and then use the int modulus because all the boxes in the same column level will have the same modulus result
        int leftMostCol = (box - 1) % 3 * 3;
        // Then we can start the iterations in that topmost row number and do it just 3 times for the 3 rows
        for (int i = topMostRow ; i < topMostRow + 3 ; i++) {
            // We also start the iterations in that leftmost col number and do it just 3 times for the 3 columns
            for (int j = leftMostCol ; j < leftMostCol + 3 ; j++) {
                // We add just the non-zero numbers in the ArrayList
                if (grid [i][j] != 0) {
                    boxValues.add(grid[i][j]);
                }
            }
        }
        return boxValues;
    }
    
    // DON'T MODIFY THE CODE BELOW HERE
    
    /**
     * Helper method for printing out the contents of a single row of the grid. Given a 
     * row number as input, this method will print out all of the non-zero numbers that 
     * are part of that row
     *
     * @param row - the row whose values we want to print out. This should be a number from 1-9
     */
    public void printRow(int row)
    {
        for(int i: getRowValues(row))
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }    
    
    /**
     * Helper method for printing out the contents of a single column of the grid. Given a 
     * column number as input, this method will print out all of the non-zero numbers that 
     * are part of that column
     *
     * @param col - the column whose values we want to print out. This should be a number from 1-9
     */
    public void printCol(int col)
    {
        for(int i: getColumnValues(col))
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     * Helper method for printing out the contents of a single "box" of the grid, where a 
     * "box" is one of the 3x3 sub-grids that must contain all of the numbers 1-9. Given a 
     * box number as input, this method will print out all of the non-zero numbers that 
     * are part of that box. We designate the top left sub-grid as box 1, and the bottom
     * right sub-grid as box 9
     *
     * @param box - the box whose values we want to print out. This should be a number from 1-9
     */
    public void printBox(int box)
    {
        for(int i: getBoxValues(box))
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}