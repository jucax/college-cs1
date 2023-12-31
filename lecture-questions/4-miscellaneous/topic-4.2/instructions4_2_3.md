# 4.2  Scanners and command line args lecture questions
## Exercise 3 / 5
### Instructions:
TASK: Suppose you are writing a navigation app. Write a program that does the following:

1. Create a `Scanner` object that reads from `System.in`
2. Prompt the user as follows: `"What direction are you facing? Enter either North, South, East, West, or a number between 0 and 360:"`
3. If the user entered a `double`, do the following:
    1. If the number is within the range 0-360, print out the number the user entered
    2. Otherwise, print out `'Invalid direction"`
4. Otherwise, do the following:
    1. If the user entered `North`, print `0`
    2. If the user entered `East`, print `90`
    3. If the user entered `South`, print `180`
    4. If the user entered `West`, print `270`

Otherwise, print out `"Invalid direction"`

NOTE: In the lecture slides we typically used `System.out.print` for Scanner prompts. Please use `println` for all printing in this question.

NOTE: you don't need to write a class or `main` method header, and you don't need to `import` `Scanner`. We've done all of that behind the scenes. Just write the body of the main method as described above.