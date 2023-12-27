# 3.2  Classes and instance methods lecture questions
## Exercise 3 / 6
### Instructions:
Assume we have created a class `PlayingCard` as follows:

```
class PlayingCard
{
    int value;
    String suit;
}
```

TASK: Create the following instance methods:

`suitRank`:

- No parameters, and a return type of `int`
- If suit is `“Spades”`, it should return `4`
- If suit is `“Hearts”`, it should return `3`
- If suit is `“Diamonds”`, it should return `2`
- Otherwise, the method should return `1`

`cardName`:

- No parameters, and a return type of `String`
- It return `“Jack”`, `“Queen”`, `“King”`, and `“Ace”` for `11-14`, respectively
- Otherwise, it returns the card’s numeric value (as a String)