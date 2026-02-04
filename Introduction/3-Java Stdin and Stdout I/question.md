# Java Stdin and Stdout I — Read and Print Integers 🧾

## Overview
A common way to read input from stdin in Java is the `Scanner` class. For example:

```java
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
```

The code above creates a `Scanner` object and uses it to read a `String` and an `int`. If the input is:

```
Hi 5
```

The output will be:

```
myString is: Hi
myInt is: 5
```

You can also read input using `BufferedReader` for faster IO when needed.

---

## Task
Read 3 integers from stdin and print them to stdout. Each integer must be printed on a new line. A portion of the code is provided in the editor to help you get started.

## Input Format
There are 3 lines of input, and each line contains a single integer.

## Output Format
Print each of the three integers on its own line in the same order they were read.

## Sample Input
```
42
100
125
```

## Sample Output
```
42
100
125
```

---

**Tip:** Use `Scanner` and `nextInt()` to read each integer:

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
System.out.println(a);
System.out.println(b);
System.out.println(c);
sc.close();
```
