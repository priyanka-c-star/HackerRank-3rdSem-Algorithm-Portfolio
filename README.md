# HackerRank 3rd Semester Algorithm Portfolio

**Student Name:** Priyanka C
**SRN:** R25EF204
**Semester:** 3rd Semester
**HackerRank Profile:** https://www.hackerrank.com/profile/PriyankaGowda

## Introduction
This repository contains my Java solutions to 5 algorithmic problems from HackerRank. It serves as a portfolio for my 3rd-semester coursework.

## Problem Summary Table
| No. | Problem Name | Algorithm Used | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| 1 | Mini-Max Sum | Sorting / Summation | O(N log N) | O(1) |
| 2 | Birthday Cake Candles | Max Finding / Counting | O(N) | O(1) |
| 3 | Insertion Sort - Part 1 | Insertion Sort | O(N) | O(1) |
| 4 | Binary Search | Divide & Conquer | O(log N) | O(1) |
| 5 | Mark and Toys | Greedy / Sorting | O(N log N) | O(1) |

## Approach and Complexity Analysis

### 1. Mini-Max Sum
*   **Approach:** Sort the array. The minimum sum is the sum of the first 4 elements, the maximum sum is the sum of the last 4 elements.
*   **Time Complexity:** O(N log N) due to sorting.
*   **Space Complexity:** O(1) auxiliary space.

### 2. Birthday Cake Candles
*   **Approach:** Find the maximum height of candles. Iterate through and count how many match the maximum.
*   **Time Complexity:** O(N) for one pass.
*   **Space Complexity:** O(1) auxiliary space.

### 3. Insertion Sort - Part 1
*   **Approach:** Shift elements to the right until the correct position for the last element is found, then insert it.
*   **Time Complexity:** O(N) for the shift.
*   **Space Complexity:** O(1) auxiliary space.

### 4. Binary Search
*   **Approach:** Use divide-and-conquer. Compare target with the middle element and discard half the array.
*   **Time Complexity:** O(log N) because search space halves each step.
*   **Space Complexity:** O(1) for the iterative approach.

### 5. Mark and Toys
*   **Approach:** Sort prices ascending. Buy toys cheapest-first until the budget runs out.
*   **Time Complexity:** O(N log N) due to sorting.
*   **Space Complexity:** O(1) auxiliary space.

## Reflective Summary
Through these 5 HackerRank problems in Java, I learned the importance of choosing the right algorithm. Binary Search taught me how dividing the search space in half reduces time complexity to O(log N). Insertion Sort showed me how to shift array elements in-place. For Mark and Toys, I learned that sorting first makes greedy algorithms much easier. This assignment improved my ability to analyze time and space complexity using Big-O notation.


