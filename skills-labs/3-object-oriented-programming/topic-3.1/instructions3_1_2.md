# 3.1 Objects, arrays and ArrayLists skills lab
## Exercise 2 / 3
### Instructions:
Recall that the Fibonacci sequence is a famous sequence in the field of Mathematics, largely made popular due to the fact that it sometimes randomly appears in nature. Let F(n) denote the n-th Fibonacci number. F(0) = 0, F(1) = 1, and for all other values of n, F(n) = F(n-1) + F(n-2). In other words, the Fibonacci sequence starts with 0 followed by 1, and every subsequent number is the sum of the previous two numbers. Thus, the Fibonacci sequence is as follows:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

We have declared a variable of type `int` called `num`.

TASK: construct an `ArrayList<Integer>` called `fibonacciNumbers` containing the Fibonacci numbers less than or equal to `num`. You may assume that `num` is not negative.

NOTE: You do not need to write a class or main method main method. Just write the code to construct the ArrayList.

NOTE: Don't print anything! We take do some printing behind the scenes, so if you add your own print statements the output will look wrong.

HINT: You can and should reuse your code from the previous skills lab! Instead of printing out the Fibonacci numbers, add them to an ArrayList