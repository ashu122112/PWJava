import java.util.*;
import java.io.*;

class Test {
    // int a;
    // String name="Rahul";

    // public static void main(String[] args) {
    // // declare the object
    // // create the object
    // int num = 9; // primitive
    // Test obj1 = new Test(); //reference
    // Test obj2 = new Test();

    // obj1.name="Navin";
    // System.out.println(obj1.a);
    // System.out.println(obj1.name);

    // System.out.println(obj2.a);
    // System.out.println(obj2.name);

    // //________________________________________________

    // Scanner in = new Scanner(System.in);
    // int t=in.nextInt();
    // for(int i=0;i<t;i++){
    // int a = in.nextInt();
    // int b = in.nextInt();
    // int n = in.nextInt();
    // int arr[] = new int[n] ;
    // arr[0]=a+(int)(Math.pow(2, 0)*b);
    // for (int j=1; j<n;j++){
    // arr[j]=arr[j-1]+(int)(Math.pow(2, j));
    // }
    // for (int e1:arr){
    // System.out.print(e1+" ");

    // }
    // System.out.println();

    // }
    // System.out.println();
    // in.close();

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();

    // for (int i = 0; i < t; i++) {

    // try {
    // long x = sc.nextLong();
    // System.out.println(x + " can be fitted in:");
    // if (x >= -128 && x <= 127) {
    // System.out.println("* byte");
    // }
    // if (x >= (int) (Math.pow(-2, 15)) && x < (int) (Math.pow(2, 15)) - 1) {
    // System.out.println("* short");
    // }
    // if (x >= (int) (Math.pow(-2, 31)) && x < (int) (Math.pow(2, 31)) - 1) {
    // System.out.println("* int");
    // }
    // if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) {
    // System.out.println("* long");
    // }

    // } catch (Exception e) {
    // System.out.println(sc.next() + " can't be fitted anywhere.");
    // }
    // }
    // }

      static int B;
    static int H;
    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
    };

    static void area() {

        if (B > 0 && H > 0) {
            int a = B * H;
            System.out.println(a);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        area();
    }
}
