# 3.2 Classes and instance methods skills lab
## Exercise 4 / 4
### Instructions:
We have written the skeleton of a class called `Pokemon` that has a `String` instance variable `name` and an `int` instance variable `level`. The class implements `comparable<Pokemon>`.

TASK: Fill in the following methods:

1. `toString`: this method will return `"Level <level> <name>"`, where <level> is the `Pokemon` object's `level` instance variable and <name> is the `Pokemon` object's `name` instance variable.
2. `equals`:  This method should take Object other as input. It should return `true` if the two `Pokemon` have the same `name` and `level`, and `false` otherwise.
3. `compareTo`:  This method should take `Pokemon other` as input. It should return return `-1` if this `Pokemon`'s name comes lexicographically before the other `Pokemon`'s name, and `1` if the other `Pokemon`'s name comes first lexicographically. If the two names are equal, it should return `-1` if this `Pokemon`'s level is lower, and `1` if this `Pokemon`'s level is higher. If the two `Pokemon` have the exact same `name`, and `level`, the method should return 0.

EXAMPLE: If we run the following lines of code:

```
Pokemon ashPikachu = new Pokemon();
ashPikachu.name = "Pikachu";
ashPikachu.level = 100;
System.out.println(ashPikachu); // equivalent to System.out.println(ashPikachu.toString());
```

We would print "Level 100 Pikachu".

NOTE: You only need to fill in the `Pokemon` class. You do not need to write a `main` method.

HINT: Don't forget to use casting when you fill in the `equals` method!

HINT: You are encouraged to take advantage of the built in `compareTo` method for `String` objects. However, be careful. When you call `str1.compareTo(str2)`, it will return some sort of negative number if `str1` comes first lexicographically, and some sort of positive number if `str2` comes first lexicographically. However, it will not necessarily return `1` or `-1`.