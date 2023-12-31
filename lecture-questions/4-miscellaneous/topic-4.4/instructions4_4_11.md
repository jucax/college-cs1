# 4.4  Searching and sorting lecture questions
## Exercise 11 / 11
### Instructions:
We have declared a method called `mergeSort`. It has a single parameter `ArrayList<Integer> nums`. You may assume that `nums` is non-empty - there will always be at least one element.

TASK: Fill in the body of the method so that it returns a sorted version of `nums`. You should use the merge sort algorithm discussed in class.

1. If the `ArrayList` has size `0` or `1`, it is already sorted, so we return the original `ArrayList`.
2. Split the `ArrayList` into the left and right halves.
3. Recursively call `mergeSort` on the left and right halves.
4. Merge the two sorted lists.
5. Output the result of merging the two sorted lists.

Behind the scenes, we have added a implementations of `firstHalf`, `secondHalf`, and `mergeSorted` from the last three problems. You may use these methods inside of your `mergeSort` method.