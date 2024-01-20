# Sudoku Part 5 Reflection
After you finish writing the code, write a reflection that answers each of the following questions: 
- Where did we use overloading in this assignment?
    - **In the new constructor that we just created, because it has the same name as the one that we created before, but in this case the parameter is type String, and also the performance is very different although when we call them they might look like the same method.**
- What kind of loop did you use in the constructor that you wrote, and why?
    - **I used nested loops because It is the easiest form to iterate through the 2D array that represents the grid, and then we can read each character from the document and use that same variables from the loop to add it in the correct position of the array.**
- How did we use the lookahead functionality of Scanner in this assignment?
    - **When we read the document, we use a while and `.hasNext()` to read all the characters and insert them in the array.**
    - **We also use lookahead in the main method to read the characters that the user introduces and depending on the data type we change the performance of the code, in this case we want to know if it is an int type with `.hasNextInt()`.**
- What kind of loop (`while` or `for`? nested?) did you use in the main method, and why?
    - **We use a while with a condition that is always true, because we want the loop to always execute, and then depending on the conditions inside, we can use `continue;` when the user induces something invalid and repeat the loop or we can use `break;` and finish the loop that means finish the game.**
