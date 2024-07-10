public class L2_operaators {
    public static void main(String[] args) {
        int a = 15;
        // a+=5;
        // a-=5;
        // a*=5;
        // a/=5;
        // System.out.println(a);
        int b = 20;
        int c = 25;

        boolean result =a==b;
        System.out.println(result);
        // System.out.println(a<b);
        // System.out.println(a>=b);
        // System.out.println(a!=b);

        System.out.println(a == b && a > b && a > c);
        System.out.println(a == b || a >= b || c > a);
        System.out.println(a != b);

        // ......IF ELSE conditional statement......

        int age = 68;
        if (age >= 18 && age <= 60) {

            if (age > 20 && age < 30) {
                System.out.println("you are in your 20's");
            } else {
                System.out.println("not in 20's");
            }
        } else if (age > 60) {
            System.out.println("You are old person");
        }

        else

        {
            System.out.println("You are a Kid");
        }

        // .... Ternary operator ....

        // int res = (a < b) ? a : b;
        // System.out.println(res);
        int res = (a<b)? (a<c)?a:c : (a>c)?a:c ;
        System.out.println(res);


        // .....Switch Case.....
    }
}
