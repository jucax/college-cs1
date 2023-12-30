# 4.1  Static variables and methods lecture questions
## Exercise 4 / 5
### Instructions:
Assume we have defined the CrosswordPuzzle class as in the previous problems.

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

    public boolean checkGuess(int position, char orientation, String guess){...}
}
```

Add the following `static` field to the `CrosswordPuzzle` class

- `private static String publisher`

Additionally, add the following `static` methods:

- `public static String getPublisher`
- `public static void setPublisher`
    - This method should take a parameter `String p` and set `publisher` equal to `p`.