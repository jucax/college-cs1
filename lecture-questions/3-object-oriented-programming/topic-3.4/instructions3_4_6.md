# 3.4  Methods lecture questions
## Exercise 6 / 8
### Instructions:
TASK: Let’s add another method to our GenomeAnalyzer class. Write a `public` method called `hasRepeat`. It has one `String` parameter as input, which represents a DNA sequence. It returns `true` if the sequence ever contains the same character repeated twice in a row, and `false` otherwise.

EXAMPLE: `ACAGACATACTACA` never has the same character appear twice in a row

EXAMPLE: `GATTACA` has the letter `T` appear twice in a row

HINT: Write a loop that goes through the `String` and compares each character against the previous character (which you can keep track of through a variable that gets updated repeatedly).