# 2.2 While/For loops skills lab
## Exercise 4 / 7
### Instructions:
The Fibonacci sequence is a famous sequence in the field of Mathematics, largely made popular due to the fact that it sometimes randomly appears in nature. Let F(n) denote the n-th Fibonacci number. F(0) = 0, F(1) = 1, and for all other values of n, F(n) = F(n-1) + F(n-2). In other words, the Fibonacci sequence starts with 0 followed by 1, and every subsequent number is the sum of the previous two numbers. Thus, the Fibonacci sequence is as follows:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Assume we have already defined a variable of type `int` called `num` with the following line of code:

```
int num = ???; // 'num' can have any int value
```

TASK: Print every number in the Fibonacci sequence that is less than or equal to `num`. You may assume that `num` is greater than or equal to 1.

NOTE: You do not need to create a class or main method, and you do not need to create the variable `num`. We have done all of that behind the scenes.

HINT: Try using a `while` loop print out numbers until you've gotten to the limit.

HINT: Make two variables to keep track of the two most recent numbers; you need to know the two previous numbers to compute the next number. Keep updating these variables inside your loop.