public class PlayingCard3_2_4 {
    int value;
    String suit;

        public boolean equals(Object a){
        if (!(a instanceof PlayingCard3_2_4)){
            return false;    
        }
        PlayingCard3_2_4 card_a = (PlayingCard3_2_4) a;
        return value == card_a.value && suit.equals(card_a.suit);
    }
}