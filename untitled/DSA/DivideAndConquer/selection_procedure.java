public class selection_procedure {
    public static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
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

    public static int selectionProcedure(int arr[], int l, int h, int k) {

        // 1.divide
        int m = partition(arr, l, h);
        if (m == k - 1) {
            return arr[m];

        } else if (m < k - 1) {
            // traverse to the right of array
            return selectionProcedure(arr, m + 1, h, k);

        } else {
            return selectionProcedure(arr, l, m - 1, k);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 20, 32, 12, 34, 67, 50, 54 };
        int n=arr.length;
        int k = 6; // 3rd smallest number
        int result = selectionProcedure(arr, 0, n - 1,k);
        System.out.println("the 3rd smallest nuber in the array is " + result);

    }

}
