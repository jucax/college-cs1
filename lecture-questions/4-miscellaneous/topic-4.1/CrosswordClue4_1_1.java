class CrosswordClue4_1_1 {
    private int position;
    private char orientation;
    private String clue;
    private String answer;

    public CrosswordClue4_1_1(int position, char orientation, String clue, String answer){
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