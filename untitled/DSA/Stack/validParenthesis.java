import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String str){
        char []chars=str.toCharArray();

        Stack<Character> stack1=new Stack<>();
        for(char ele:chars){
            //if element contain (,{,] then push them in stack 
            // if (ele=='(' || ele=='{' || ele='['){
            //     stack1.push(ele);
            //     continue;
            // }
            if(ele == '(' || ele == '{' || ele == '['){
                stack1.push(ele);
                continue;
            }
            else if(stack1.empty()){
                return false;
            }
            char top=stack1.pop();
            if (top=='(' && ele!=')'){
                return false;
            }
            else if(top == '[' && ele != ']'){
                return false;
            }
            else if(top == '{' && ele != '}'){
                return false;
            }
        }
        // is the stack is empty or not
        return(stack1.empty() == true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println("Is the string valid? :" + isValid(str));
    }
}
