# Assessment 01

## Part A 

Complete the 3 problems in `com.codedifferently.assessment01.partA` .

### Problem 01: Near Hundered

Given an `int n`, return `true` if it is within 10 of 100 or 200. 

* nearHundred(93) → true
* nearHundred(90) → true
* nearHundred(89) → false

### Problem 02: Missing Char

Given a non-empty string and an int n, return a new string where the char at index n has been removed. 

The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

* missingChar("kitten", 1) → "ktten"
* missingChar("kitten", 0) → "itten"
* missingChar("kitten", 4) → "kittn"

### Problem 03: IntMax

Given three int values, a b c, return the largest.

* intMax(1, 2, 3) → 3
* intMax(1, 3, 2) → 3
* intMax(3, 2, 1) → 3


### Problem 04 : SpecialEleven

We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator

* specialEleven(22) → true
* specialEleven(23) → true
* specialEleven(24) → false