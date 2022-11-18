/*
* Write a lambda expression that calculates a * x^2+b * x+c
, where a, b, c are variables and x is the lambda parameter.
* The lambda is to have the (Int) -> Int type. Note that variables a, b, c are already declared.
* */

val lambda: (Int) -> Int = { x: Int ->
    a * x * x + b * x + c
}