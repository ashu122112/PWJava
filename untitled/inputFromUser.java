import java.util.Scanner;

public class inputFromUser {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the age");
        int age=scan.nextInt(); 

        System.out.println("age is "+age);

        System.out.println("Enter avg");
        Double avg=scan.nextDouble();

        System.out.println("Avg is "+avg);

        System.out.println("Enter name");
        String name=scan.next();

        System.out.println("The Name is "+name);

    }
    
}
