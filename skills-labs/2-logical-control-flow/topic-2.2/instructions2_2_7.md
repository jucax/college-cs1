# 2.2 While/For loops skills lab
## Exercise 7 / 7
### Instructions:
Recall the algorithm we learned to convert a number from decimal to binary:

1. Start with a number `num` in decimal
2. Divide `num` by `2`, and write down the remainder (which is guaranteed to be either 0 or 1)
3. Repeat step 1 until `num` has been reduced to 0
4. Read back all of the remainders in reverse order

In this problem, we will use loops to implement this algorithm.

Assume we have defined a variable of type `int` called `num` with the following line of code:

```
int num = ???; // num can be have any non-negative int value
```

TASK: Create a `String` variable called `binaryNum` that contains representation of `num`.

NOTE: You do not need to create a class or main method, and you do not need to create the variable `num`. We have done all of that behind the scenes.

NOTE: Don't print anything! We print out the variable that you create in order to check that it is correct. If you add your own extra print statements, your output will appear incorrect.

HINT: Make use of `String` concatenation! Initialize `binaryNum` to be an empty string prior to the loop, and update `binaryNum` inside of the loop. See the logarithms example from the slides for an example of a loop that keeps track of and updates multiple variables. Don't forget to account for the fact that the digits need to be reversed!

HINT: A `do-while` loop is a very elegant way to handle one of the edge cases!