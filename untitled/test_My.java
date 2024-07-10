// import java.util.*;
// import java.util.Arrays;

// public class test_My {
//     static boolean isAnagram(String a,String b){
      
//     String A= A.toLowerCase();
//     String B=B.toLowerCase();
//     boolean f= false;
    
//     char c[]=A.toCharArray();
//     Arrays.sort(c);
//     char d[]=B.toCharArray();
//     Arrays.sort(d);
//     String A=new String(c);
//     String B=new String(d);
//     if (A.equals(B)){
//         f=true;
//     }
//     return f ;
//     }

//     public static void main(String[] args) {
    
//         Scanner scan = new Scanner(System.in);
//         String a = scan.next();
//         String b = scan.next();
//         scan.close();
//         boolean ret = isAnagram(a, b);
//         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//     }
// }
    

import java.io.*;
import java.util.*;
import java.util.Arrays;


public class test_My {

   static boolean isAnagram(String A, String B) {
	   A=A.toLowerCase();
	   B=B.toLowerCase();
	   boolean f = false;
	  char[] c = A.toCharArray();
	  Arrays.sort(c);
	  char[] d = B.toCharArray();
	  Arrays.sort(d);
	  String a = new String (c);
      String b = new String (d);
      if (a.equals(b)) {
    	  f=true;
      }
      return f;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}

