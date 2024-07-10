public class fibonacci {
    //top-bottom approach..
    public static int fib(int n){
        int a=0,b=1,c=0;
        if(n==0 || n==1){
            return n;
        }
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        int n1=1;
        System.out.println("the fibonacci series for "+n1+" is "+fib(n1));
    }

    //.....................................................................

    
}
