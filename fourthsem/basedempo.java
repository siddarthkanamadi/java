package fourthsem;

abstract class abstractdemono1{
    void base(){
        System.out.println("this is base class");
    }
}
class sub extends abstractdemono1{
    void subclass(){
        System.out.println("this is subclass");
    }
}
public class basedempo{
    public static void main(String[] args) {
        sub s=new sub();
        s.subclass();
        s.base();
        
    
    }
}