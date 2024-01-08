# Wordle Part 1 Reflection
After you finish writing the code, write a reflection that answers each of the following questions: 
- List all of the operators that were used in this assignment
    - **Arithmetic Operators used: +**
    - **Assignment Operators used: =**
    - Where and why did you use `String` concatenation in this assignment?
        - **I used to print the welcome message, I used it to print two sentences in different lines using only one line of code.**
-  Where and why did you use escape sequences in this assignment?
    - **In the welcome message I used the escape character “\n” to divide the text in two lines.**
- As mentioned above, we know that `maxGuesses` will always be 6. Despite this, we took the trouble to calculate `maxGuesses` as the number of letters in the word plus one.
    - What is the benefit of making a variable called `maxGuesses` instead of just using the number 6 throughout our code?
        - **We can use the same variable for all the words, the quantity of characters doesn’t matter.**
    - What is the benefit of calculating `maxGuesses` (by adding 1 to the length of the word) in the way that we did instead of directly initializing it to 6?
        - **We won’t need to update the code for bigger words, because it is directly related to the “.length()” of the correct word.**