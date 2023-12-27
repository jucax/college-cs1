# 3.3  Constructors, modifiers, and encapsulation lecture questions
## Exercise 1 / 2
### Instructions:
Assume we have created a class called `PlayingCard` with instance variables `String suit` and `int value`, and `boolean isFaceCard`, as well as a `toString` method, as follows:

```
class PlayingCard
{
    int value;
    String suit;
    boolean isFaceCard;

    public String toString(){...}
}
```

The last instance variable is new, but hopefully self-explanatory! 

TASK: Write the following constructors:

- Default (no parameter) constructor that makes it a 2 of hearts
- Constructor with parameters `int v` and `String s` and uses those values to initialize the instance fields
- Constructor that takes a face card name as a String (either `“Jack”`, `“Queen”`, `“King”`, or `“Ace”`), as well as a suit

Don’t forget to initialize `isFaceCard` in all your constructors!