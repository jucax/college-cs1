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

![sudoku-example](https://github.com/jucax/college-cs1/blob/59b50129ec7f20979e569d7a85d17f742b748b86/projects/images/sudoku-example.png?raw=true)

The first row would contain the values {`5, 3, 0, 0, 7, 0, 0, 0, 0`}

The fifth row would contain the values {`4, 0, 0, 8, 0, 3, 0, 0, 1`}

The ninth row would contain the values {`0, 0, 0, 0, 8, 0, 0, 7, 9`}

### The `grid` instance variable
In your `Sudoku` class, declare an instance field of type `int[][]` called `grid`.

This is just one line, but it’s an important one! It is basically adding instructions to our blueprint that say “Every Sudoku object stores a grid with all of the puzzle values”.

When we write our `main` method, we will create an actual `Sudoku` object and fill its `grid` with values. But within the `Sudoku` class, the instance field `grid` is a placeholder for the actual `grid` values that we will use when we create actual `Sudoku` objects.

## Representing the `grid` as a `String`
We’ve made it so that our Sudoku objects can store data - specifically, data about what values are at what positions in the puzzle. Now let’s give instructions for Sudoku objects to actually use that data to perform tasks.

In the Sudoku class, add `toString`. This method will be just like the `toString` methods that we discussed in class. The method does not take any input parameters. This method returns a `String`. The method will print out the contents of our instance field `grid`, but it will do so in a way that is pretty and makes it easy to read.

Let’s again use the following grid as an example:

![sudoku-example](https://github.com/jucax/college-cs1/blob/59b50129ec7f20979e569d7a85d17f742b748b86/projects/images/sudoku-example.png?raw=true)

Here is how we would want to print out the grid

```
5 3 - | - 7 - | - - - 
6 - - | 1 9 5 | - - - 
- 9 8 | - - - | - 6 - 
---------------------
8 - - | - 6 - | - - 3 
4 - - | 8 - 3 | - - 1 
7 - - | - 2 - | - - 6 
---------------------
- 6 - | - - - | 2 8 - 
- - - | 4 1 9 | - - 5 
- - - | - 8 - | - 7 9 
```

Basically, we print out all of the rows on the grid on a separate line. We have vertical lines following columns 3 and 6, and we have horizontal lines following rows 3 and 6.

If you are struggling with this method, I suggest first trying to get the numbers to work and ignoring the divider lines. In other words, you can first try to get the following output:

```
5 3 - - 7 - - - - 
6 - - 1 9 5 - - - 
- 9 8 - - - - 6 - 
8 - - - 6 - - - 3 
4 - - 8 - 3 - - 1 
7 - - - 2 - - - 6 
- 6 - - - - 2 8 - 
- - - 4 1 9 - - 5 
- - - - 8 - - 7 9
```

After that, try to get the dividers between the rows and columns working.

## Commenting your code
Your `toString` method should include JavaDoc style comments as described here.

Additionally you should include inline comments that indicate where your method does the following:
1. Iterating over the rows
2. Iterating over the columns
3. Adding a divider between every third column
4. Adding a divider between every third row

## Testing your code
Put the following code into your SudokuGame.java file

```
public class SudokuGame
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
                        
        Sudoku sudoku = new Sudoku();
        sudoku.grid = exampleGrid;
        
        System.out.println(sudoku);                  
    }
}
```

The first thing to note is that in the starter code, we created an `int[][]` variable called `exampleGrid` to hold the contents of the example grid below.

![sudoku-example](https://github.com/jucax/college-cs1/blob/59b50129ec7f20979e569d7a85d17f742b748b86/projects/images/sudoku-example.png?raw=true)

The rows of `exampleGrid` correspond to the rows in the grid above. Every blank square in the picture is represented as a 0 in `exampleGrid`.

Compile using the command `javac *.java`, and run your code using `java SudokuGame`. You should get the following output:

```
5 3 - | - 7 - | - - - 
6 - - | 1 9 5 | - - - 
- 9 8 | - - - | - 6 - 
---------------------
8 - - | - 6 - | - - 3 
4 - - | 8 - 3 | - - 1 
7 - - | - 2 - | - - 6 
---------------------
- 6 - | - - - | 2 8 - 
- - - | 4 1 9 | - - 5 
- - - | - 8 - | - 7 9 
```

Try changing some of the values in your example grid, re-running the program, and making sure that the output reflects the changes that you made. But when you submit, make sure you use the values in the example grid from the writeup.

**Note**: The `SudokuGame.java` file attempts to test your code under the assumption that you have filled in `Sudoku.java`. If you try to compile `SudokuGame.java` without having done the exercises for `Sudoku.java`, then it will not work, because `SudokuGame.java` will be trying to access/test variables and methods that don’t yet exist.

## Assignment Reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- Why do you think we are creating our own custom `Sudoku` class instead of using java’s built-in classes?
- Why do you think we are using an `int[][]` (as opposed to a 1-D array or an `ArrayList`) to represent the Sudoku `grid`?
- Where and how did we make use of `String` concatenation?
- Why do we need to use nested loops in the `toString` method?
- Do you have any follow-up questions about this assignment that you would like me to cover in class?

Your reflection will be graded on completeness, clarity and effort - not correctness.

Additionally, if you received help from another student in the class or from a departmental tutor, please state what help you received and which parts of the assignment you received help on.

Put your reflection in a document titled `Sudoku-Part1-Reflection.pdf`.