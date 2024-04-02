package fourthsem;

public class animal1 {
    void eat(){
        System.out.println("they can eat:");
    }
}
class dog extends animal1{
    void bark(){
        System.out.println("only dogs can brak:");
    }
}
class cat extends animal1{
    void mewo(){
        System.out.println("only cats can mewo:");

    }

}
class herrircalinhertance{
    public static void main(String[] args) {
        cat c=new cat();
        c.mewo();
        c.eat();
        
    }
}