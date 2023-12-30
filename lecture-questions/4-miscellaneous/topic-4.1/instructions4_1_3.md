# 4.1  Static variables and methods lecture questions
## Exercise 3 / 5
### Instructions:
Assume we have already defined the classes called CrosswordClue and CrosswordPuzzle as in the previous questions as follows:

```
class CrosswordClue
{
    private int position;
    private char orientation;
    private String clue;
    private String answer;

    public CrosswordClue(int position, char orientation, String clue, String answer){...}

    public int getPosition(){...}

    public char getOrientation(){...}

    public String getClue() {...}

    public String getAnswer() {...}

    public boolean checkGuess() {...}
}

class CrosswordPuzzle
{
    private ArrayList<CrosswordClue> clues;
    private int correctGuesses;

    public CrosswordPuzzle(ArrayList<CrosswordClue> clues){...}

    public ArrayList<CrosswordClue> getClues(){...}

    public int getCorrectGuesses(){...}
}
```

TASK: Write a `public boolean` method called a method `solveClue`. It takes three parameters: `int position`, `char orientation`, and `String guess`. It does the following:

1. Loop through `clues` and search for the `CrosswordClue` object with the matching `position` and `orientation`. Use the `getPosition` and `getOrientation` methods to check this.
2. If a matching `CrosswordClue` is ever found, use its `checkGuess` method to check if the `guess` is correct
    1. If `checkGuess` returns `true` (indicating a correct guess), then `solveClue` should also return `true`. Additionally, it should increment `correctGuesses`.
    2. If `checkGuess` returns `false` (indicating an incorrect guess), then `solveClue` should return false and leave `correctGuesses` unchanged.

If no `CrosswordClue` object matches the given position/orientation, the method should eventually return `false`.

We will test your code by creating a crossword puzzle with the following clues:

```
1-A: Actress Bergman
Ingrid

4-A: Campaign slogan: Yes we ___
can

20-D: CFB HOF City
Atlanta
```

Then, we will feed the input guess into checkGuess to see if it returns the right output

NOTE: you do not need to write the `CrosswordClue` or `CrosswordPuzzle` classes. Just write the method.