# 3.4 Methods skills lab
## Exercise 3 / 7
### Instructions:
Recall that a "palindrome" is a sequence that is the same forward and backwards. For example, the string "RACECAR" is a palindrome because, if we reverse it, we get the same string.

Assume we have defined a class called `WordSmith`. 

TASK: Write a `public` method called `isPalindrome` with one `String` parameter `word`. It should return `true` if `word` is a palindrome; otherwise, it should return `false`. You can assume `word` will only consist of capital letters.

HINT: One approach is to write a loop that checks if the first character matches the last character. Then check if the second character matches the second to last character. And so on...

Alternately, you could write a loop to create a second `String` object that is the reversed version of `word`. Then use the `equals` method to check if the two strings are the same. If you are doing this, make sure you use the `equals` method, not `==`.

HINT: Make use of the charAt method of the String class

NOTE:  Do not print anything. We take care of printing behind the scenes. But you should return something.

NOTE: You do not need to create a class. Just write the method.