# Java Static Initializer Block

Static initialization blocks execute when the class is loaded and are commonly used to initialize static variables.

Complete the provided `Solution` class so it prints the area of a parallelogram with breadth `b` and height `h`. Read the two values from standard input. If `b` or `h` is non-positive, print the exact message:

```
java.lang.Exception: Breadth and height must be positive
```

---

## Input Format

There are two lines of input:
- The first line contains an integer `b`, the breadth of the parallelogram.
- The second line contains an integer `h`, the height of the parallelogram.

## Output Format

- If both values are greater than zero, print the area of the parallelogram (b × h).
- Otherwise, print the message: `java.lang.Exception: Breadth and height must be positive`.

## Sample Input 1

```
1
3
```

## Sample Output 1

```
3
```

## Sample Input 2

```
-1
2
```

## Sample Output 2

```
java.lang.Exception: Breadth and height must be positive
```

---

**Explanation:** Use a static initialization block to validate input and throw/print the required exception message if either `b` or `h` is non-positive. Otherwise compute and print `b * h`. 🔧
