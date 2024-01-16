# Sudoku Part 4 Reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- Did you use nested loops to write `isValid`? Why or why not?
    - **No, I used separated For-Each loops. Because we can write a different loop to iterate through the values of row, column and box and compare each of these values with the new value that will be placed to verify if it is possible or not.**
    - **I think this is efficient because if we find a conflict the method returns false and immediately terminates execution, so there is no need to check for more conflicts.**
- Why do you think it is useful/important for us to write the `isValid` method? What benefits do you think this will have down the line?
    - **This is a very useful method because in the future when the user will interact with the Sudoku, the program can easily determine if it is valid or not, and depending on the return add the value to the grid or request the user to enter a new value or change the position.**