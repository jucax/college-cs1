# Wordle project introduction
## Introduction
Wordle is a web-based word game in which the player tries to guess a 5-letter word in six guesses or fewer. After each guess, the game tells the player how close they were to getting the correct answer. In particular, the game goes through each letter and tells the player one of three possible pieces of information:

1. **Incorrect:** the letter is not part of the word
2. **Misplaced:** the letter is part of the word, but it is in the wrong position
3. **Correct:** the letter is in the correct position

Here is a picture that illustrates the gameplay:

![wordle-example](projects/images/wordle-example.png)

The player managed to guess the word in four guesses. After each guess, the game tells the player how “correct” each letter is. Gray letters are incorrect, yellow letters are misplaced, and green letters are correct.

If you are still unsure or curious, try playing the game yourself! The New York Times posts a new Wordle word each day.

In this project, we will be using the skills we have learned in this class to recreate the logic behind Wordle, and create a more basic version of it that you can play on your computer!

For simplicity we will design our game so that none of the words have duplicate letters.

## Programming Style
For all parts of this project, we will grade you on programming style, and we will deduct points if your code has poor style. Here is a brief refresher on what we are looking for when you grade you on style:
- Anytime you create a new set of curly braces, the code inside the curly braces should be indented one extra level. This includes the body of any conditional, loop, method, or class.
- Put a space on both sides of every binary operator.
- Use descriptive variable names.
- Comment your code!
    - Leave inline comments wherever required.

For this project you will not need to include JavaDoc method comments, but you should follow all of the other style guidelines.

