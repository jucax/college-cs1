# 4.4  Searching and sorting lecture questions
## Exercise 7 / 11
### Instructions:
We have declared a method called `selectionSortInPlace`. It has a single parameter `ArrayList<Integer> nums`. You may assume that `nums` is non-empty - there will always be at least one element.

TASK: Fill in the body of the method so that it sorts `nums`. Your method should not return anything. You should use the **in-place version** of the selection sort algorithm discussed in class.

1. Repeat the following for `i = 0, 1, ... nums.size() - 1`:
    1. Find the location of the smallest element starting from position `i`. 
    2. Swap the element at position `i` with the element at the index found in the previous step
    
Behind the scenes, we have added implementations of `minIndexStartingFrom` and `arrayListSwap` from the last two problems. You may use these methods inside of your `selectionSortInPlace` method.