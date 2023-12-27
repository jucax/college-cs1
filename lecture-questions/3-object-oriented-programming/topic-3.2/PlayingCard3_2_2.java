public class PlayingCard3_2_2 {
    int value;
    String suit;

    public static void main (String[] args) {
        PlayingCard3_2_2 bottomCard = new PlayingCard3_2_2();
        bottomCard.value = 2;
        bottomCard.suit = "Clubs";
        PlayingCard3_2_2 topCard = new PlayingCard3_2_2();
        topCard.value = 14;
        topCard.suit = "Hearts";
    }
}