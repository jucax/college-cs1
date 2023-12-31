# 4.4  Searching and sorting lecture questions
## Exercise 10 / 11
### Instructions:
We have declared a method called `mergeSorted` with two `ArrayList<Integer>` parameters `sortedNums1` and `sortedNums2`. You can assume `sortedNums1` and `sortedNums2` are non-empty and are already sorted in ascending (i.e., increasing) order.

TASK: Fill in the body of the mergeSorted method so that it will return a sorted `ArrayList<Integer>` containing all the elements of `sortedNums1` and `sortedNums2` (including duplicate elements). You should use the merging algorithm discussed in class:

1. Create a new `ArrayList` to store the combined values
2. Create variables `i` and `j` that keep track of where we are in each list
3. Repeat the following while either `i` or `j` (or both) is in bounds:
    1. If `i` is out of bounds, add the value at position `j` of `sortedNums2` into the combined list. Increment `j`
    2. Alternately, if `j` is out of bounds, add the value at position `i` of `sortedNums1` into the combined list. Increment `i`
    3. Othwerise:
        1. Let `num1` be the value of `sortedNums1` at position `i`
        2. Let `num2` be the value of `sortedNums2` at position `j`
        3. Compare `num1` and `num2`
        4. Whichever number is smaller, add that number into the combined list. Increment the variable (`i` or `j`) associated with that value
    4. Output the combined list