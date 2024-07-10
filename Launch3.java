

class Demo{
    static void disp1(){
        System.out.println("Static method");
    }
    void disp2(){
        System.out.println("Non stativ method");
    }
}

public class Launch3 {
    public static void main(String[] args) {
        Demo.disp1();    // no meed to create object for static methods
        //Demo.disp2(); is invalid as it is non static method
        Demo d=new Demo();
        d.disp1(); // static method can be called with object & without object both.
        d.disp2();          
    }
    
}
