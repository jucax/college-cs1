# 4.3 Recursion skills lab
## Exercise 1 / 1
### Instructions:
We have created the following class to represent members in a line:

```
class LineMember
{
    private String name;
    private LineMember inFront;

    public String getName()
    {
        return this.name;
    }

    public LineMember getInFront()
    {
        return this.inFront;
    }

    // other constructors and methods not shown
}
```

Additionally, we have created a class with a main method and a `public static` method called `getLineMembers`. The method has one parameter of type `LineMember` called `lastMember`. It returns a `String` containing the names of all of the members of the line (starting with `lastMember`), separated by the `->` delimiter. 

TASK: Fill in the body of the `getLineMembers` method using a recursive solution.