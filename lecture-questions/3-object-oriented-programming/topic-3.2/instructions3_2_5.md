# 3.2  Classes and instance methods lecture questions
## Exercise 5 / 6
### Instructions:
Assume we have created a class `PlayingCard` as follows:

```
class PlayingCard
{
    int value;
    String suit;

    public String suitRank(){...}
    public String cardName(){...}
}
```

TASK: Implement a `toString` method for the `PlayingCard` class:

- It should return a `String`
- It should have no parameters
- It should `“___ of ___”`, where the first blank contains the value of the card, and the second blank contains the suit of the card
    - If the card value is `11-14` , the first blank should contain the appropriate face card name
