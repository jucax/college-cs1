# Sudoku Part 1 Reflection
After you finish writing the code, write a reflection that answers each of the following questions: 
- Why do you think we are creating our own custom `Sudoku` class instead of using java’s built-in classes?
    - Because we can have better control of the variables and the behavior of the program, we can also create methods to do the thing easy and probably in the future we can take advantage of encapsulation, or maybe we can create a lot of sudoku objects with the same parameters and methods.
- Why do you think we are using an `int[][]` (as opposed to a 1-D array or an `ArrayList`) to represent the Sudoku `grid`?
    -Because the 2-D array literally forms the data into rectangles, and it is easier to visualize them, and with a little formatting we can achieve an output very similar to a real sudoku. We can also easily modify the size of our sudoku by modifying the rows and columns of the array.
- Where and how did we make use of `String` concatenation?
    - In the toString method we are getting the value of each space in the array and attaching it to a variable called row by concatenation which stores each value with a blank space, and adds the format symbols with the help of the if conditionals.
- Why do we need to use nested loops in the `toString` method?
    - It is the most efficient way to iterate through all the values in the 2-D array, looping all the rows and columns, and it works for any size of the array because it uses the array's length method and not a specific number.