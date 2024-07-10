import java.util.HashMap;
import java.util.Scanner;

public class firstOccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        // Construction of a hashtable
        // key - unique characters in the string
        // value - frequecy of each character in the string
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);

            }
        }
        // scan the entire hashmap table to get the repeated value
        int result = -1;
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println("first repeating character is :" + i);
                result = 1;
                break;
            }
        }
        if (result == -1) {
            System.out.println("there is no char repeating");
        }
    }
}




