# Sudoku project introduction
## Introduction
Sudoku is a puzzle in which you try to fill a grid with numbers according to certain rules. You have a 9x9 grid (so 81 total squares), and you want to put a number into each square. But you have to follow certain rules:
- You can only write the numbers 1-9
- You cannot have the same number appear twice in the same row
- You cannot have the same number appear twice in the same column
- You cannot have the same number appear twice in the same “box”

Here is a picture of what it looks like:

![sudoku-example](https://github.com/jucax/college-cs1/blob/59b50129ec7f20979e569d7a85d17f742b748b86/projects/images/sudoku-example.png?raw=true)

First, notice how the darker lines divide it into nine 3x3 “boxes”. You can’t have the same number appear twice in the same box.

Take a look at row 7, column 9:
- You can’t put a 2, 6, of 8 in that square because you would be violating the “same row” rule
- You can’t put a 1, 3, 5, 6, or 9 in that square because you would be violating the “same column” rule
- You can’t put a 2, 5, 7, 8, or 9 in that square because you would be violating the “same box” rule.

For this project, you will be writing code that allows a user to interactively solve a sudoku puzzle. Eventually, you will write code that gives the user the option to give up and have the computer solve the Sudoku automatically. 

## Programming Style
For all parts of this project, we will grade you on programming style, and we will deduct points if your code has poor style. Here is a brief refresher on what we are looking for when you grade you on style:
- Anytime you create a new set of curly braces, the code inside the curly braces should be indented one extra level. This includes the body of any conditional, loop, method, or class.
- Put a space on both sides of every binary operator.
- Use descriptive variable names.
- Comment your code!
    - Leave inline comments wherever required.
    - Use javadoc style comments for all of your methods.
