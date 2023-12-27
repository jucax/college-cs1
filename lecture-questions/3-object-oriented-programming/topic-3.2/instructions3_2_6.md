# 3.2  Classes and instance methods lecture questions
## Exercise 6 / 6
### Instructions:
Assume we have created a class `PlayingCard` as follows:

```
class PlayingCard implements Comparable<PlayingCard>
{
    int value;
    String suit;

    public int suitRank(){...}
    public String cardName(){...}
}
```

TASK: Implement a `compareTo` method for the `PlayingCard` class as follows:

- It should first compare based on `suit`
    - `Clubs` < `Diamonds` < `Hearts` < `Spades`
- If the `suit` is equal, it should compare based on the card `value`
    - The card with the smaller `value` comes "first"

The method should return `-1` if the object calling the method comes "first", `0` if the two cards are the same, `1` if the other card comes "first"

HINTHINTHINT: take advantage of one of the instance methods that is already there!!! In particular, you can call suitRank and cardName from within the PlayingCard class. You can use `suitRank()` and `cardName()` to get the current card's rank and name, and you can use `other.suitRank()` and `other.cardName()` to get the suit and name of the other card.