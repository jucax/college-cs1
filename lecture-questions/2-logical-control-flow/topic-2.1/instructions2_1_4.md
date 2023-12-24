# 2.1 Conditionals lecture questions 
## Exercise 4 / 5
### Instructions:
Suppose we are writing a program for a card game. We want to check if a particular number is a valid card number.
Assume we have defined a variable of type `int` called called `cardValue` with the following lines of code:

```
int cardValue = ??; // 'cardValue' can have any int value
```

TASK:

- If it’s not a valid card value, print out `“This is not a valid card value!”`
- Otherwise, your code should go into a switch statement that does the following:
    - If `cardValue` is a 14, print out `“Ace”`
    - If `cardValue` is a 13, print out `“King”`
    - If `cardValue` is a 12, print out `“Queen”`
    - If `cardValue` is an 11, print out `“Jack”`
    - Otherwise, print out the value of the card