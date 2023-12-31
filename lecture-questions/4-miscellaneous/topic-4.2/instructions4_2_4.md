# 4.2  Scanners and command line args lecture questions
## Exercise 4 / 5
### Instructions:
Assume we have defined a class called `CommandLinePractice` with a `main` method as follows:

```
class CommandLinePractice
{
    public static void main(String[] args)
    {
        ...
    }
}
```

TASK: Fill in the `main` method so that it computes and prints out the combined length of all the individual command line arguments

EXAMPLE: If I run `java CommandLinePractice I Am Groot` it should print out 8 (1 + 2 + 5)

EXAMPLE: If I run `java CommandLinePractice Apocalypse 2020` it should print out 14 (10 + 4)

EXAMPLE: If I run `java CommandLinePractice the head and the hair` it should print out 17 (3 + 4 + 3 + 3 + 4)