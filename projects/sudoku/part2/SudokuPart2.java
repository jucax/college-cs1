public class SudokuPart2 {
    private int[][] grid;
    
    // DON'T MODIFY THE CODE ABOVE THIS
    
    /**
     * Constructor to create the object sudoku and initialize it with the values of the grid
     * @param grid
     */
    public SudokuPart2 (int[][] grid) {
        this.grid = grid;
    }
    /**
     * Get and return the value of an specific square in a particular row and colum
     * @param row
     * @param col
     * @return the int value that is in that square
     */
    public int getValue(int row, int col) { 
        return grid [row - 1][col - 1 ];
    }
    /**
     * Set a value for that specific square in that particular row and colum
     * @param row
     * @param col
     * @param val
     */
    public void setValue(int row, int col, int val) {
        grid [row - 1][col - 1] = val;
    }
    
    // DON'T MODIFY THE CODE BELOW THIS
    
    /**
     * Creates a String representation of the Sudoku grid. Every row is put
     * on a new line. There are vertical dividers between every third column
     * and horizontal dividers between every third row. A dash is used to 
     * represent unfilled numbers (which are represented as a 0 in the
     * internal 2-D array)
     *
     * @return a String containing a 9x9 representation of the Sudoku grid
     */
    public String toString() {
        String output = "";

        // iterate over the rows
        for(int row = 0; row < grid.length; row++) {
            // iterate over the columns
            for(int col = 0; col < grid.length; col++) {
                int val = grid[row][col];
                if (val == 0) {
                    output += "- ";
                }
                else {
                    output += val + " ";
                }

                // add a divider after 3rd and 6th columns
                if(col == 2 || col == 5) {
                    output += "| ";
                }
            }
            // add a line break at the end of the row
            output += "\n";
            
            // add a divider after 3rd and 6th row
            if(row == 2 || row == 5) {
                output += "---------------------\n";
            }            
        }
        return output;
    }
}