import java.io.*;
import java.util.*;

public class Solution {

    // The binary search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Element not found
        return -1;
    }

    public static void main(String[] args) {
        // Example test case
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
