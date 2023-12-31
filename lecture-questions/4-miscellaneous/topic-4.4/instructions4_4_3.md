# 4.4  Searching and sorting lecture questions
## Exercise 3 / 11
### Instructions:
We have declared a method called `selectionSort`. It has a single parameter `ArrayList<Integer> nums`. You may assume that `nums` is non-empty - there will always be at least one element.

TASK: Fill in the body of the method so that it returns a sorted version of `nums`. You should use the selection sort algorithm discussed in class.

1. Create an empty `ArrayList` to hold the sorted values
2. Repeat the following while there are still values in `nums`.
    1. Find where the smallest value is located
    2. Remove the smallest value from `nums`
    3. Add the smallest value into the `ArrayList` that holds the sorted values
3. Output the set of sorted values

Behind the scenes, we have added an implementation of `minIndex` from the last problem. You may use this method inside of your `sortedValues` method.

HINT: Make use of the `remove` method of the ArrayList class! For this method, you have to supply the location of the element that you want to remove. It will remove that element from the `ArrayList`, and then return it (so you can store the result in a variable).