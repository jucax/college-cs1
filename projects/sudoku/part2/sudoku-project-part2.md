# Sudoku Project Part 2
## Getting Started
### Refresher on Sudoku Instance Variables
Recall that our sudoku class will have one instance variable called grid that is used to represent all of the numbers in the grid. Every value in the matrix will contain one of the sudoku squares. It will either contain 1-9, or it will contain a 0, as a placeholder to indicate that the square is empty.

In the last part, we had to create a `Sudoku` object, and then manually initialize the value of its `grid` instance field. Wouldn’t it be nice if we could create a `Sudoku` object and initialize its instance fields simultaneously? To do that, we need to add a constructor. Additionally, now that we’ve made `grid` a `private` variable, we are going to add some methods that allow us to access and modify the grid from outside of the `Sudoku` class. However, because we are now making it possible to modify the grid, we’ll also need to add some code to help us remember what the initial state of the grid was.

Let’s walk through all of the code components that you need to add to `Sudoku.java`. For this writeup, I will use the following sudoku board for my examples:

![sudoku-example](https://github.com/jucax/college-cs1/blob/59b50129ec7f20979e569d7a85d17f742b748b86/projects/images/sudoku-example.png?raw=true)

## Making `grid` private
In the last assignment you created a `grid` instance variable. Make this variable `private`.

## `startingGrid` instance variable
Create another `private` instance variable of type `int[][]` called `startingGrid`.

## Sudoku constructor
Write one constructor for the `Sudoku` class. This constructor will have one `int[][]` parameter. Inside the constructor, you need to do two things.
1. Initialize the value of the instance field `grid` to be equal to this parameter.
2. Initialize `startingGrid` to be equal to a copy of the `int[][]` parameter. You will need to initialize `startingGrid` to a brand new `int[][]` of the proper size, and you will need to manually copy all of the elements of the parameter into `startingGrid`.

## `getValue` method
Write a `public` method called `getValue`. This method should have two parameters: `int row` and `int col`. The method has an `int` return type. It should return the value of the square at that particular row and column in the `grid`. Note that `row` and `col` will be numbers between `1` and `9`. But java arrays use 0-based indexing. Keep this in mind when you access and return the value that is being requested.

Here are some examples from the grid above:
- `getValue(1, 1)` should return `5`. 
- `getValue(5, 4)` should return `8`.
- `getValue(9, 1)` should return `0`. Because this square is empty, there will be a `0` at that part of the grid.

## `getStartingValue` method
Write a `public` method called `getValue`. This method should have two parameters: `int row` and `int col`. The method has an `int` return type. It should return the value of the square at that particular row and column in the `startingGrid`. Note that `row` and `col` will be numbers between `1` and `9`. But java arrays use 0-based indexing. Keep this in mind when you access and return the value that is being requested.

## `setValue` method
Write a `public` method called `setValue`. This method should have three parameters: `int row`, `int col`, and `int val`. It does not return anything. It does the following:
- First it checks if the grid was initially empty at that position. If the grid started out with that square filled in, the method does not modify the grid. It is ok to modify a square that started out empty, but we can’t modify a square that was filled in at the start.
- Otherwise, if the initial `grid` was not filled in, the method updates the `grid` so that the `grid` has the value `val` at the given `row` and `col`. Once again, the parameters `row` and `col` will be numbers between 1 and 9, whereas java arrays use 0-based indexing. Keep this in mind when you modify the `grid`. The parameter `val` will be a number between `0` and `9`. It can be 0 because this is what we use to “erase” a square and make it blank. We can erase a square that we filled in ourselves - we just can’t erase a square that was filled in when we started the game.

Here are some examples from the grid above
- `setValue(1, 3, 2)` should put a `2` in row `1` column `3`. 
- `setValue(6, 4, 5)` should put a `5` in row `6` column `4`.
- `setValue(7, 2, 1)` should not modify the `grid`. The initial grid already had row `7` column `2` filled in.
- `setValue(4, 5, 7)` should not modify the `grid`. The initial grid already had row `4` column `5` filled in.

After we make these method calls, getValue will return the updated value, but getStartingValue will return the numbers that

## Commenting your code
You are not required to add any new inline comments (although you are always encouraged to use them!). However, you should add JavaDoc method comments to your constructor and your two new instance methods.

## Assignment Reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- How did we make use of the principle of encapsulation in this assignment?
    - How will encapsulation help us enforce the rules of the game when it comes to not modifying the original grid values?
- What return type did you use for `setValue` and why?
- How did you account for the discrepancy between the type of indexing used in java arrays and the type indexing that humans usually use when referring to rows and columns in a sudoku grid?
- In the constructor, why do we need to initialize `startingGrid` to be a copy of the parameter? Why can’t we just assign `startingGrid` equal to the parameter, the way we did with `grid`? 
- Do you have any follow-up questions about this assignment that you would like me to cover in class?

Additionally, if you received help from another student in the class or from a departmental tutor, please state what help you received and which parts of the assignment you received help on.



