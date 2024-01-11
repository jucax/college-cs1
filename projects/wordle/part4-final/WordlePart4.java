import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;

public class WordlePart4
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Read through all files in Words.txt one by one and add them into an ArrayList
        FileReader reader = new FileReader("Words.txt");
        Scanner wordScanner = new Scanner(reader);
        ArrayList<String> words = new ArrayList<String>();
        while(wordScanner.hasNext())
        {
            words.add(wordScanner.next());
        }
        
        // Pick a random word by picking a random position in the ArrayList of words
        Random generator = new Random();
        int correctPos = generator.nextInt(words.size());
        String correctWord = words.get(correctPos);
        
        int maxGuesses = correctWord.length() + 1;
        
        String welcomeMessage = "Welcome to Wordle!\nTry to guess the 5-letter word in 6 guesses!\n";
        System.out.println(welcomeMessage);
        
        Scanner scanner = new Scanner(System.in);
        int correctLetters = 0;

        /*
         * We use two loops, the first verify the number of guesses and scan the word that the user writes
         * the second for review each character of the guess and give the feedback, we do this for all the  guesses
         * we verify each word to know if it is the correc word, and with the last guess, we enter to a if to 
         * print the number of correct letters that the user got.
         */

        for(int i = 1; i <= maxGuesses; i++) { // Inicialize loop for the max Guesses 
            System.out.print("Make your next guess: "); //Print indication and scan the guess
            String guess = scanner.next();
            System.out.print("                      ");  // Print out several blank spaces so that the feedback lines up with the user input

            for(int j = 0; j < correctWord.length(); j++) { // Loop to verify each character
                // Obtain the first letter of the guessed and correct word, respectively
                char correctChar = correctWord.charAt(j);
                char guessChar = guess.charAt(j);

                if(correctChar == guessChar) {
                    System.out.print("$"); // Correct
                    correctLetters ++;
                }
                else if(correctWord.contains(guessChar + "")) {
                    System.out.print("*"); // Misplaced
                }
                else {
                   System.out.print("-"); // Incorrect
                }
            }
            // Print out two line breaks for formatting
            System.out.print("\n");
            System.out.print("\n");

            if(correctLetters == 5) { // We verify each guess to know if it is correct
                if (i == 1){
                    System.out.println("Congrats! You guessed the word in " + i + " guess!"); // We print the Congrats and the guesses the used did
                } else {
                    System.out.println("Congrats! You guessed the word in " + i + " guesses!");
                }
                break; // If the user guessed the word before the max guesses the loop break
            }
            if (i == maxGuesses){ // If it is the last guess
                if (correctLetters == 1) {
                    System.out.println("You got " + correctLetters + " letter correct\n"); // Print the number of correct letters
                } else {
                    System.out.println("You got " + correctLetters + " letters correct\n");
                }
                System.out.println("The correct word was: " + correctWord); // Print correct word
            }
            correctLetters = 0; // Restard the correct letter variable to count each guess individualy and not comulative

        }
    }
}
