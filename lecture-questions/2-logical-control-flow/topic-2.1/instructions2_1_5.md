# 2.1 Conditionals lecture questions 
## Exercise 5 / 5
### Instructions:
Imagine you are writing the code for a self-driving car. You are approaching a stoplight. 
- Your sensors have sensed and processed the light color and created a variable called `lightColor`. 
- Your sensors have also sensed how far you are from the stoplight, and created a variable called `distanceToStoplight`.
- You have a variable called `acceleration`, which controls the acceleration of the car.

Assume we have defined a variables of type `String` called `lightColor`, a variable of type `double` called `distanceToStoplight`, and a variable of type `double` called `acceleration` with the following lines of code:

```
String lightColor = ??; // 'lightColor' can be "red", "yellow", or "green"
double distanceToStoplight = ???; // 'distanceToStoplight' can have any double value
double acceleration = ??; // 'acceleration' can have any double value
```

TASK: write code that does the following.
- If the `lightColor` is red, the `acceleration` is set to `-20`.
- If the `lightColor` is green, the `acceleration` does not change.
- If the `lightColor` is yellow, and `distanceToStoplight` less than `50`, set `acceleration` to `20`.
- If the `lightColor` is yellow and `distanceToStoplight` is more than `50`, the `acceleration` is cut in half.
