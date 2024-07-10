public class permute {
    public static String swap(String str, int i, int j ){
        char charArray[]= str.toCharArray();
        
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;

        return String.valueOf(charArray);  
    } 

    public static void permute_str(String str , int l , int r){
        if (l==r){
            System.out.println(str);
        }
        else{
            for(int i=l;i<=r;i++){
                str=swap(str, l, i);
                permute_str(str, l+1, r);
                
                //backtraking
                swap(str, l, i);
            }
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        int n=str.length();
        System.out.println("for the string "+ str+" permutations are :");
        permute_str(str, 0, n-1);
    }
}
