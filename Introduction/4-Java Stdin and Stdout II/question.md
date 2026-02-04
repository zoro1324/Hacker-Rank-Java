# Java Stdin and Stdout II 🧾

## Problem
Read and print values of different primitive types in Java from standard input.

## Input Format
There are three lines of input:

1. The first line contains an integer.
2. The second line contains a double.
3. The third line contains a String.

## Output Format
There are three lines of output:

- On the first line, print `String:` followed by the unaltered String read from stdin.
- On the second line, print `Double:` followed by the unaltered double read from stdin.
- On the third line, print `Int:` followed by the unaltered integer read from stdin.

To make the problem easier, a portion of the code is already provided in the editor.

> **Note:** If you use `nextLine()` immediately after `nextInt()`, remember that `nextInt()` leaves the newline in the input buffer. Calling `nextLine()` immediately after may read the remaining newline (an empty string). Use an extra `nextLine()` to consume the leftover newline if needed.

---

## Sample Input
```
42
3.1415
Welcome to HackerRank's Java tutorials!
```

## Sample Output
```
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
```

---

**Tip:** Use `Scanner` to read `int`, `double`, and `String` values (with `nextInt()`, `nextDouble()`, and `nextLine()`), taking care to handle the newline after numeric reads.
