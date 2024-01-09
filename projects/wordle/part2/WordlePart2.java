import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;

public class WordlePart2
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
        
        System.out.print("Make your next guess: ");
        String guess = scanner.next();

        int correctLetters = 0; // Declare a new variable to know the number of correct letters

        // Give feedback on the first letter 
        if ((correctWord.charAt(0)) == (guess.charAt(0))) { // Retrieve the first character of the correct word and the guess and verify if they match
            System.out.print("                      $"); // In they match print "$" with spaces to line up with the user's guess 
            correctLetters ++; //Count 1 correct letter
        } else if (correctWord.contains((guess.charAt(0)) + "")) { // Verify if the correct word contains the first character of the guess
            System.out.print("                      *"); // If is contains print "*"
        } else { 
            System.out.print("                      -"); // Either the character is incorrect and print "-"
        }

        // Give feedback on the second letter 
        if ((correctWord.charAt(1)) == (guess.charAt(1))) {    
            System.out.print("$");
            correctLetters ++;
        } else if (correctWord.contains((guess.charAt(1)) + "")) {
            System.out.print("*");
        } else {
            System.out.print("-");
        }

        // Give feedback on the third letter 
        if ((correctWord.charAt(2)) == (guess.charAt(2))) {
            System.out.print("$");
            correctLetters ++;
        } else if (correctWord.contains((guess.charAt(2)) + "")) {
            System.out.print("*");
        } else {
            System.out.print("-");
        }

        // Give feedback on the fourth letter 
        if ((correctWord.charAt(3)) == (guess.charAt(3))) {
            System.out.print("$");
            correctLetters ++;
        } else if (correctWord.contains((guess.charAt(3)) + "")) {
            System.out.print("*");
        } else {
            System.out.print("-");
        }

        // Give feedback on the fifth letter 
        if ((correctWord.charAt(4)) == (guess.charAt(4))) {
            System.out.println("$");
            correctLetters ++;
        } else if (correctWord.contains((guess.charAt(4)) + "")) {
            System.out.println("*");
        } else {
            System.out.println("-");
        }

        // Give feedback on number of correct letters
        if (correctLetters == 5){ // If the counter is 5 the user guessed the word
            System.out.println("\nCongrats! You guessed the word!"); 
        } else if (correctLetters == 1){ // If the counter is 1 the user just got 1 letter correct
            System.out.println("\nYou got " + correctLetters + " letter correct\n");
            System.out.println("The correct word was: " + correctWord);
        } else { 
            System.out.println("\nYou got " + correctLetters + " letters correct\n");
            System.out.println("The correct word was: " + correctWord);
        }
    }
}
