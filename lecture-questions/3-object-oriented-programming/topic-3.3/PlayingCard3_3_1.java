public class PlayingCard3_3_1 {
    int value;
    String suit;
    boolean isFaceCard;

    public String cardName() {
        switch(value) {
            case 14 : return "Ace";
            case 13 : return "King";
            case 12 : return "Queen";
            case 11 : return "Jack";
            default : return value + "";
        }
    }

    public String toString() {
        return cardName() + " of " + suit;    
    }

    public PlayingCard3_3_1(){
        value = 2;
        suit = "Hearts";
        isFaceCard = false;    
    }

    public PlayingCard3_3_1(int v, String s){
        value = v;
        suit = s;
        isFaceCard = (value == 11 || value == 12 || value == 13 || value == 14);
    }

    public PlayingCard3_3_1(String n, String s){
        switch (n){
            case "Ace":
                value = 14;
                break;
            case "Jack":
                value = 11;
                break;
            case "Queen":
                value = 12;
                break;
            case "King":
                value = 13;
                break;
        }
        suit = s;
        isFaceCard = (value == 11 || value == 12 || value == 13 || value == 14);
    }
}