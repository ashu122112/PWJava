import java.util.*;
public class programme_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[]={2,3,4,5,6};
        System.out.println("Enter increment number :");
        int numFromUser = scan.nextInt(); 
        // System.out.println("Enter index number :");
        // int indexNum = scan.nextInt();

        // for (int i=0;i<num.length;i++){
        //     System.out.println(num[i] + numFromUser);
        // }
        // calc obj=new calc();
        // int result = obj.add(numFromUser+num[indexNum]);
        for (int i=0;i<num.length;i++){
            num[i] = num[i] + numFromUser;
            System.out.print(num[i] + " ");
        }

    }   
    
}
// class calc {
//     public int add(int num[],int index) {
//         int result = 0;
//         for (int n:numFromUser)
//         result = n+result ;
//         return result;

//     }
// }
