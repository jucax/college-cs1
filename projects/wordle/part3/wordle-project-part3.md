# Wordle Project Part 3
## Rewriting the feedback for the first guess
Write a loop that provides feedback on the user’s first guess. The way you compute the feedback should be the same as how you did it in the previous assignment: for every letter that the user guessed, you should output `$` for a correct letter, `*` for a misplaced letter, and `-` for an incorrect letter. However, this time you will use a loop to go through each of the letters and compute each feedback symbol.

After you finish this section, you can compile and run your code - you should get the same behavior as you did for part 3. If so, you can move on to the next section of the assignment.

## Guesses 2-6 (with feedback)
Currently our program prompts the user for a single guess and then provides feedback on that guess. Add code so that your program does this five more times. Repeat the process of prompting the user for a guess, and then providing feedback on that guess.

**This should involve lots of copying and pasting!**

## Counting correct letters in final guess
In addition to giving symbolic feedback after each guess, you should count how many letters the user guessed correctly (as in completely correct - not misplaced) in their final guess, and give corresponding feedback.

At the end of the program, if the user’s final guess contains 5 correct letters, your program should print out the following message:

```
Congrats! You guessed the word!
```

If the final guess contains one correct letter, your program should print:

```
You got 1 letter correct

The correct word was ___
```

Otherwise your program should print:

```
You got ___ letters correct

The correct word was ___
```

However, you should fill in the blank with the number of letters that the user got correct. In both of the last two cases you should reveal the correct word (since the user did not guess it). You already wrote the code for revealing the word in part 1, and you should re-use that code here.

You do not need to print this out after every guess; you only need to print this message out after the final guess, and the correct letters should be based on the final guess (and not previous guesses).

## Formatting your output
For full credit, your output needs to be formatted correctly. In particular, the feedback symbols should be lined up with the guess that the user typed in, and there should be a line break after every feedback.

**You will lose 5 points if your output is not formatted correctly.** If you need more clarification on this, take a look at the Testing your code section.

## Commenting your code
For the user’s first guess, please leave a multiline comment that clearly explains the structure of your loop. Additionally, please leave inline comments that indicate where your code handles guesses 2-6.

## Testing your code
Compile your code using the following command:

```
javac Wordle.java
```

Run your code using the following command:

```
java Wordle
```

You should get output that looks like this:


```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: crane
                      -***-

Make your next guess: stark
                      --**-

Make your next guess: train
                      -**-*

Make your next guess: range
                      *$$--

Make your next guess: waner
                      -$$-$

Make your next guess: manor
                      $$$$$

Congrats! You guessed the word!
```

Here is some other sample output

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: quite
                      --$-$

Make your next guess: while
                      --$-$

Make your next guess: spite
                      *-$-$

Make your next guess: pride
                      --$-$

Make your next guess: guise
                      --$$$

Make your next guess: poise
                      -$$$$

You got 4 letters correct

The correct word was: noise
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: urban
                      *----

Make your next guess: quite
                      -*---

Make your next guess: snafu
                      *--**

Make your next guess: frown
                      $-*--

Make your next guess: foist
                      $$-*-

Make your next guess: forum
                      $$-$-

You got 3 letters correct

The correct word was: focus
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: quite
                      ----$

Make your next guess: quite
                      ----$

Make your next guess: quite
                      ----$

Make your next guess: quite
                      ----$

Make your next guess: quite
                      ----$

Make your next guess: quite
                      ----$

You got 1 letter correct

The correct word was: abode
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: bring
                      -*---

Make your next guess: brain
                      -*$--

Make your next guess: grain
                      -*$--

Make your next guess: grape
                      -*$--

Make your next guess: grace
                      -*$--

Make your next guess: fling
                      -----

You got 0 letters correct

The correct word was: stark
```

It will be different every time, but your output should resemble this.

## Assignment reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- What kind of loop did you use (`while`, `do while`, or `for`) to construct the feedback? Why?
- If you used a `while` or `do while` loop, explain your loop condition. If you used a `for` loop, explain each of the three parts (initialization, loop condition, and update) of your for loop.
- What will happen if the user guesses the word in fewer than 6 guesses?
- Where in your code did you initialize your variable to keep track of the number of correct letters, and why?
