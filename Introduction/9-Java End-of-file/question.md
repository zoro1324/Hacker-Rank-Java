# Java End-of-file

The challenge is to read lines of input until you reach EOF, then number and print all lines of content.

**Hint:** Java's `Scanner.hasNext()` method is helpful for this problem. 🔧

---

## Input Format

Read some unknown number of lines of input from `stdin` (`System.in`) until you reach EOF. Each line of input contains a non-empty string.

## Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

## Sample Input

```
Hello world
I am a file
Read me until end-of-file.
```

## Sample Output

```
1 Hello world
2 I am a file
3 Read me until end-of-file.
```

---

**Explanation:** Number each input line starting from 1 and print it on its own line in the format shown above. ✅
