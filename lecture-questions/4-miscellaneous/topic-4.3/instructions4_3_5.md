# 4.3  Recursion lecture questions
## Exercise 5 / 5
### Instructions:
Recall that a number p is **prime** if it has no divisors (other than 1 and itself). In other words, there is no number  2 ≤ d ≤ p − 1 such that p % d = 0. Examples of prime numbers are 2, 3, 5, 7, and 11.

EXAMPLE: The number 17 is prime. 17 is not divisible by 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, or 16.

EXAMPLE: The number 18 is not prime. 18 is divisible by 2, 3, 6, and 9.

Recall that the **prime factorization** of a number N is the (unique) combination of prime numbers {p1, p2, ... pn} such that each of the pi are prime, and p1 ∗ p2 ∗ ... ∗ pn = N. Note that there may be duplicates of some of the prime factors.

EXAMPLE: The prime factorization of 17 is simply {17}.

EXAMPLE: The prime factorization of 18 is {2, 3, 3}. That is because all three of these numbers are prime, and 2 * 3 * 3 = 18

EXAMPLE: The prime factorization of 306 is {2, 3, 3, 17}. That is because all four of these numbers are prime, and 2 * 3 * 3 * 17 = 306. Note that 306 = 17 * 18, so to get the prime factorization of 306 we simply combine the prime factorizations of 17 and 18.

An alternate definition of a prime factorization is as follows:

- If `N` is a prime number, then `primeFactorization(N) = N`
- Otherwise, if there is some number `k > 1` such that `N` is divisible by `k`, then `primeFactorization(N) = primeFactorization(k) * primeFactorization(N/k)`

TASK: Write a `public static` method called `primeFactorization`. It should have a single parameter `int num`. It should return an `ArrayList<Integer>` containing all of the prime factors of `num`. You may return the prime factors in any order - you don't need to sort them.

**You need to use a recursive solution!** You can use the following algorithm to solve the problem:

- If `num` is prime, return an `ArrayList` containing `num` (and nothing else).
- Otherwise, num must be composite. Do the following:
    - Compute `i`, the smallest non-trivial factor of `num`.
    - Recursively compute the prime factorization of `i`.
    - Recursively compute the prime factorization of `num / i`.
    - Combine the `ArrayLists` returned in the previous two steps, and return the result. 

HINT: To help you out, we have added implementations the following methods:

- `public static boolean isPrime(int num)`
- `public static ArrayList<Integer> numToArrayList(int num)`
- `public static int smallestNonTrivialFactor(int num)`
- `public static ArrayList<Integer> combinedArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2)`