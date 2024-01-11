# Wordle Project Part 4
## Rewriting the code for guesses and feedback
In part 3 we expanded our program to give the user 6 guesses. For each guess, we used a loop to go through the string the user guessed and to give feedback. However, we re-used and re-wrote the same loop six times. More broadly, we re-wrote the code for soliciting and analyzing a single guess - including prompting the user for a guess and reading their input.

In part 3 you were explicitly prohibited from using nested loops. In this assignment, you will re-write the code from part 3; this time, you will take advantage of nested loops in order to make your code more concise. **For full credit, you must use a nested loop to complete this assignment.**

Your nested loops should make use of the `maxGuesses` variable that was created in part 1.

## Ending the game if the user guesses correctly
If the user manages to guess the correct word, your program should immediately stop asking the user for input and print out the following message:

```
Congrats! You guessed the word in ___ guesses!
```

However you should fill in the blank with the number of guesses the user needed.

## Counting correct letters in the final guess
Once again, we want our program to count how many letters the user guessed correctly in the final guess. However, the fact that we are using nested loops will make this task slightly trickier than it was in part 3. Think carefully about how you initialize and update your variable that keeps track of the number of correct letters.

## Final output
Once the user is done guessing (either because they guessed the word or ran out of guesses), your program should print out a final message. If the user correctly guessed the word in just one guess, your program should print out the following:

```
Congrats! You guessed the word in 1 guess!
```

If they guessed it correctly but needed multiple guesses, your program should print out the following

```
Congrats! You guessed the word in ___ guesses!
```

However you should fill in the blank with the number of guesses the user needed in order to guess the word.

If, on the other hand, the user did not guess the correct word, your program should reveal how many letters they got correct on their final guess, and reveal what the correct word was. If the final guess contains one correct letter, your program should print:

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

## Formatting your output
For full credit, your output needs to be formatted correctly. In particular, the feedback symbols should be lined up with the guess that the user typed in, and there should be a line break after every feedback. If the user did not guess the word, there should be a line break in between revealing how many letters the user guessed correctly and revealing what the correct word was.

**You will lose 5 points if your output is not formatted correctly**. If you need more clarification on this, take a look at the Testing your code section.

## Commenting your code
You should write a multiline comment explaining the logic of your nested loops, and you should leave a multiline comment explaining the structure of the conditional logic that you use to print out the message at the end.

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

Make your next guess: grape
                      -----

Make your next guess: plods
                      --*-$

Make your next guess: words
                      -$--$

Make your next guess: point
                      -$$$-

Make your next guess: coins
                      $$$$$

Congrats! You guessed the word in 5 guesses!
```

Here are some other output samples

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: steam
                      ---*-

Make your next guess: brave
                      -$$--

Make your next guess: grain
                      $$$$$

Congrats! You guessed the word in 3 guesses!
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: crate
                      -$*-*

Make your next guess: grape
                      -$*-*

Make your next guess: break
                      -$$$-

Make your next guess: great
                      -$$$-

Make your next guess: wreak
                      -$$$-

Make your next guess: creak
                      -$$$-

You got 3 letters correct

The correct word was: dream
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: grimy
                      *-*--

Make your next guess: tinge
                      *$-*-

Make your next guess: ingot
                      *-$-$

Make your next guess: begin
                      --$*-

Make your next guess: pivot
                      -$--$

Make your next guess: tivet
                      *$--$

You got 2 letters correct

The correct word was: fight
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: quine
                      -----

Make your next guess: style
                      *----

Make your next guess: paste
                      *-*--

Make your next guess: sport
                      **$*-

Make your next guess: ports
                      ***-$

Make your next guess: savor
                      *--**

You got 0 letters correct

The correct word was: crops
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: crane
                      --**-

Make your next guess: saint
                      *$-*-

Make your next guess: nasty
                      *$*--

Make your next guess: rasno
                      -$**-

Make your next guess: satin
                      *$--*

Make your next guess: satin
                      *$--*

You got 1 letter correct

The correct word was: fangs
```

It will be different every time, but your output should resemble this.

## Assignment reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- For the code that simulated playing the game, what kind of loop did you use (`while`, `do while`, or `for`) for each level of your nested loops? Why did you make these choices?
- How did you make sure that your program knew when to stop prompting for user input? In particular, what did you do to check if the user had solved the puzzle, and how did you then use this information to make sure the program stopped asking the user to make more guesses?
- Where in your code did you initialize the variable that counts how many letters the player guessed correctly? Why?
- How did you keep track of how many guesses the user had used up?
