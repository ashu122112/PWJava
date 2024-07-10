public class backtracking_tiling {
    public static int getways(int n){
        if (n<=3){
            return n ;
        }
        {
            return getways(n-1)+getways(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(getways(7));
    }
}