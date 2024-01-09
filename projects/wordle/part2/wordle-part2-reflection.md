# Wordle Part 2 Reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- Explain how you structured your conditional logic for the feedback symbols. In particular, how did you use if, else if, and/or else statements, and why?
    - **The if statement “if” is the option because we have to verify some conditions.**
    - **The first “if” verifies if the “guess” character is equal to the character of the correct word, if it is correct the code jumps to the next digit.**
    - **If the first “if” is false, then we use a “if else” to verify if the correct word contains the character of the “guess”.**
    - **If this also fails the only option is that the character is wrong, so we can use a “else” because we won’t write any other condition.**
- Did you use System.out.print or System.out.println when you printed your feedback symbols? Why?
    - **In the first four characters I used just “print” because I want the characters to be next to each other so that they line up with the word entered by the user.**
    - **In the last character I used “println” to leave the next line free so that the message can be read well.**
- How would your program behave if the user entered a String that was not exactly 5 letters long? Why?
    - **The code will use if as a 5-character string because we haven't added a statement that checks the number of characters in the word the user enters and sends a message if it is not 5 letters long, but we should do that soon.**
- What will happen if a user guesses a word that has repeat letters? Why?
    - **Nothing, because the code verifies character by character.**
- Explain how and why you made use of a variable or variables to count the number of correct letters.
    - **I created a new variable called "correctLetters" and assigned it a value of zero, then in each "if" where the code checks if the character is correct, I added a "++" counter so only one line of code is needed for each character, and in the final message I just printed the variable.**