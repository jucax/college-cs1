# 4.3  Recursion lecture questions
## Exercise 1 / 5
### Instructions:
Assume we have already defined a variable of type `int` called `num` with the following line of code:

```
int num = ???; // 'num' can have any int value
```

TASK: Write a `public static` method called `isPrime`. It should have a single parameter `int num`. It should have a `boolean` return type. It should return `true` if num is prime and `false` otherwise.

HINT: Recall that a number is considered "prime" if it is only divisible by 1 and itself. In other words, `num` is prime if it is NOT divisible by any number between `2` and `num - 1`; however, if `num` is divisible by any of these numbers, it is composite.

HINT: You did a very similar problem on the nested loops/boolean flags skills lab. You should re-use that code!