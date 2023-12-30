# 4.1  Static variables and methods lecture questions
## Exercise 2 / 5
### Instructions:
Assume we have already defined a class called `CrosswordClue`, as in the previous question.

```
class CrosswordClue
{
    private int position;
    private char orientation;
    private String clue;
    private String answer;

    public int getPosition(){...}

    public char getOrientation(){...}

    public String getClue() {...}

    public String getAnswer() {...}

    public boolean checkGuess() {...}
}
```

TASK: Create a class called `CrosswordPuzzle` with the following instance fields:

- `ArrayList<CrosswordClue> clues`
- `int correctGuesses`

Additionally create a parameterized constructor that takes one parameter and uses it to initialize `clues`. By contrast, `correctGuesses` is automatically set to `0`.

Finally, write getter method for `correctGuesses` and `clues`.

To test your class, we will use the following code:

```
Scanner scanner = new Scanner(System.in);
ArrayList<CrosswordClue> clues = new ArrayList<CrosswordClue>();
        
for(int i = 0; i < 3; i++)
{
    int position = scanner.nextInt();
    char orientation = scanner.nextLine().trim().charAt(0);
    String clue = scanner.nextLine();
    String answer = scanner.nextLine();
    CrosswordClue crosswordClue = new CrosswordClue(position, orientation, clue, answer);
    clues.add(crosswordClue);
}
        
CrosswordPuzzle puzzle = new CrosswordPuzzle(clues);
for(CrosswordClue crosswordClue : puzzle.getClues())
{
    int position = crosswordClue.getPosition();
    char orientation = crosswordClue.getOrientation();
    String clue = crosswordClue.getClue();
    String answer = crosswordClue.getAnswer();
            
    System.out.println(position + "-" + orientation + ": " + clue + "\n" + answer);
}
System.out.println(puzzle.getCorrectGuesses());
```