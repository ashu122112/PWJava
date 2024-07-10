import java.util.*;
class farmer{
    int pa;
    float td;
    static float ri;
    float si;
    static{
        ri=8.5f;
    }
void input(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter Principle Amount");
    pa=scan.nextInt();
    System.out.println("Please enter time duration ");
    td=scan.nextFloat();
}
void compute(){
    si=pa*ri*td/100;
    System.out.println("Simple interest is :"+si);
}
}
public class Launch_farmer {
    public static void main(String[] args) {
        farmer f1= new farmer();
        f1.input();
        f1.compute();
        farmer f2= new farmer();
        f2.input();
        f2.compute();

    }   
}

