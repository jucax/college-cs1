# Wordle Part 4 Reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- For the code that simulated playing the game, what kind of loop did you use (while, do while, or for) for each level of your nested loops? Why did you make these choices?
    - I made a nested loop of one “for” inside another “for”. The first “for” ask for the input, count the correct letters and verifies if the user guessed the word before the max guesses, this process is repeated until the loop variable is equal to the maxGuesses variable.
    - The second “for” that is inside the first one, verifies each character of the guess and prints the feedback, this operates while the loop variable is less than the length of the correct word.
- How did you make sure that your program knew when to stop prompting for user input? In particular, what did you do to check if the user had solved the puzzle, and how did you then use this information to make sure the program stopped asking the user to make more guesses?
    - I added a conditional “if” that verifies if the number of correct letters is equal to five, then the guess is correct and the loop prints the congratulation message with the number of guesses used and breaks the loop with a “break” statement to stop asking the user to make more guesses.
- Where in your code did you initialize the variable that counts how many letters the player guessed correctly? Why?
    - I initialized it before the loops, because I knew that it had to start in zero, and also because it can’t be initialized inside the loops and repeat that process for each cycle.
- How did you keep track of how many guesses the user had used up?
    - With the variable “i” initialized in the first loop that increments by one after giving the feedback of each guess and stops the loop if it is equal to the previously declared variable “max Guesses”.
