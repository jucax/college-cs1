# 4.1  Static variables and methods lecture questions
## Exercise 5 / 5
### Instructions:
TASK: Create a class called `Triangle`.

- Add three instance variables: `double side1`, `double side2`, and `double side3`.
- Add a parameterized constructor that has three `double` parameters which are used to initialize the three instance variables
- Write a `public` instance method called `semiperimeter`, which calculates the `semiperimter` of the triangle
- Write a `public` instance method called `area`, which uses Herron’s formula to calculate the area

HINT: According to Herron's formula, the area of a triangle with side lengths `a`, `b`, and `c` is :

A = sqrt ( s * (s - a) * (s - b) * (s - c))

In this formula, `s` refers to the semiperimeter, which is calculated as:

s = (a + b + c) / 2

EXAMPLE: Suppose we have a triangle with side lengths **4**, **5**, and **6**. The semiperimeter is:

(4 + 5 + 6) / 2 = 7.5

The area is

sqrt (s * (s - a) * (s - b) * (s - c)) = sqrt (7.5 * (7.5 - 4) * (7.5 - 5) * (7.5 - 6)) = 9.921567416492215