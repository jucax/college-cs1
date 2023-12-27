# 3.4  Methods lecture questions
## Exercise 5 / 8
### Instructions:
Assume we have created a class called `Oven`, with an instance variable called `temperature` as follows:

```
class Oven
{
    private int temperature;

    public int getTemperature(){...}
}
```

TASK: Create an overloaded method called `preheat`.

- The method does not return anything
- One version of the method takes no input parameters, and it sets the `temperature` to `350`
- One version of method takes an `int temp` as input and it sets `temperature` to `temp`. However, if `temp` is greater than `500`, it sets the `temperature` to `500`.
- One version of the method takes two inputs: `int temp` and `char scale`. If the scale is `‘F’`, then temperature is set as in the same way as the second version. If the scale is `‘C’`, you need to convert the temperature from Celsius to Fahrenheit before converting.

HINT: The formula to convert from Celsius to Fahrenheit is **1.8 × temp + 32**. However, make sure you convert the final result back to an `int`!
