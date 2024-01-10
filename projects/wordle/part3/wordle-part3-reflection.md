# Wordle Part 3 Reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- What kind of loop did you use (while, do while, or for) to construct the feedback? Why?
    - **I used "for" because we know the number of times the loop must be repeated, in this case it is the number of guesses for the user and the number of characters of the guess.**
- If you used a while or do while loop, explain your loop condition. If you used a for loop, explain each of the three parts (initialization, loop condition, and update) of your for loop.
    - **For the first loop that asks and scan the guess of the user, I initialize a new variable "i", then in the loop condition, I compare if "i" is less than the maximum number of guesses to repeat it only six times, and finally in the update I increase "i" plus 1.**
    - **In the second loop we check and print the feedback of each character, so we initialize another variable called "j", then we compare it with the length of the correct word so that the process repeats for the five guess characters, and finally we update by adding 1 to "j".**
- What will happen if the user guesses the word in fewer than 6 guesses?
    - **I added inside the loop a condition that checks if the word is correct in all the characters to check at each attempt if the word is correct and if so, print the congratulation message and break the loop.**
- Where in your code did you initialize your variable to keep track of the number of correct letters, and why?
    - **I initialized it outside the loops, because if it is initialized inside the “for”, the program has a problem when compiling because the variable would be initialized every time and the count would not be correct either.** 