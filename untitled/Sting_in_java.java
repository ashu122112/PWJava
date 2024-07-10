import javax.sound.midi.Soundbank;

public class Sting_in_java {
    public static void main(String[] args) {
        String brand="PWSkills";
        brand.concat(" benguluru"); // will not add as brand is immutable 
        System.out.println(brand);
        StringBuilder brand1=new StringBuilder("PWskills");
        brand1.append(" benguluru"); // will added as brand1 is mutable
        System.out.println(brand1);

        String s1= "PW";                     // difference in memory
        String s2=new String("PW"); //     allocation..
        System.out.println(s1); 
        System.out.println(s2);

        String s3="PW";
        String s4=new String("pw");
        System.out.println(s1==s3);   // true for same memory address
        System.out.println(s2==s4);   // false for diff memo add. 

        System.out.println(s1.equals(s3)); //Compares value not reference
        System.out.println(s1.equals(s4)); // if we use .equalsIgnoreCase(s4);
        
        // _________________________________________________________________________

        // ............CONCATENATION................

        // String p1=new String("PW");
        // p1=p1.concat(" Skills");
        // System.out.println(p1);
        // String p1="pwjava";
        // String p2=p1.concat(" Skills");
        // String p3=new String("Pw java");
        // p3=p3.concat("Skills");
        String p1="PW";
        String p2=" PW"+" Java";
        String p3="PW"+" java"+" Str";
        String p4=p1+p2;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        String str= "PW"+100+33;
        System.out.println(str);

        //_______________________________

        // Some important methods in string
        String sh="PW java Skills";
        System.out.println(sh);
        System.out.println(sh.toUpperCase());
        System.out.println(sh.toLowerCase());
        System.out.println(sh.length());
        System.out.println(sh.charAt(1));
        System.out.println(sh.substring(3, 7));
        System.out.println(sh.indexOf("S"));
        System.out.println(sh.indexOf("a"));
        System.out.println(sh.lastIndexOf("a"));
        
    }    
}