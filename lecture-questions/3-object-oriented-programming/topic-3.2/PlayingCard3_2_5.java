public class PlayingCard3_2_5 {
    int value;
    String suit;

    public String cardName()
    {
        switch(value)
        {
            case 14 : return "Ace";
            case 13 : return "King";
            case 12 : return "Queen";
            case 11 : return "Jack";
            default : return value + "";
        }
    }
    public String toString(){
        return cardName() + " of " + suit;    
    }
}