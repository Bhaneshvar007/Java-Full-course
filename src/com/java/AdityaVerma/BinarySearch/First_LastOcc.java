package com.java.AdityaVerma.BinarySearch;
import java.util.*;

public class First_LastOcc {
    
    // for first occurrence.
    public static int[] occ(int arr[], int el, int n) {
        int x = -1;
        int[] ans = new int[2];
        int i = 0, j = n - 1, m = 0;
        while (i <= j) {
            m = i + (j - i) / 2;
            if (arr[m] > el) {
                j = m - 1;
            } else if (arr[m] < el) {
                i = m + 1;
            } else {
                x = m;
                j = m - 1;
            }
        }
        ans[0] = x;
        i = 0;
        j = n - 1;
        m = 0;
        while (i <= j) {
            m = i + (j - i) / 2;
            if (arr[m] > el) {
                j = m - 1;
            } else if (arr[m] < el) {
                i = m + 1;
            } else {
                x = m;
                i = m + 1;
            }
        }
        ans[1] = x;
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the searching element : ");
        int el = sc.nextInt();
        int[] result = occ(arr, el, n);
        System.out.println("First occurrence of " + el + " is at index: " + result[0]);
        System.out.println("Last occurrence of " + el + " is at index: " + result[1]);
    }
}
