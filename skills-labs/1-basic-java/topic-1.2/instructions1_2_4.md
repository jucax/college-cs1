# 1.2 Operators and boolean logic skills lab
## Exercise 4 / 6
### Instructions:
How does a bill become a law? Well, it's complicated! You can learn more by reading this article or watching this video. But here's a basic overview:

- If we no presidential veto, and we have at least `218` votes in the house of representatives, at least `51` votes in the senate, the bill passes
- If we have a presidential veto, but we have at least `290` votes in the house of representatives and at least `67` votes in the senate, then the bill passes.
- Otherwise, the bill fails to pass

Of course, there are some other nuances (like the filibuster, and the vice president breaking a tie in the senate), but we'll ignore that for now.

 Assume we have already defined a variable of type `boolean` called `veto`, a variable of type `int` called `houseVotes`, and a variable of type `int` called `senateVotes` with the following lines of code:

```
boolean veto = ???;  // 'veto' can be true or false
int houseVotes = ???;  // 'houseVotes' can have any int value between 0 and 435
int senateVotes = ???; // 'senateVotes' can have any int value between 0 and 100
```

TASK: Create a `boolean` variable called `billPasses` that is `true` if the bill will pass (based on the conditions above), and `false` otherwise.

NOTE: You do not need to create the variables `veto`, `houseVotes`, and `senateVotes`. We have already done that behind the scenes. You just need to write the code to create the `boolean` variable.

HINT: Don't print out anything! Just create the variable. We will print it out behind the scenes to check that you created the variable correctly; if you add your own print statements then the output won't be correct.