# 3.2  Classes and instance methods lecture questions
## Exercise 4 / 6
### Instructions:
Assume we have created a class `PlayingCard` as follows:

```
class PlayingCard
{
    int value;
    String suit;
}
```

TASK: Implement the `equals` method:

- It has a return type of `boolean`
- It has a parameter of type `Object`
- It should return `true` if the two cards have the same `suit` and `value`, and `false` otherwise

HINT: Make sure you use `.equals` when you check if the `suit`s are equal!