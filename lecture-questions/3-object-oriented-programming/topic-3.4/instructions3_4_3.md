# 3.4  Methods lecture questions
## Exercise 3 / 8
### Instructions:
A DNA sequence can be thought of as a string over the alphabet `{A,C,G,T}`. The "Hamming distance" between two DNA sequences (of equal length) is the total number of positions at which the sequences differ. For example, the Hamming distance between the sequences `ACAGT` and `ATAGC` is `2`.

Assume we have created a class called `GenomeAnalyzer`.

TASK: Write the a `public` method called `printHammingDistance`. It should have two parameters of type `String`. It should print out (but not `return`) the hamming distance between the two `String`s. You may assume that the two `String`s have the same length.