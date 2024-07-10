public class More_on_Mutable_String {
    public static void main(String[] args) {
        
    // StringBuffer as=new StringBuffer();
    // System.out.println(as.capacity());//how many letters can be stored
    // StringBuffer sh = new StringBuffer("Shivam");
    // System.out.println(sh.capacity());//capacity + stored letters
    // sh.append("  asdfghjklzxcvbnmdmqwerty");
    // System.out.println(sh);
    // System.out.println(sh.capacity());
    // System.out.println(sh.length());//rrno. of stored letters
    // System.out.println(sh.charAt(1));
    // sh.setCharAt(2, 'I');;
    // System.out.println(sh);

    StringBuilder str=new StringBuilder(150);
    System.out.println(str.capacity());
    str.append("Ashu");
    System.out.println(str);
    str.trimToSize();
    System.out.println(str.capacity());
    str.reverse();
    System.out.println(str);
    }
    
}
