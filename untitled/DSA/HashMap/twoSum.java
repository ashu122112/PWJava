//time complexity = O(n)
//space complexity = O(n)

import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        //Entering elements in array
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //entering the target value
        System.out.println("Enter the target:");
        int target =sc.nextInt();

        //array for storing result
        int result[]=new int[2];

        //creating a hashmap where key is value of arr and value = index
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(arr[i], i);
        }

        //if current = target 
        for(int i=0;i<n;i++){
            if (arr[i]==target && map.containsKey(0)){
                result[0]=i;
                result[1]=arr[i];
                break;
            } 
            else if(map.containsKey(target - arr[i])){
                //if element is non repeatable
                if(map.get(target-arr[i])>i){
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }
            }
        }
        System.out.println("Two Sum index values are: ["+result[0]+","+result[1]+"]");
    }
}
