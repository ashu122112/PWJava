

// class demo_Constructor{
//     private int a;
//     private int b;
//     private String st;

//     demo_Constructor(){
//             System.out.println("Zero parameterised constructor");
//     }

//     public demo_Constructor(int a ,int b){  // if this not given then error will arise 
//         this.a=a;                           // as parameterised constr. is used further .
//         this.b=b;
//     }

//     void disp(){
//         System.out.println(a);
//         System.out.println(b);
//     }

//    public static void main(String[] args) {
//     demo_Constructor d1=new demo_Constructor(10,20);
//     d1.disp();
//     demo_Constructor d2=new demo_Constructor();
//     d2.disp();
//    }  
// }

// ___________________________________________________________________

//        ...Contructor Overloading...

class demo_Constructor{
    private String name;
    private int age ;

    public demo_Constructor(){
        //super();   // this is default , already executed itself
        System.out.println("Default constructor is called");
        name="Rohan";
        age=19;    
    }
    public demo_Constructor(String name){
        
        this.name=name;
        age=19;
    }
    public demo_Constructor(String name , int age){
        this();
        this.name=name;
        this.age=age;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        demo_Constructor d1=new demo_Constructor();
        d1.disp();
        demo_Constructor d2=new demo_Constructor("Shiva" , 19);
        d2.disp();
        demo_Constructor d3=new demo_Constructor("Aman");
        d3.disp();
    }
}