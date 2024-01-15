# Sudoku Part 3 Reflection
After you finish writing the code, write a reflection that answers each of the following questions:
- Why do you think we made our three methods return an `ArrayList`, as opposed to an array?
    - **Because we didn’t know in advance how many items we will add, we use `ArrayList` that can grow as data is added and doesn’t need to have a previously declared capacity as an array.**
- Which wrapper class(es) did we use in this assignment?
    - In all the new methods we return `ArrayList<Integer>`, so we are using a wrapper class to convert int to Integer when we store the value of the `grid` array into the corresponding `ArrayList` for row, column or box
- How did you take advantage of auto-boxing in the `getRowValues`, `getColumnValues`, and `getBoxValues` methods?
    - In all of these methods we are adding primitive data (int) to a collection (`ArrayList`) taking advantage of the auto-boxing, specifically we are using it in the method `.add()`
- How do the `printRow`, `printCol`, and `printBox` methods take advantage of auto-unboxing?
    - In these methods we are using a For-Each loop that iterates over the items of the `ArrayList` and uses auto-unboxing to convert each Integer value to an int for subsequently printing, inside this loop there is a hidden method `.get()` that explicitly uses unboxing.
- Of the three methods you wrote, which ones used nested loops, and which ones did not? Why did you make these choices?
    - The methods `getRowValues` and `getColumnValues` don't use nested loops because we just need one single loop to iterate through the values of one single row or column.
    - The `getBoxValues` method uses a nested loop because we need to iterate through three different indexes of three specific columns that conform the 3x3 box. We can do this by calculating in advance the `topMostRow` and `leftMostCol` values.

