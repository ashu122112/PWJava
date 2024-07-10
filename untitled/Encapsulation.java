class Students {
    private int age;
    private String name;

    // public void setData(){
    //     age= 19;
    //     name="Shiva";
    // }

    // public void setData1(int a){
    //         age=a;
    // }

    // public void setAge(int age){
    //         this.age=age;    // this makes clear which is instance varaible
    // }
    //  public void setName(String name){
    //         this.name=name;

    Students(String name , int age ){          //  __
        this.name=name;                        //    |_  CONSTRUCTOR  
        this.age=age;                          //  __|
    }
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

   
public void show(){
    System.out.println(name+" "+age);
}
}
public class Encapsulation {
    public static void main(String[] args) {
        Students obj1=new Students(name="Rahul" , age=12);
        
        // Students obj2=new Students();
        // // obj.setData();
        // // obj.setData1(19);
        // obj1.setAge(19);
        // obj2.setAge(22);
        // obj1.setName("Rohan");
        // obj2.setName("Rajat");
        int stud1Age = obj1.getAge();
        String stud1Name=obj1.getName();
        System.out.println(stud1Age);
        System.out.println(stud1Name);
        obj1.show();
        // obj2.show();
    }
}