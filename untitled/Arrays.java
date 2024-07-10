public class Arrays {
    public static void main(String[] args) {

        // int a[] = { 20, 1, 3, 25, 45, 4 };

        // int a[]= new int[4];
        // a[0]=2;
        // a[1]=4;
        // a[2]=6;
        // a[3]=0;

        String name[] = { "navin", "harsh", "Kiran" };
        System.out.println(name[1].length());

        // System.out.println(a[0]);
        // System.out.println(a[3]);
        // for (int i = 0; i <= 4; i++) {
        // System.out.println(a[i]);
        // }

        for (int j = 0; j <= 2; j++) {
            System.out.println(name[j]);
        }

        // ___________________________________________________________________
        // ..........................
        // ........2-D ARRAY.........

        // int a[][] = new int [3][2];
        // a[0][0]=5;
        // a[0][1]=2;
        // a[1][0]=12;
        // a[1][1]=0;
        // a[2][0]=5;
        // a[2][1]=65;
        int a[][] = {
                { 5, 2, 6, 7 },
                { 1, 0 },
                { 5, 9, 4 }
        };

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("______________________________________");

        // ..............................................
        // Enhanced for loop

        // int nums[]={2,3,4,5,};
        // System.out.println(nums.length);
        // for (int n : nums){
        // System.out.println(n);
        // }

        int q[][] = {
                { 5, 2, 6, 7 },
                { 1, 0, 5, 4 },
                { 5, 9, 4, 3 }
        };
        System.out.println(q.length);
        System.out.println(q[0].length);

        // for(int b[]:q )
        // {
        // for (int c:b)
        // {
        // System.out.print(c+" ");
        // }
        // System.out.println();
        // }

        //--------------------------------------------------
        //  ARRAY CALCULATION....
        calc obj = new calc();
        int nums[2,3,4,5,8};
        int result = obj.add(nums)]={2;

        System.out.println(result);

        // .....ANONYMOUS ARRAY .....
        calc obj1 = new calc();
        
        int result1 = obj.add(new int[]{2,3,4,5,8});

        System.out.println(result);

        //System.out.println(nums[4]);   ..ArrayIndexOutOfBoundsException
        System.out.println(nums[nums.length-1]);
        System.out.println("______________");
        for (int i=0; i<nums.length;i++){
                System.out.println(nums[i]);
        
        }
        System.out.println("______________");

        for (int n:nums){
            System.out.println(n);
        }

        int sh[]={35,85,65,2};
        System.out.println(sh[2]); // Gives Address ...

    }

}

class calc {
    public int add(int nums[]) {
        int result = 0;
        for (int n:nums)
        result = n+result ;
        return result;

    }
}
