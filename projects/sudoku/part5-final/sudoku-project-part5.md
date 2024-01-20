# Sudoku Project Part 5
## Extra sudoku constructor
Previously, we created a constructor that took an `int[][]` as its input parameter and used this to initialize its `grid` instance field. In this assignment we will add a second constructor. This constructor has a single `String` parameter called `sudokuFile`. This parameter represents the name of the file that contains the contents of the initial Sudoku grid. The contents of the file will contain every row on a separate line. All of the contents of the row will be separated by spaces.

Every blank entry will be represented by a dash (i.e. `-`).

Here is how the file contents would look for the sudoku grid at the start of the writeup:

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

Your constructor will read a file in this format and use it to initialize your grid with values. In particular, do the following:

1. Initialize grid to be a `new` 9x9 `int[][]`.
2. Create a `FileReader` object that reads `sudokuFile`, and then create a `Scanner` object that reads from that FileReader object.
3. Initialize the values of `grid` and `startingGrid` so that they match the values in the file. You will need to decide what kind of loop to use to go through the file, and you will need to decide how to make sure each new number gets inserted at the correct points of the two `int[][]` instance variables.

**Some notes:**
- You will need to use `FileReader` and `Scanner` objects. Thus, you need to add the following `import` statements at the top of `Sudoku.java:`

```
import java.util.Scanner;
import java.io.FileReader;
```

- Whenever you are reading a file, Java requires you to acknowledge the possibility that the file might not exist. Thus you need to add the following code to your constructor header:

`throws FileNotFoundException`

Additionally you will need to `import` the class `FileNotFoundException`. Add the following line to the top of `Sudoku.java`:

`import java.io.FileNotFoundException;`

- You will need to create variables that keep track of what your current row and column are. These variables will tell you where to insert each number you read from the file into your `grid`. You will need to update these variables as you read `Scanner` tokens.
- You can use `Integer.parseInt` to convert a `String` into an `int`. See the Java documentation for more information on this method.
- Don’t forget to `close` your `Scanner` object at the end of the constructor body!
- Don’t forget to initialize the values of both instance variables! You need to initialize both `grid` and `startingGrid`.

### Assertions
Inside your constructor, you should add assertions to make sure that the file you read specified a valid sudoku. You should add the following assertions:
- Every time you read a number, use `assert` statements to check that the number is within the range 1-9. If it’s not, you should give the error message `All numbers must be in the range 1-9.`
- After you have read all of the file, `assert` that you actually read in 81 values. To do this, you can use your variables that kept track of the current row and column to check that you read the correct number of rows and columns. If not, you should give the error message `Not enough values in your sudoku file.`

## Filling in the main method
Now that we have added a new constructor to `Sudoku.java`, we are going to use that constructor to create a `Sudoku` object from a file. We will then turn the `main` method into an interactive `Sudoku` game.

### Creating a `Sudoku` object from a file
The first thing that we need to do is update how we create a `Sudoku` object. Your program should take one command line argument. This command line argument will specify the name of a sudoku file. You should then use this command line argument, along with the constructor that you wrote, to create a `Sudoku` object. So for example, if I run the program as follows, it will read a file called Sudoku1.txt and use that file to construct a `Sudoku` object.

```
java SudokuGame Sudoku1.txt
```

On the course website, I have provided five files called `Sudoku1.txt`, `Sudoku2.txt`, `Sudoku3.txt`, `Sudoku4.txt`, `Sudoku5.txt`. Download them and place it in the same directory as your code.

### Making the `main` method interactive
In the main method, we will write the logic for playing the sudoku game interactively. The game will work as follows: at each step, the program will prompt the user to enter their next move. To enter a “move”, the user will enter three numbers: the row and column where they want to write a number, and the value they want to write.

For example, suppose the user entered “3 1 2”

```
Enter the next row, column, and value (separated by spaces): 3 1 2
```

This would indicate that the user wants to write a 2 at row 3, column 1

The game will either update the grid, or it will tell the user that they are making an invalid move. A move could be invalid because they entered an invalid value, row, or column, or because they tried to put a duplicate number in a row, column, or box.

At any point, instead of entering three numbers, the user can simply enter q to signal that s/he wants to stop playing.

If it’s not clear, you can scroll downwards to see some sample output of what it looks like to play the game.

In the main method, you have two tasks: create a Scanner object, and then write the main loop.

First, create a new Scanner object that will read from standard input.

Next, write a loop that repeatedly asks the user what s/he wants to do next until the user decides they want to quit.

Inside the body of the loop, you want to do the following:
- Print out the current state of the sudoku grid each loop iteration.
- For each `Enter the next row, column, and value (separated by spaces):`
- The user should either enter 3 numbers (separated by spaces), or they should enter a single character.
- If the user enters 3 numbers, you should do the following with those 3 numbers:
    - If the row the user entered is not between `1` and `9`, your code should print out `Invalid row` and move on to the next loop iteration.
    - If the column the user entered is not between `1` and `9`, your code should print out `Invalid column` and move on to the next loop iteration.
    - If the value the user entered is not between 0 and 9, your code should print out `Invalid value` and move on to the next loop iteration. Note that the user can use 0 to erase a square (but they cannot erase a square that was 
    - If the user is attempting to make an invalid move, your code should print out `Invalid move` and move on to the next loop iteration.
    - If the user did enter a valid move, then update the grid with the move that they want to make and move on to the next loop iteration.
- If instead of entering a number the user enters q, then you should immediately terminate the loop.
- If the user did not enter 3 numbers and they did not enter q, then you should print out `Invalid command` and move on to the next loop iteration.

## Commenting your code
As usual, add a JavaDoc style comment to your constructor.

In your constructor use comments to explain how you use variables to keep track of the current row and column. In particular, use comments to explain how you update these variables inside of the loop that reads through all of the file.

Use inline comments to explain how you handle each new character that you read.

In the main method, use comments to explain all of the different steps that you use to check that the user input was a valid command.

## Assignment reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- Where did we use overloading in this assignment?
- What kind of loop (`while` or `for`) did you use in the constructor that you wrote, and why?
- How did we use the lookahead functionality of `Scanner` in this assignment? Describe all of the places where you used `Scanner` lookahead, and describe all of the lookahead methods that you used.
- What kind of loop (`while` or `for`? nested?) did you use in the main method, and why?
- How did you make the `main` method loop terminate when the user enters q?
- Do you have any follow-up questions about this assignment that you would like me to cover in class?
