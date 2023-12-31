# 4.2  Scanners and command line args lecture questions
## Exercise 1 / 5
### Instructions:
TASK: Write a program that does the following:

1. Create a `Scanner` object that reads from standard input (`System.in`).
2. Prompt the user as follows: `“Enter your sentence:”` and then read the sentence the user enters.
3. Prompt the user as follows: `“Enter the minimum character count:”`, and then read the number the user enters (as an `int`).
4. Prompt the as follows: `“Enter the maximum character count:”` and then read the number the user enters (as an `int`).
5. Calculate the number of characters in the sentence the user entered (including spaces)
6. If the sentence is below the minimum character count, print `“Too short”`
7. If the sentence is above the maximum character count, print `“Too long”`
8. Otherwise, print `“Goldilocks”`

NOTE: In the lecture slides we typically used `System.out.print` for Scanner prompts. Please use `println` for all printing in this question.

NOTE: you don't need to write a class or `main` method header, and you don't need to `import` `Scanner`. We've done all of that behind the scenes. Just write the body of the main method as described above.