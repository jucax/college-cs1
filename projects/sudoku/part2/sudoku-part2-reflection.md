# Sudoku Part 2 Reflection
After you finish writing the code, write a reflection that answers each of the following questions: 
- How did we make use of the principle of encapsulation in this assignment?
    - **We are restricting outside access to our variable `grid` making it private, and we are using the new constructor to initialize it and also the new getter and setter methods to interact with this variable, so we are creating an efficient system easy to debug and modify.**
- What return type did you use for `setValue` and why?
    - **Return type `void` because we don’t have any return, it just modifies the array `grid` adding the value of the `val` parameter into the specific `row` and `col` square.**
- How did you account for the discrepancy between the type of indexing used in java arrays and the type indexing that humans usually use when referring to rows and columns in a sudoku grid?
    - **The difference is that the java arrays use 0-based indexing, and humans use numbers from 1-9, to connect this in the code when we want to interact with the `grid` array we have to rest 1 to the number of row and column that the user writes.**