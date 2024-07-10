public class More_on_String {
    public static void main(String[] args) {
        // String str="PW Java";
        // String str1="";
        // for(int i=str.length()-1; i>=0;i--){
        // str1=str1+str.charAt(i);
        // }
        // System.out.println("Before revering :"+ str);
        // System.out.println("After revering :"+ str1);

        String s1 = "pwskills java";
        String s2 = "";
        String sarr[] = s1.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            s2 = s2 + sarr[i] + " ";
        }
        System.out.println("Before reversing :" + s1);
        System.out.println("After  reversing :" + s2);

        // _______________________________________________

        String str = "PW Java";
        String str1 = "";
        String arr[] = str.split(" ");
        for (String elem : arr) {
            for (int i = elem.length() - 1; i >= 0; i--) {
                str1 = str1 + elem.charAt(i);
            }
            str1=str1 + " ";
        }
        System.out.println("Before revering :" + str);
        System.out.println("After revering  :" + str1);
    }
}
