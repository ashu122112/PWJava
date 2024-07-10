class Demo1{
    static int a;
    static int b;
    
    int m;
    int n;

    static{
        a=20;
        b=15;
        System.out.println("Control in static method");
    }
    {
        m=200;
        n=100;
        System.out.println("Control in static method");
    }
    static void disp1(){
        System.out.println("The value of static variable a is "+a);
        System.out.println("The value of static variable b is "+b); 
        //System.out.println(m); INVALID.. we cannot call static member in non static class.
   }
   void disp2(){
        System.out.println("The value of instance variable a is "+a);
        System.out.println("The value of instance variable b is "+b); 
}
}

public class Launch_1 {
    public static void main(String[] args) {
        Demo1 d=new Demo1();
        Demo1.disp1();
        d.disp2();
    }
}

