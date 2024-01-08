import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;

public class WordlePart1
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
        
        // DON'T MODIFY THE CODE ABOVE THIS
        
        int maxGuesses = correctWord.length() + 1;
        String welcomeMessage = "Welcome to Wordle!\n" + "Try to guess the 5-letter word in 6 guesses!\n";
        System.out.println (welcomeMessage);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Make your next guess: ");
        String guess = scanner.nextLine();
        
        System.out.println("The correct word was: " + correctWord);

        // DON'T MODIFY THE CODE BELOW THIS
    }
}