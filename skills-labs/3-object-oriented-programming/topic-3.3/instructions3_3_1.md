# 3.3 Constructors, modifiers, and encapsulation skills lab
## Exercise 1 / 3
### Instructions:
We have written the skeleton of a class called `Student` that has a `String` instance variable `name`.

TASK: Fill in the bodies of the constructor, the `getName` method, and the `greet` method as follows:

- The constructor has a `String` parameter `name`, and it should set the `Student` object's `name` instance variable to the `name` parameter
- The `getName` method should return the Student object's `name` instance variable
- The `greet` method should return the following `String`: "Hello! My name is ______!" (where "______" is the `Student` object's `name` instance variable)

EXAMPLE: If we run the following lines of code:

```
Student arjun = new Student("Arjun");
String name = arjun.getName();
String greeting = arjun.greet();
```

Then `name` should be "Arjun" and `greeting` should be "Hello! My name is Arjun!".

NOTE: You only need to fill in the `Student` class. You don't need to make a `main` method.