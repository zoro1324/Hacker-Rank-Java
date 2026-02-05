# Java Loops I — Print Multiples 🔁

## Objective
In this challenge, we're going to use loops to perform simple repeated calculations.

## Task
Given an integer **N**, print its first **10** multiples. Each multiple **i** (where 1 ≤ **i** ≤ 10) should be printed on a new line in the form:

```
N x i = result
```

## Input Format
A single integer, **N**.

## Constraints
1 ≤ N ≤ 10000

## Output Format
Print **10** lines of output; each line **i** (where 1 ≤ **i** ≤ 10) contains the product of **N** and **i** in the format specified above.

## Sample Input
```
2
```

## Sample Output
```
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

---

**Tip:** Use a `for` loop from 1 to 10 and print each line using `System.out.println(String.format("%d x %d = %d", N, i, N*i));` or `System.out.printf("%d x %d = %d%n", N, i, N*i);`.
