import java.util.ArrayList;
class CrosswordClue4_1_3 {
    private int position;
    private char orientation;
    private String clue;
    private String answer;

    public CrosswordClue4_1_3(int position, char orientation, String clue, String answer){
        this.position = position;
        this.orientation = orientation;
        this.clue = clue;
        this.answer = answer;
    }

    public int getPosition(){
        return position;    
    }

    public char getOrientation(){
        return orientation;    
    }

    public String getClue(){
        return clue;   
    }

    public String getAnswer(){
        return answer;
    }

    public boolean checkGuess(String guess){
        return guess.equals(answer);        
    }
}

class CrosswordPuzzle4_1_2 {
    ArrayList<CrosswordClue4_1_3> clues;
    int correctGuesses;
    
    public CrosswordPuzzle4_1_2 (ArrayList<CrosswordClue4_1_3> clues){
        this.clues = clues;
        correctGuesses = 0;
    }
    
    public ArrayList<CrosswordClue4_1_3> getClues (){
        return clues;    
    }
    
    public int getCorrectGuesses(){
        return correctGuesses;    
    }

    public boolean solveClue(int position, char orientation, String guess){
        boolean decision = false;
        for (CrosswordClue4_1_3 crosswordClue : clues){
            if (((crosswordClue.getPosition() == position) && (crosswordClue.getOrientation() == orientation)) == true){
                if ((crosswordClue.checkGuess(guess)) == true){
                    correctGuesses ++;
                    decision = true; 
                } else {
                decision = false;
                }
            }   
        }
        return decision;
    }
}