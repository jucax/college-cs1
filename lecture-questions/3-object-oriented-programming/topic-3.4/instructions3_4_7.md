# 3.4  Methods lecture questions
## Exercise 7 / 8
### Instructions:
Assume we have defined a class called `NumberTheory`. Additionally, assume we have defined a method calls `isPrime` which takes has one parameter `int num` and returns `true` if `num` is prime, and `false` otherwise.

```
class NumberTheory
{
    public boolean isPrime(int num){...}
}
```

TASK: Write a method called `computePrimes`. It should take a single parameter `int num`. It will return an **ArrayList<Integer>** containing the prime numbers less than or equal to `num`. You may assume that `num` is greater than `1`.