# 3.4 Methods skills lab
## Exercise 7 / 7
### Instructions:
Recall the algorithm we learned to convert a number from decimal to binary:

1. Start with a number `num` in decimal
2. Divide `num` by `2`, and write down the remainder (which is guaranteed to be either 0 or 1)
3. Repeat step 1 until `num` has been reduced to 0
4. Read back all of the remainders in reverse order

TASK: Write a `public static` method called `decimalToBinary`. It has a single parameter `int num`. It returns a `String` containing the binary representation of `n`.

HINT: You can (and should) re-use code from you wrote on a problem from the For/While Loops Skills Lab assignment!