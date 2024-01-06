# 4.2 Scanner lookahead skills lab
## Exercise 2 / 3
### Instructions:
TASK: Fill in the program below such that it does the following:

- Create a `Scanner` object that reads from `System.in`
- Prompt the user to by printing the following: `"Enter the dollars and cents you have in your bank account (separated by a space):"` (no quotes)
- Read the next `int` entered by the user, and store it in a variable called `dollars`
- Read the next `int` entered by the user, and store it in a variable called `cents`
- If the first number entered was negative, print `"Invalid dollars"` (no quotes)
- If the second number entered was not between 0 and 99, print `"Invalid cents"` (no quotes)
- Otherwise, print `"You have dollars dollars and cents cents"` (no quotes)

NOTE: In the lecture slides we used `System.out.print` for scanner prompts. For this problem, please use `System.out.println` for everything that you print out - including the user prompts and the output message.

EXAMPLE: The program should always first prompt me with the following:

```
Enter the dollars and cents you have in your bank account (separated by a space):
```

If I type "100 50" (no quotes) and hit enter, it should print the following:

```
You have 100 dollars and 50 cents
```

If I type "-100 50" (no quotes) and hit enter, it should print the following:

```
Invalid dollars
```

If I type "100 -50" (no quotes) and hit enter, it should print the following:

```
Invalid cents
```
