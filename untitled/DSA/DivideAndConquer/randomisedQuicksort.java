
import java.io.*;
import java.util.*;

public class randomisedQuicksort {
    public static int partition(int arr[], int l, int h) {
        int randomIndex = l + (int) Math.random() % (h - l + 1);

        int e= arr[randomIndex];
        arr[randomIndex] = arr[l];
        arr[l] = arr[randomIndex];

        int pivot=arr[l];
        int i = l;
        for (int j = i + 1; j <= h; j++) {
            if (arr[j] < pivot) {
                i = i + 1;
                // swap(arr[i],arr(j))
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap(arr[l],arr[i])
        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;

        return i;
    }

    public static void QuickSort(int arr[], int l, int h) {
        if (l < h) {
            // 1.divide
            int m = partition(arr, l, h);
            // conquer the subproblem via recursion
            QuickSort(arr, l, m - 1);
            QuickSort(arr, m + 1, h);
        }
    }

    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 32, 12, 34, 67, 50, 54 };
        int n = arr.length;
        System.out.println("Before sorting :");
        printArr(arr, n);
        QuickSort(arr, 0, n - 1);
        System.out.println("After sorting :");
        printArr(arr, n);
    }
}
