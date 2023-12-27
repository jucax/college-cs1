public class PlayingCard3_2_6 {
    int value;
    String suit;

    public int suitRank(){
        if (suit == "Spades"){
            return 4;        
        } else if (suit == "Hearts"){
            return 3;
        } else if (suit == "Diamonds"){
            return 2;
        } else {
            return 1;
        }
    }

    public String cardName(){
        if (value == 11){
            return "Jack";        
        } else if (value == 12){
            return "Queen";
        } else if (value == 13){
            return "King";
        } else if (value == 14){
            return "Ace";
        } else {
            return value + "";
        }    
    }

    public int compareTo(PlayingCard3_2_6 other){
        if (this.suitRank() < other.suitRank()){
            return -1;    
        } else if (this.suitRank() > other.suitRank()){
            return 1;    
        } else {
            if (this.value < other.value){
                return -1;  
            } else if (this.value > other.value){
                return 1;
            } else {
                return 0;    
            }
        } 
    }
}