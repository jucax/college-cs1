public class SudokuPart1
{
    int [][] grid = new int [9][9];
    String row = "";
    String value = "";

    /*
     * This method print out all of the rows and columns of the sudoku on a separate line
     * It includes vertical and horizontal lines to print the numbers in a way that is pretty and easy to read.
     * @return Each row with its corresponding lines and spaces, forming the 9 x 9 grid of a traditional Sudoku.  
     */
    public String toString(){
        for (int i = 0 ; i < grid.length ; i++) { // Iterating over the rows
            for (int j = 0 ; j < grid[i].length ; j++) { // Iterating over the columns
                value = grid[i][j] + "";
                if (value.equals("0")) {
                    row += "- ";
                } else {
                    row += value + " ";
                }
                if (j == 2 || j == 5) { // Adding a divider between every third column
                    row += "| ";
                }
            }
        row += "\n";
            if (i == 2 || i == 5) { // Adding a divider between every third row
                row += "---------------------" + "\n";
            }
        }
        return row;
    }
}