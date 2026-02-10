# Java Date and Time

The `Calendar` class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on. In modern Java (8+), prefer the `java.time` API (`LocalDate`, `DayOfWeek`) for working with dates.

---

## Problem

You are given a date. Write the method `findDay` which returns the day of the week for that date in **capital letters** (e.g., `MONDAY`). A portion of the code is provided in the editor; complete the implementation.

### Example

```
month = 8
day = 14
year = 2017
```

The method should return `MONDAY`.

---

## Function Description

Complete the `findDay` function in the editor below.

findDay has the following parameters:
- `int month`
- `int day`
- `int year`

Returns
- `String`: the day of the week in capital letters

---

## Input Format

A single line of input containing the space-separated month, day and year respectively, in `MM DD YYYY` format.

## Constraints

- `2000 < year < 3000`

---

## Sample Input

```
08 05 2015
```

## Sample Output

```
WEDNESDAY
```

## Explanation

The day on August 5th 2015 was **WEDNESDAY**.

---

**Tip:** Use `java.time.LocalDate.of(year, month, day).getDayOfWeek().toString()` to obtain the day name in uppercase. 🔧
