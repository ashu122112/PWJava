import java.util.*;

public class inversionCount {
    public static int inversion(int arr[],int n){
        int count=0;
        for(int i =0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    count+=1;

                }
            }
        }
        return count;
    }
    // mergeProcedure function
    public static int mergeProcedure(int arr[], int l, int mid , int h ){
        int swap=0;
        int []lsubarray=Arrays.copyOfRange(arr,l,mid+1);
        int []rsubarray=Arrays.copyOfRange(arr,mid+1,h+1);

        int i=0,j=0,k=h ;

        while(i<lsubarray.length && j<rsubarray.length){
            if(lsubarray[i]<rsubarray[j]){
                arr[k++]=lsubarray[i++];
            }
            else{
                arr[k++]=rsubarray[j++];
                swap += (mid + 1) - (l + i);
            }

        }
        return swap;

    }
    public static int inversionOpt(int arr[],int l,int h){
        //1.Divide
        int count =0;
        if (l<h){
            int mid=l+(h-l)/2;
            //2.Conquer
            count += inversionOpt(arr,l,mid);
            count += inversionOpt(arr,mid+1,h);
            //3.combine
            count += mergeProcedure(arr,l,mid,h);
            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,8,3,4};
        int n = arr.length;
        int count=inversion(arr,n);
        System.out.println("the no. of inversion by brute force method : "+count);
        int countOpt=inversionOpt(arr,0,n);
        System.out.println("The no. of inversion using Divide and conquer : "+countOpt);
    }
    
}
