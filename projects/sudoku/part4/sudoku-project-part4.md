# Sudoku Project Part 4
## `getBoxNumber` method
First, we are going to write a `private` helper method called `getBoxNumber`. This method has two parameters: `int row` and `int col`. The method returns the “box number” to which the square at that particular row and column belongs.

![sudoku-boxes](https://github.com/jucax/college-cs1/blob/e9dbc41844579fc7b1d13d3609fc6fc6b6645d84/projects/images/sudoku-boxes.png?raw=true)

This diagram illustrates what we are trying to calculate:
- rows 1-3:
    - rows 1-3, columns 1-3 = box 1
    - rows 1-3, columns 4-6 = box 2
    - rows 1-3, columns 7-9 = box 3
- rows 4-6:
    - rows 4-6, columns 1-3 = box 4
    - rows 4-6, columns 4-6 = box 5
    - rows 4-6, columns 7-9 = box 6
- rows 7-9
    - rows 7-9, columns 1-3 = box 7
    - rows 7-9, columns 4-6 = box 8
    - rows 7-9, columns 7-9 = box 9

Hint: there are a couple of approaches to try to convert a row/column pair into a box number. One way is to use a series of (nested) `if` statements. There is also a formula that makes clever use of the division (/) operator. **You will receive 5 extra credit points if you correctly use this approach.**

## `isValid` method
Next, we will write a method that allows us to determine if we are allowed to place a particular number in a particular sudoku square.

Write a `public` method `isValid` that takes three parameters: `int row`, `int col`, `int val`. The method has a `boolean` return type. It returns `true` if we are allowed to put the given value at the given `row` and `col`, and `false` otherwise.

![sudoku-example](https://github.com/jucax/college-cs1/blob/59b50129ec7f20979e569d7a85d17f742b748b86/projects/images/sudoku-example.png?raw=true)

In the above example:
- `isValid(6, 3, 1)` would return `true` - there’s no conflict
- `isValid(1, 8, 5)` would return `false` - there is already a 5 in row 1
- `isValid(8, 9, 6)` would return `false` - there is already a 6 in column 9
- `isValid(3, 4, 7)` would return `false` - there is already a 7 in that box
- `isValid(2, 4, 3)` would return `false` - there’s no conflict, but that square was already filled in at the start, so we are not allowed to change the value of that square.
- `isValid(6, 7, 8)` would return `true` - there’s no conflict

Make use of the `getRowValues`, `getColumnValues`, and `getBoxValues` to determine what values are not allowed at the given `row` and `col`. Then, check if the parameter val matches any of the illegal values.

Before calling the `getBoxValues` method, you’ll need to determine what “box” the given `row` and `col` are a part of. You’ll use your `getBoxNumber` method for this.

Hint: If you find just one conflict, there is no need to check for more conflicts. Try to write your method so that if it finds a conflict, it immediately `return`s `false` without continuing to search. Take advantage of the fact that executing any one `return` statement immediately terminates execution of the entire method.

## Commenting your code
As usual, each of your methods should include a JavaDoc style comment.

Your `getBoxNumber` method should have inline comments explaining your approach and your coding logic.

Your `isValid` method should have inline comments that explain the purpose of each loop and each conditional block that you use. You should also write a comment for all `return` statements that you use.

## Assignment reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- How did you check whether we were illegally trying to modify a grid square that was not initially empty?
- Suppose we try to modify a square that was not empty at the start - but we attempt to insert the exact same value that was there at the start. This doesn’t technically violate the rules of the game. Will your `isValid` method return `true` or `false`?
- Recall that `0` is used to denote an empty square. What will your `isValid` method return if we input `0` as the third argument, as a way to “erase” one of the grid values? 
- Did you use nested loops to write `isValid`? Why or why not?
- Why do you think it is useful/important for us to write the `isValid` method? What benefits do you think this will have down the line?
- Do you have any follow-up questions about this assignment that you would like me to cover in class?

Additionally, if you received help from another student in the class or from a departmental tutor, please state what help you received and which parts of the assignment you received help on.
