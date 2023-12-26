# 2.3 Nested loops, boolean flags, break, continue lecture questions
## Exercise 3 / 3
### Instructions:
Assume we have defined a variable of type `int` called `num` with the following line of code:

```
int num = ???; // num can have any positive int value
```

TASK: Create a `boolean` variable called `hasOddFactor` that is `true` if `num` is divisible by any odd number greater than `1` (including possibly itself), and `false` otherwise.
EXAMPLE: If `num` is `26`, then we would want `hasOddFactor` to be set to `true`. This is because `26` is divisible by `13`.
EXAMPLE: If `num` is `16`, then we would want `hasOddFactor` to be set to `false`. This is because `16` is not divisible by any odd numbers. In particular, it is not divisible by 3, 5, 7, 9, 11, 13, or 15 (or any bigger odd number).