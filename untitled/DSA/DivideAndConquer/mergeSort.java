public class mergeSort {
    public static void mergeProcedure(int arr[], int l, int r, int mid) {
        int i, j, k;
        int n1 = mid - l + 1; // size of left subarray
        int n2 = r - mid; // size of right subarray
        int leftsubarr[] = new int[n1];
        int rightsubarray[] = new int[n2];

        // coping of element in subarays
        for (i = 0; i < n1; i++) {
            leftsubarr[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            rightsubarray[j] = arr[l + mid + i];
        }
        // comparison btw left and right subarray
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (leftsubarr[i] <= rightsubarray[i]) {
                arr[k] = leftsubarr[i];
                i = i + 1;
            } else {
                arr[k] = rightsubarray[j];
                j = j + 1;
            }
            k = k + 1;
        }

        // coping of remaining elements from left subarray
        while (i < n1) {
            arr[k] = leftsubarr[i];
            i = i + 1;
            k = k + 1;
        }

        // coping of remaining elements from right subarray
        while (j < n2) {
            arr[k] = leftsubarr[i];
            j = j + 1;
            k = k + 1;
        }
    }

    public static void MergeSort(int arr[], int l, int r) {
        // 1.Divide
        int mid = l + (r - l) / 2;
        // conquer
        // for left subArray
        MergeSort(arr, l, mid);
        // for right subArray
        MergeSort(arr, mid + 1, r);
        // combine
        mergeProcedure(arr, l, mid, r);
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 50, 20, 30, 40, 90, 45 };
        int n = arr.length;
        System.out.println("Before Sorting: ");
        printArr(arr, n);

        MergeSort(arr, 0, n - 1);

        System.out.println("After Sorting: ");
        printArr(arr, n);
    }
}
