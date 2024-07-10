import java.util.Scanner;
public class program {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
    //    System.out.println("Enter no. of Bun :");
    //    int a=sc.nextInt();
    //    System.out.println("Enter no. of Onions :");
    //    int b=sc.nextInt();
    //    System.out.println("Enter no. of Tikki :");
    //    int c=sc.nextInt();
    //     if ((a<b)&&(a<c)){
    //         System.out.println("No. of burgers :"+a);
    //     }
    //     if (b<c){
    //         System.out.println("No. of Burgers :"+b);
    //     }     
    //     else{
    //         System.out.println("No. of Burgers :"+c);
    //     }

        //_______________________________________________________

            //       ....ADDITION OF MATRICES....

//         System.out.println("enter value of n");
//         int n=sc.nextInt();
//         int [][]ar1=new int [n][n];
//         int [][]ar2=new int [n][n];
//         for(int i=0;i<ar1.length;i++){
//             for (int j=0;j<ar1[i].length;j++){

//                 System.out.println("Enter entries1 :");
            
//             ar1[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<ar2.length;i++){
//             for (int j=0;j<ar2[i].length;j++){

//                 System.out.println("Enter entries2 :");
            
//             ar2[i][j]=sc.nextInt();
//             }
//         }
//         int [][]arr=new int[n][n];
//         for (int k=0;k<ar1.length;k++){
            
//             for(int l=0;l<ar1[k].length;l++){
//                 arr[k][l]=ar1[k][l] + ar2[k][l];
            
//                 System.out.print(" " + arr[k][l]);
//             }
//             System.out.println();
//         }
//     }
// 
//_____________________________________________________________

//     

        int []a ={10,20,15,16,2,0,1};
        
            
        // for(int i=0; i<a.length;i++){
        //     int c = 0;
        //     if(i == a.length-1)
        //     c=1;
        //     for(int j=i+1;j<a.length;j++){
        //         if(a[i]<a[j]){

        //             c++;
        //             break;
        //         }
        //     }
        //     if (c == 0){
        //             System.out.println(a[i]);
        //         }
        // }

        int Leader=a[a.length-1];
        for(int i=a.length-2; i>=0; i--){
            if (Leader<a[i]){
                Leader=a[i];
                System.out.println(Leader);
            }
        }
    }
}