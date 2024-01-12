# Sudoku Project Part 1
## Getting Started
### Starter code
On the course website we have provided two starter code files: `Sudoku.java` and `SudokuGame.java`. Download them to your computer, and write all of your code in these files. I suggest that you create a special folder for all of your Sudoku code.

Alternatively, you can copy/paste the starter code for `Sudoku.java` from here. Later in the writeup I will post the starter code for `SudokuGame.java`

```
public class Sudoku
{
    // YOUR CODE GOES HERE
}
```

### Compiling and running your code
Unlike the last project, this project involves two different files. To compile the code, use the following command:

```
javac Sudoku.java SudokuGame.java
```

Alternately, you can use the following command:

```
javac *.java
```

This is basically telling the computer “compile all .java files in the current directory”.

After compiling, if you use `ls` or `dir`, you should see two new files: `Sudoku.class` and `SudokuGame.class`. You compiled two `.java` source code files, hence two `.class` files.

To run your code, use the command

```
java SudokuGame
```

You only need to put SudokuGame because that is the file with the main method.

Alright - let’s start building a Sudoku!

**IMPORTANT NOTE:** The starter code will NOT compile. This is because `SudokuGame.java` is attempting to test out instance fields and methods that do not yet exist in `Sudoku.java`. Don’t try to compile it until you think you’ve finished writing the code for `Sudoku.java`.

## Sudoku class instance variables
### Representing the Sudoku grid
We are going to represent the Sudoku grid as a 2-D array. Every value in the array will contain an int between `0` and `9`, corresponding to what value is that at row/column. The value `0` is used as a placeholder to represent a blank square.

Consider the following example:

![sudoku-example](projects/images/sudoku-example.png)
