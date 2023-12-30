# 4.1  Static variables and methods lecture questions
## Exercise 1 / 5
### Instructions:
TASK: Create a `CrosswordClue` class with the following `private` instance fields:

- `int position`
- `char orientation` - either 'A' for across or 'D' for down
- `String clue` - the clue given to the person solving the puzzle
- `String answer` - the term that is supposed to go in the puzzle

Additionally, define the following methods:

1. A parameterized constructor that initializes each instance field. The parameters to the constructor should be `int position, char orientation, String clue, String answer` (in that order).

- A getter method for each instance field
- `checkGuess` - it takes a parameter `String guess` and returns `true` if it matches the answer (and `false` otherwise)

We will test your class using the following code:

```
Scanner scanner = new Scanner(System.in);
int position = scanner.nextInt();
char orientation = scanner.nextLine().trim().charAt(0);
String clue = scanner.nextLine();
String answer = scanner.nextLine();
String guess = scanner.nextLine();

CrosswordClue crosswordClue = new CrosswordClue(position, orientation, clue, answer);

System.out.println(crosswordClue.getPosition());
System.out.println(crosswordClue.getOrientation());
System.out.println(crosswordClue.getClue());
System.out.println(crosswordClue.getAnswer());
System.out.println(crosswordClue.checkGuess(guess));
```