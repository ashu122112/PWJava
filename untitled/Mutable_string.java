public class Mutable_string {
    public static void main(String[] args) {
        // StringBuffer sb=new StringBuffer("Virat");
        // System.out.println(sb);
        // sb.append(" Kohli");
        // System.out.println(sb);

        StringBuilder sb=new StringBuilder("Virat");
        System.out.println(sb);
        sb.append(" Kohli");
        System.out.println(sb);
  // ____________________________________________________

      //     ... final vs immutability...

    //     int a=10;
    //     a=20;         // will give 20 as output
    //     System.out.println(a);

    //     final int b=50;
    //     // b=20;          
    //     System.out.println(b); // compilation error 

    StringBuffer s1= new StringBuffer("Virat");
    s1.append("Kohli");
    // System.out.println(s1);
    s1=new StringBuffer("sachin");
    System.out.println(s1);  // gives sachin in s1 

    final StringBuffer s2= new StringBuffer("rohit");
    s2.append("Kohli");
    // System.out.println(s2);
    //  s2=new StringBuffer("sachin");  // gives error as final is used
    System.out.println(s2); 

    //_______________________________________________________________



    }
}
