# Sudoku Project Part 3
## Import ArrayLists
Import ArrayLists
Add the following line of code at the very very tip top of your `Sudoku.java` file:

```
import java.util.ArrayList;
```

That’s it. You won’t be able to complete the rest of the assignment without doing this.

## `getRowValues` method
Write a `private` method called getRowValues. This method has a single `int` parameter called `row`. It returns an `ArrayList<Integer>` of all the values that are in that row of the grid. The parameter `row` will be a row number between 1 and 9 (which is in contrast to the fact that java array indices start counting at 0). Here are some examples from the grid above:
- `getRowValues(2)` should return an `ArrayList<Integer>` containing `6`, `1`, `9`, and `5` (in any order)
- `getRowValues(7)` should return an `ArrayList<Integer>` containing the values `6`, `2`, and `8` (in any order)

## getColumnValues method
Write a `private` method called `getColumnValues`. This method has a single `int` parameter called `col`. It returns an `ArrayList<Integer>` of all the values that are in that column. The parameter `col` will be a box number between `1` and `9` (which is in contrast to the fact that java array indices start counting at `0`).  Here are some examples from the grid above:
- `getColumnValues(2)` should return an `ArrayList<Integer>` containing `3`, `9`, and `6` (in any order)
- `getColumnValues(9)` should return an `ArrayList<Integer>` containing `3`, `1`, `6`, `5`, and `9` (in any order)

## `getBoxValues` method
Write a `private` method called `getBoxValues`. This method has a single int parameter called box. It returns an `ArrayList<Integer>` of all the values that are in that particular “box”.

The parameter `box` will be a box number between 1 and 9. Here is a diagram that shows which squares correspond to which box:

![sudoku-boxes](https://github.com/jucax/college-cs1/blob/e9dbc41844579fc7b1d13d3609fc6fc6b6645d84/projects/images/sudoku-boxes.png?raw=true)

Here are some examples from the example grid we’ve been using:
- `getBoxValues(1)` should return an `ArrayList<Integer>` containing `5`, `3`, `6`, `9`, and `8` (in any order)
- `getBoxValues(5)` should return an `ArrayList<Integer>` containing the values `6`, `8`, `3`, and `2` (in any order)

## Hints for `getRowValues`, `getColumnValues`, and `getBoxValues`
- Remember that the `row`, `col`, and `box` parameters are numbers between `1` and `9`, but java indices start at `0`. This may get really confusing to remember each time. But luckily you don’t have to keep switching between the two modes of thinking. Simply use the `getValue` method every time you want to get the number from a particular row and column, and that way you can always use familiar 1-based indexing. The `getValue` method will handle converting from 1-based indexing to 0-based indexing. Note that hopefully this illustrates the advantage of writing methods - once you get the method right, you can re-use it without having to re-debug it, and you only have to focus on what the method does rather than how the method works.
- Don’t forget to make these three methods `private`
- Remember, some squares contain a 0 as a placeholder, to indicate that the square is empty. You want to ignore these squares when you are adding values to your `ArrayList`
- For the `getBoxValues` method, try to figure out the left-most and top-most square of the box for that row and column. For example, box 1 starts at row 1, column 1. Box 8 starts at row 7, column 4. Once you figure out the starting row and column, you can then write a nested loop to go through all the squares in the box.
    - One approach would be to use a long chain of `if/else` statements. If you do this, you may want to take advantage of the fact that you can declare a variable on one line and initialize it on a different line.
    - There is, however, a formula you can use to convert a box number into its topmost row (and similarly, there is a formula that converts a box number into its leftmost column). This formula requires very clever use of the integer division (`/`) and modulus (`%`) operators. **You will receive 5 extra credit points if you correctly use this approach.**
- You may find it more palatable to focus on one method at a time. Unfortunately, if you leave a method blank, the compiler will generate an error because each method needs to be guaranteed to `return` an `ArrayList<Integer>` object. Instead you can do the following: have the method create an `ArrayList<Integer>` variable, and then immediately `return` it. This is obviously incorrect from a logic standpoint, but it will placate the compiler and allow you to test the methods that you actually did try to write. Later, when you are ready, you can move on to adding in the logic to actually fill in the `ArrayList<Integer>` variable with values.

## printRow, printCol, printBox methods
Write the following three public methods in the `Sudoku` class:
- Write a `public` method called `printRow`. It does not return anything. It has a single parameter `int row`. It uses the `getRowValues` method to obtain all of the non-zero values in that `row`. It then prints out all of the row values one at a time, all on the same line, separated by spaces.
- Write a `public` method called `printCol`. It does not return anything. It has a single parameter `int col`. It uses the `getColumnValues` method to obtain all of the non-zero values in that `col`. It then prints out all of the column values one at a time, all on the same line, separated by spaces.
- Write a `public` method called `printBox`. It does not return anything. It has a single parameter `int box`. It uses the `getBoxValues` method to obtain all of the non-zero values in that `box`. It then prints out all of the box values one at a time, all on the same line, separated by spaces.

## Commenting your code
As usual, each of your methods should include a JavaDoc style comment.

Since the `getBoxValues` method is relatively complicated, I expect you to include inline comments. Your comments should focus on explaining the following:
- What was the purpose of each loop that you used?
- How did you determine the bounds of the loops?
- Every time you create a variable, explain what that variable represents/what its purpose is in the algorithm.
- If you used a chain of if/else statements, explain your logic.
- Alternatively, if you end up using the clever modulus/division approach, you should use comments to explain your formula to the best of your abilities. 

## Assignment reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- Why do you think we made our three methods return an `ArrayList`, as opposed to an array?
- Which wrapper class(es) did we use in this assignment
- How did you take advantage of auto-boxing in the `getRowValues`, `getColumnValues`, and `getBoxValues` methods??
- How did you use auto-unboxing in the `printRow`, `printCol`, and `printBox` methods?
- Of the six methods you wrote, which ones used nested loops, and which ones did not? Why did you make these choices?
- Do you have any follow-up questions about this assignment that you would like me to cover in class?

Additionally, if you received help from another student in the class or from a departmental tutor, please state what help you received and which parts of the assignment you received help on.

