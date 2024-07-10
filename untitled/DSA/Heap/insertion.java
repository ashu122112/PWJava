public class insertion {
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
    public static void Heapify(int arr[],int n ,int i){
        //find parent 
        int parent = (i-1)/2;
        if (arr[parent]>0){
            //check if the current node is greater than the root node, if yes then, apply swap and call heapify
            if (arr[i]>arr[parent]){
                swap(arr, i, parent);
                //recursively call heapify for parent node
                Heapify(arr, n, parent);
            }
        }
    }
    public static int insert(int arr[], int n, int value){
        n++;
        //insert the value at the end of heap
        arr[n-1]=value;
        //up heapify
        Heapify(arr, n, n-1);
        //return size of the heap
        return n;
    }
    public static void main(String[] args) {
        int MAX=100;
        int []arr=new int[MAX];
         //initialize values
         arr[0] = 100;
         arr[1] = 70;
         arr[2] = 60;
         arr[3] = 50;
         arr[4] = 55;
         
         // take current size of arr
         int n=5;
         int value=80;
         System.out.println("Before insert operation, elements are : ");
         printArr(arr, n);
         System.out.println();
         n=insert(arr, n, value);
         System.out.println("Total elements in the heap : " + n);
         System.out.println("After insert operation, elements are : ");
         printArr(arr, n);
    }
    
}
