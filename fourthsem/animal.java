package fourthsem;
public class animal {
    void eat(){
        System.out.println("animals can eat:");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog can bark");
    }
}
class pet extends dog{
    void paly(){
        System.out.println("pets can paly:");
    }
}
class multileveinhertance{
    public static void main(String[] args) {
        pet p=new pet();
        p.eat();
        p.paly();
        p.sound();

        
    }
}