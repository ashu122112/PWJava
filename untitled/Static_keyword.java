public class Static_keyword {

    static int age;// first 
    
    static { // second
       
        System.out.println("Static method first");
         age=20;
        System.out.println(age);
    } 
    static void disp(){
        System.out.println("main method ke baad me jab hum call karenge ");
    }

    public static void main(String[] args) { // third
        
        System.out.println("main method baadme");
        disp();
    }
    
}
