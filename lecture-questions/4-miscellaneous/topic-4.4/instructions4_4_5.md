# 4.4  Searching and sorting lecture questions
## Exercise 5 / 11
### Instructions:
We have declared a method called `minIndexStartingFrom`. It has two parameters: `ArrayList<Integer> nums` and `int startIndex`. You may assume that `nums` is non-empty - there will always be at least one element. You may also assume that **0 ≤ startIndex < nums.size().**

TASK: Fill in the body of the method so that it returns the index of the minimum element that occurs at or after `startIndex`. So for example, if `startIndex` is `3`, then we should find and return the index of the minimum element that occurs at position `3` or later.

If there are multiple indices tied for the smallest value, you should return the first index that contains the minimum value.

EXAMPLE: If `nums` contains `1, -2, 4, -1, 10, 5` and `startIndex` is `0`, then we would return `1`. That's because we only consider elements from position `0` onwards, so we only consider the numbers `1, -2, 4, -1, 10, 5,` and the minimum of these elements is `-2` which is located at position `1` in the original `ArrayList`.

EXAMPLE: If `nums` contains `1, -2, 4, -1, 10, 5` and `startIndex` is `1`, then we would return `1`. That's because we only consider elements from position `1` onwards, so we only consider the numbers `-2, 4, -1, 10, 5,` and the minimum of these elements is `-2` which is located at position `1` in the original `ArrayList`.

EXAMPLE: If `nums` contains `1, -2, 4, -1, 10, 5` and `startIndex` is `2`, then we would return `3`. That's because we only consider elements from position `2` onwards, so we only consider the numbers `4, -1, 10, 5,` and the minimum of these elements is `-1` which is located at position `3` in the original `ArrayList`.