# 2.1 Conditionals skills lab
## Exercise 2 / 3
### Instructions:
Imagine you're the professor of a CSC 54-184 class, and you want to be able to convert student grade percentages into letter grades. You decide to use the following scale:

- 97% ≤ Grade is an A+
- 93% ≤ Grade < 97% is an A
- 90% ≤ Grade < 93% is an A-
- 87% ≤ Grade < 90% is a B+
- 83% ≤ Grade < 87% is a B
- 80% ≤ Grade < 83% is a B-
- 77% ≤ Grade < 80% is a C+
- 73% ≤ Grade < 77% is a C
- 70% ≤ Grade < 73% is a C-
- 60% ≤ Grade < 70% is a D
- Grade < 60% is an F

Assume we have already defined a variable of type `double` called `grade` such that 0 ≤ `grade` ≤ 1, which is a grade percentage represented as a decimal. For example, if `grade` is `0.975`, that would correspond to a percentage of 97.5%, which would be an A+.

TASK: Print the letter grade associated with `grade`.