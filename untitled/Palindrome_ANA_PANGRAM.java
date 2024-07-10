import java.util.*;
import java.util.Arrays;
public class Palindrome_ANA_PANGRAM {
    public static void main(String[] args) {
        // String word;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your Word :");
        // word=scan.next();
        // String str="";
        // for (int i=word.length()-1; i >=0;i--){
        //     str=str+word.charAt(i);
        // }
        // if (word.equals(str)){
        //     System.out.println("Given Word is Palindrome word.");
        // }
        // else {
        //     System.out.println("Given word is not Palindrome word.");
        // }
       
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String str="";
        for(int i=A.length()-1;i>=0;i--){
            str=str+A.charAt(i);
        }
            if (str.equals(A)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        
        /* Enter your code here. Print output to STDOUT. */
        
    

        //-----------------------------------------------------------------
        //           .......ANAGRAM.........

        String str1="School Master";
        String str2="The Classroom";

        str1=str1.replace(" ", "");
        str2=str2.replace(" ", "");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char []ar1=str1.toCharArray();
        char []ar2=str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if (Arrays.equals(ar1,ar2)){
            System.out.println("It's an ANAGRAM");
        }
        else{
            System.out.println("It's not a ANAGRAM");
        }

        //-----------------PANGRAM------------------------

        boolean flag=false;
        String st="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        st=st.replace(" ", "");
        char ch[]=st.toCharArray();

        int arr[]= new int[26];

        for (int i=0 ;i<ch.length;i++){
            arr[ch[i]-65]++;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                System.out.println("Its not pangram");
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("Its pangram");
        }
    }
}
