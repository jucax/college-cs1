# Wordle Project Part 2
## Getting Started
### Helpful functions
Before we go over how to add feedback, let’s go over two `String` methods that you will need to use: `charAt` and `contains`. The charAt method tells you what character is located at a specific position in the String. Here is some example code that shows how you can use it:

```
String myString = "Star Wars";

char ch1 = myString.charAt(0); // 'S'
char ch2 = myString.charAt(3); // 'r'
char ch3 = myString.charAt(4); // ' '
char ch4 = myString.charAt(8); // 's'
```

Notice how all of the indexing starts at 0.

The contains method tells you whether a String contains a certain other String. Here is some code example that shows how you can use it:

```
String myString = "Star Wars";

boolean b1 = myString.contains("Star"); // true
boolean b2 = myString.contains("War"); // true
boolean b3 = myString.contains("tar"); // true
boolean b4 = myString.contains("ar Wa"); // true

boolean b5 = myString.contains("ratS"); // false
boolean b6 = myString.contains("tarWars"); // false
boolean b7 = myString.contains("war"); // false
boolean b8 = myString.contains("STAR"); // false

boolean b9 = myString.contains('a'); // this will cause an error
boolean b10 = myString.contains('a' + ""); // Use concatention to convert 'a' from char to a String
boolean b11 = myString.contains('z' + "");
```

The last three examples show how you can (and can’t) search for a single character within a String.

Let’s get into expanding our Wordle game!

## Giving feedback
After every Wordle guess, the game provides feedback on which letters are correct, misplaced, or incorrect. The online game does so using colors. We will do so by printing out a feedback message underneath the word the user guessed. We will print out a 5-letter feedback `String`; the first character of our feedback `String` will indicate the status of the first character that the user guessed, and so on. 

Our feedback String will comprise of the following three symbols:
- `$`: a correct character
- `*`: a misplaced symbol
- `-`: an incorrect symbol

For example: suppose the correct word is abode, and suppose the user guesses bards.

- **Position 1**: The letter b is misplaced - it should be at position 2
- **Position 2**: The letter a is misplaced - it should be at position 1
- **Position 3**: The letter r is incorrect - there is no r in abode
- **Position 4**: The letter d is correct - it is at its proper position
- **Position 5**: The letter s is incorrect - there is no s in abode

Thus our feedback string will be `**-$-`.

### Feedback on letter 1
The first task will be to print out the correct feedback symbol for the first character the user entered. Do the following:

1. Retrieve the first character of the correct word.
2. Retrieve the first character of the word that the user guessed.
3. If the two characters match, print out `$`.
4. If the two characters don’t match, but the character the user guessed is part of the String, then print out `*`.
5. If neither of the above conditions hold, then the character must be incorrect, so print out `-`.

### Feedback on letters 2-5
After you write the code for giving feedback on letter 1, you will write the code to give feedback on letters 2-5! The process is pretty much the same - it’s just that you are comparing letter 2 of the guess with letter 2 of the correct word; then letters 3 of each word, then letters 4, and then letters 5.

**This should involve lots of copying and pasting!**

## Counting correct letters
In addition to giving symbolic feedback, you should count how many letters the user guessed correctly (as in completely correct - not misplaced), and give corresponding feedback.

At the end of the program, if the user guessed all 5 letters correctly, your program should print out the following message:

```
Congrats! You guessed the word!
```

If the user got 1 letter correct, your program should print:

```
You got 1 letter correct

The correct word was ___
```

Otherwise your program should print:

```
You got ___ letters correct

The correct word was ___
```

However, you should fill in the blank with the number of letters that the user got correct. In both of the last two cases you should reveal the correct word (since the user did not guess it). You already wrote the code for revealing the word in assignment 1, and you should re-use that code here.

## Formatting your output
We want to make sure that the feedback is not only functional, but as easy to interpret as possible. For this assignment, this will involve two tasks.

First, make sure that your feedback String lines up with the user’s guess. This means you should print out several spaces before you start printing out feedback symbols.

Second, you should make sure that there is a blank line in between the feedback and any output that comes after it. Additionally, there should be a blank line in between the number of letters the user got correct and the line that reveals the correct word.

**You will lose 5 points if your output is not formatted correctly**. If you need more clarification on this, take a look at the Testing your code section.

## Commenting your code
You should leave inline comments that delineate which sections of your code give feedback on the first letter, the second letter, etc.

You should use comments to explain your conditional logic for the first feedback symbol. You do not need to do this for feedback symbols 2-5.

You should use comments to explain the conditional logic that you used for the final output in which you tell the user how many letters they got right (or congratulate them on guessing the word).

Finally, make sure you use comments to the code you use to format our output correctly.

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
                      ---$$

You got 2 letters correct

The correct word was: shine
```

Here are some other samples of output that you might get

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: shine
                      -$$$-

You got 3 letters correct

The correct word was: rhino
```

```
Try to guess the 5-letter word in 6 guesses!

Make your next guess: style
                      -*--$

You got 1 letter correct

The correct word was: quote
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: wrote
                      ---$$

You got 2 letters correct

The correct word was: haste
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: bulge
                      ----*

You got 0 letters correct

The correct word was: hover
```

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!

Make your next guess: grape
                      $$$$$

Congrats! You guessed the word!
```

**Pay close attention to how the output is formatted.** All of the feedback symbols are lined up with the word that the user guessed. Furthermore, there is a blank line in between the feedback and the next line of output. You will lose points if your output is not formatted properly.

## Assignment reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- Explain how you structured your conditional logic for the feedback symbols. In particular, how did you use `if`, `else if`, and/or `else` statements, and why?
- Did you use `System.out.print` or `System.out.println` when you printed your feedback symbols? Why?
- How would your program behave if the user entered a `String` that was not exactly 5 letters long? Why?
- What will happen if a user guesses a word that has repeat letters? Why?
- Explain how and why you made use of a variable or variables to count the number of correct letters.

Additionally, if you received help from another student in the class or from a departmental tutor, please state what help you received and which parts of the assignment you received help on.
