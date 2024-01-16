import java.util.ArrayList;

public class SudokuPart4
{
    private int[][] grid;
    
    /**
     * Parameterized constructor that allows the user to create a Sudoku object
     *
     * @param grid - the 2D array containing all of the initial values for the Sudoku
     */
    public SudokuPart4(int[][] grid)
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
    
    /*
     * Helper method that retrieves all of the non-zero values in a given row of the grid
     *
     * @param row - the row number whose values we want to retrieve. This should be a number from 1-9
     *
     * @return an ArrayList<Integer> containing all non-zero values in the desired row
     */ 
    private ArrayList<Integer> getRowValues(int row)
    {
        // Create an ArrayList to hold all of the non-zero row values
        ArrayList<Integer> rowValues = new ArrayList<Integer>();
        
        // Loop through all of the possible columns for the given row
        for(int col = 1; col <= 9; col++)
        {
            // Get the value at the current row/column
            int value = getValue(row, col);
            // If the value is non-zero, add it to our list of non-zero values
            if(value != 0)
            {
                rowValues.add(value);
            } 
        }
        return rowValues;
    }
    
    /*
     * Helper method that retrieves all of the non-zero values in a given column of the grid
     *
     * @param col - the column number whose values we want to retrieve. This should be a number from 1-9
     *
     * @return an ArrayList<Integer> containing all non-zero values in the desired column
     */ 
    private ArrayList<Integer> getColumnValues(int col)
    {
        // Create an ArrayList to hold all of the non-zero column values
        ArrayList<Integer> colValues = new ArrayList<Integer>();
        
        // Loop through all of the rows for the given column
        for(int row = 1; row <= 9; row++)
        {
            // Get the value at the current row/column
            int value = getValue(row, col);
            // If the value is non-zero, add it to our list of non-zero values
            if(value != 0)
            {
                colValues.add(value);
            }
        }
        return colValues;
    }
    
    /*
     * Helper method that retrieves all of the non-zero values in a given "box" of the grid
     * where a "box" is one of the 3x3 sub-grids that must contain all of the numbers 1-9. 
     * We designate the top left sub-grid as box 1, and the bottom right sub-grid as box 9
     *
     * @param box - the box number whose values we want to retrieve. This should be a number from 1-9
     *
     * @return an ArrayList<Integer> containing all non-zero values in the desired column
     */
    private ArrayList<Integer> getBoxValues(int box)
    { 
        // calculate which row and column corresponds to the top/left square of the box
        
        /* 
         * The way to think about this formula is to note that boxes 1, 2, and 3 all have
         * the same starting row, so we can think of those three boxes as one "horizontal third"
         * of the grid. Boxes 4, 5, and 6 represent the second "horizontal third", and boxes
         * 7, 8, and 9 represent the last "horizontal third". We essentially try to figure
         * out which "horizontal third" our box number belongs to, and that tells us
         * which row our box will start at. 
         */
        int startRow = ((box - 1) / 3) * 3 + 1;
        
        /*
         * Similarly, we can think of boxes 1, 4, and 7 as forming one "vertical third" of
         * the grid since they all share a starting column. What makes these three numbers
         * the same is that they all have the same remainder when divided by 3, which is
         * why we use the modulus here.
         */
        int startCol = ((box - 1) % 3) * 3 + 1;
        
        // Create an ArrayList to hold all of the non-zero box values
        ArrayList<Integer> boxValues = new ArrayList<Integer>();
        
        /*
         * We are using nested loops because we have to go through three different rows,
         * and for each row we need to go through three different columns.
         * 
         * We calculated the starting row and starting column above. These will form our
         * loop bounds.
         * 
         * The "rows" loop will start at our top-most row, and go up to (and including)
         * the row that is two rows past the top-most row of the box.
         * 
         * The "columns" loop will start at our left-most column, and go up to (and including)
         * the column that is two columns past the left-most column of the box.
         */ 
        for(int row = startRow; row <= startRow + 2; row++)
        {
            for(int col = startCol; col <= startCol + 2; col++)
            {
                // Get the value at the current row/column
                int value = getValue(row, col);
                
                // If the value is non-zero, add it to our list of non-zero values
                if(value != 0)
                {
                    boxValues.add(value);
                }
            }
        }
        return boxValues;
    }
    
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
    
    // DON'T MODIFY THE CODE ABOVE THIS
    /**
     * Helper method that retrives the box number to which the square belongs from a specific
     * row and column
     * @param row - the row number of the square we refer to. This should be a number from 1-9
     * @param col - the column number of the square we refer to. This should be a number from 1-9
     * @return an int that contain the box number for that row and column
     */
    private int getBoxNumber(int row, int col){
        /* We first need to get the "horizontal third" it is referring to, we get this using the
         * startRow formula and solving to get the number of the box
         */ 
        int boxRow = (((row - 1) / 3) * 3) + 1;
        /* Analyzing the pattern, I noted that we can obtain the value of the "vertical third" 
         * with this simple operation.
         */ 
        int boxCol = ((col - 1) / 3);
        // Then we just sum both values to get the box number.
        return boxRow + boxCol;
    }
    
    /**
     * Helper method that analyzes if a value can be placed in a square making sure that there is no
     * other equal value in that specific row, column and box.
     * @param row - the row in which the new value is to be placed. This should be a number from 1-9
     * @param col - the column in which the new value is to be placed. This should be a number from 1-9
     * @param val - the value that will be placed. This should be a number from 1-9
     * @return a boolean value that is false if there is a equal value in the row, column or box
     * and true if there is no conflict
     */
    public boolean isValid(int row, int col, int val){
        // We loop through the values of the specific row using the return of the getRowValues method.
        for (int rowValue : getRowValues(row)) {
            // Compare the new value that will be placed in the values that already are in that row.
            if (val == rowValue) {
                // If some value is equal in that row then is not valid to place the new value there.
                return false;
            }
        }
        // We loop through the values of the specific column using the return of the getColumnValues method.
        for (int colValue : getColumnValues(col)){
            // Compare the new value that will be placed in the values that already are in that column.
            if (val == colValue) {
                // If some value is equal in that column then is not valid to place the new value there.
                return false;
            }
        }
        /*  We loop through the values of the specific row using the return of the getBoxValues method, but
         *  first we get the box number to which that row and column are reffering with the getBoxNumber method.
         */
        for (int boxValue : getBoxValues(getBoxNumber(row, col))){
            // Compare the new value that will be placed in the values that already are in that box.
            if (val == boxValue) {
                // If some value is equal in that box then is not valid to place the new value there.
                return false;
            }
        }
        // If none of the above conditions were true, then is valid to place the new value in that square.
        return true;
    }
}