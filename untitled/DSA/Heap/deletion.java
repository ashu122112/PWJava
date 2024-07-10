public class deletion {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" "); 
        }
    }
    public static void Heapify(int[] arr,int n,int i){
        int largest =i;
        int l=2*i+1;
        int r=2*i+2;
        //check if the left child is greater than the root node
        if(l<n && arr[largest]<arr[l]){
            largest = l;
        }
        //check if the right child is greater than the root node
        if(r<n && arr[largest]<arr[r]){
            largest = r;
        }
        if (largest!=i){
            swap(arr, i, largest);
            Heapify(arr, n, largest);
        }
    }
    public static int delete(int[] arr, int n)
    {
        //get the last node
        int lastNode = arr[n-1];

        //replace it with the first element
        arr[0] = lastNode;

        //decrease the size of the heap
        n--;

        Heapify(arr, n, 0);

        return n;
    }
    public static void main(String[] args) {
        int MAX = 100;

        int[] arr = new int[MAX];

        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;

        System.out.println("Before delete, heap elements are : ");
        printArr(arr, n);
System.out.println();
        n = delete(arr, n);

        System.out.println("After delete, heap elements are : ");
        printArr(arr, n);
    }
}

