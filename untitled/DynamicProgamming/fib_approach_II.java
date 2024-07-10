public class fib_approach_II {
    public static int fibo(int n){
        int fibSeries[]=new int[n+1];
        for(int i=0;i<n;i++){
            fibSeries[i]=-1;
        }
        return fibHelper(n,fibSeries);
    } 
    
    public static int fibHelper(int n , int[] fibSeries){
        if(n==0||n==1){
            return n;
        }
        if (fibSeries[n]!=-1){
            return fibSeries[n];
        }
        else{
            int x=fibHelper(n-1, fibSeries);
            int y=fibHelper(n-2, fibSeries);
            fibSeries[n]=x+y;
            return fibSeries[n];
        }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("the fibonacci series for "+n+" is "+fibo(n));
    }
}
    

