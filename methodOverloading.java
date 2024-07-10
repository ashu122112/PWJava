class Addition{
    int add (int a, int b){
    return a+b ;
    }
    float add (int a, float b){
    return a+b ;
    }
    double add (int a, double b){
    return a+b ;
    }
    int add (int a, int b , int c){
    return a+b+c ;
    }
    double add (double a, double b, double c){
    return a+b+c ;
    }
    }
public class methodOverloading {
    public static void main(String[] args) {
        Addition res= new Addition();
        b1=res.add(10, 50);
        b2=res.add(45, 8.3);
        b3=res.add(45, 5.2 , 78.9);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
