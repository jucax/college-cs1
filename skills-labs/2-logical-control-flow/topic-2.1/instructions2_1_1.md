# 2.1 Conditionals skills lab
## Exercise 1 / 3
### Instructions:
Imagine you and your friends are burnt out from studying for finals, and you want to plan a spontaneous road trip to Las Vegas the library. However, ~~Las Vegas~~ the library is far away, so you need to make sure you can get back to Southwestern before your first final. You know that the entire trip, driving there and back, is exactly distance miles, and you know you have to drive that `distance` in at most exactly `time` hours to get back before your final. You also know that, regardless of speed limits, the fastest speed your friend's car can drive is exactly `maxSpeed` miles per hour.

Assume we have already defined 3 variables of type `int` called `distance`, `time`, and `maxSpeed` with the following line of code:

```
int distance = ???; // 'distance' can have any int value
int time = ???;     // 'time' can have any int value
int maxSpeed = ???; // 'maxSpeed' can have any int value
```

TASK: Given **distance**, **time**, and **maxSpeed**, is it physically possible to make the trip in time? If it is, print "possible"; otherwise, print "impossible". Assume ~~Las Vegas~~ the library is not at Pitt.

HINT: Try to avoid using division. Some of our tests set the variable values to 0.