# Wordle Project Part 1
## Getting Started
### Starter code
On the course website I have uploaded a starter code file called `Wordle.java`. Download this file into your dedicated `Wordle` folder. You will then edit this file and fill in all of the code for this assignment.

If you would like, you could also copy the starter code below, paste it into a blank text document, and save it as `Wordle.java`. **You need to use the name** `Wordle.java` **when you save the file, otherwise the code won’t compile**.

```
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;

public class Wordle
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Scanner for reading through the file of words
        FileReader reader = new FileReader("Words.txt");
        Scanner wordScanner = new Scanner(reader);
        
        // ArrayList that will hold all of the possible words that could be chosen
        ArrayList<String> words = new ArrayList<String>();
        
        // Loop as long as we have more words to read in the file
        while(wordScanner.hasNext())
        {
            words.add(wordScanner.next());
        }
        
        Random generator = new Random();
        
        // Pick a random position in the ArrayList of words
        int correctPos = generator.nextInt(words.size());
        // Retrieve the word at our randomly selected position
        String correctWord = words.get(correctPos);
        
        // DON'T MODIFY THE CODE ABOVE THIS
        
        // YOUR CODE GOES HERE
        
        // DON'T MODIFY THE CODE BELOW THIS
    }
}
```

There is quite a bit of code already included in the file, and at this point in the course it probably looks like gibberish. However, by the time you finish the course all of the starter code will make perfect sense to you. For the time being, all you need to know is that the code reads in words from a file, and randomly picks out the word that the user is supposed to guess.

In addition to the starter code, I have posted a file on the course website called `Words.txt`. This is a simple text file that contains all of the possible words that our Wordle game could select as the mystery word. **Please download this file and put it in the same directory as your code**.

### Compiling and running your code
To compile your code use the following command:
```
javac Wordle.java
```

The compiler will attempt to translate your code into machine code that your computer can execute. If you have syntax errors, the compiler will point out what errors you have and where each error occurs. Otherwise, if your code compiles without errors, when you use the ls or dir command you will see a new file called `Wordle.class`. This is the machine code that your computer will understand how to execute.

To run your code, use the following command:

```
java Wordle
```

Alright - let’s get started building a Wordle game!

## `maxGuesses` variable
Create a variable of type `int` called `maxGuesses`. This variable represents how many times the user is going to be allowed to guess the word. The value of this variable should be exactly one more than the number of letters in the word. To calculate this, you can make use of the `correctWord` variable that was created as part of the starter code, as well as the `length` method for `String`s.

**Note**: Because the word is always 5 letters long, we could simply initialize it to 6. However, you will not receive any credit if you do this. You must initialize it in the manner described above.

## `welcomeMessage` variable
Create a `String` variable called `welcomeMessage` that contains the following contents:

```
Welcome to Wordle!
Try to guess the 5-letter word in 6 guesses!
```

Your `welcomeMessage` variable needs to include the two line breaks shown above for full credit.

After you create your `String` variable, print it out.

## Soliciting user input
Next, let’s set up some of the code we’ll use to get the user input. Do the following:
1. Create a `Scanner` object that reads from standard input.
2. Prompt the user to enter a word with the following message:

```
Make your next guess: 
```

3. Read the word that the user entered and store it in a `String` variable called `guess`.

## Final message
Finally, print out the following:

```
The correct word was: ___
```

However, you should fill in the blank with the correct word. So for example, if the word that the user is trying to guess is `satin`, then you should print out the following:

```
The correct word was: satin
```

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

Make your next guess: steam
The correct word was: abode
```

The words in the last two lines will be different every time you run it, but otherwise your output should look exactly like this.

## Assignment reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- List all of the operators that were used in this assignment
    - Where and why did you use `String` concatenation in this assignment?
- Where and why did you use escape sequences in this assignment?
- As mentioned above, we know that `maxGuesses` will always be 6. Despite this, we took the trouble to calculate maxGuesses as the number of letters in the word plus one.
    - What is the benefit of making a variable called maxGuesses instead of just using the number 6 throughout our code?
    - What is the benefit of calculating `maxGuesses` (by adding 1 to the length of the word) in the way that we did instead of directly initializing it to 6?
