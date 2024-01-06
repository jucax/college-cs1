# 4.2 Scanner lookahead skills lab
## Exercise 3 / 3
### Instructions:
Assume we have defined a class `Histogram` with a `main` method as follows:

```
class Histogram
{
    public static void main(String[] args)
    {
        ...
    }
}
```

TASK: Fill in the `main` method so that does the following:

1. Create a Scanner object that reads from `System.in`.
2. Prompt the as follows: `"Enter all of the students’ test scores (separated by spaces):"`
3. Read all of the scores, and create an **decile histogram** of the scores. In particular, you should print out 10 rows. Each row should contain some number of asterisks, as follows:
    - The first row contains one asterisk for each scores in the range 0-9
    - The second row contains one asterisk for each score in the range 10-19
    - ...
    - The ninth row contains one asterisk for each score in the range 80-89
    - The tenth row contains one asterisk for each score in the range **90-100** (we include 100th in the very last row instead of giving it its own row)

EXAMPLE: Suppose the input scores are

```
5 10 20 27 35 39 40 62 76 77 89 89 98 98 98 98 100
```

Then we would want to print out the following asterisk pattern:

```
*
*
**
**
*

*
**
**
*****
```

- There is one score (5) in the range 0-9. Thus, we have one asterisk in the first row
- There is one score (10) in the range 10-19. Thus, we have one asterisk in the second row
- There are two scores (20 and 27) in the range 20-29. Thus, we have one asterisk in the third rod
- There are two scores (35 and 39) in the range 30-39. Thus, we have one asterisk in the fourth row.
- There is one score (40) in the range 40-49. Thus, we have one asterisk in the fifth row.
- There are no scores in the range 50-59. Thus, we have no asterisks in the sixth row.
- There is one score (62) in the range 60-69. Thus, we have one asterisk in the seventh row.
- There are two scores (76 and 77) in the range 70-79. Thus, we have two asterisks in the eighth row.
- There are two scores (89 and 89) in the range (80-89). Thus, we have two asterisks in the ninth row
- There are five scores (98, 98, 98, 98, and 100) in the range 90-100. Thus, we have five asterisks in the last row.

NOTE: You should not assume that the scores will be in sorted order.

HINT: There are a couple of approaches that you could take. One approach would be to define a different String variable for each row. When you loop through the numbers in the input, use conditional logic to determine which String variable to update with a new asterisk. Then print out each String variable one by one.

Another approach (elegant) would be to create array that keeps track of how many asterisks go in each row. First, loop through the numbers, and for each number, decide which array position should be incremented. Then, write a loop to go through the array. For each array position, write a nested loop to print out the correct number of for that row.

The second approach is more complex, but if done correctly, it has the advantage that it would be very easy to modify if we wanted to have a different number of rows!