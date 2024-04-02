package fourthsem;

public class animal2 {
    void eat(){
        System.out.println("they can eat:");

    }
}
class dog2 extends animal2{
    void bark(){
        System.out.println("dogs acn only brak");
    }
}
class babbydog extends dog2{
    void paly(){
        System.out.println("they can paly:");
    }
}
class cat extends animal2{
    void mewo(){
        System.out.println("cats can only mewo");
    }
}
class hybridinhertance{
    public static void main(String[] args) {
        cat c=new cat();
        c.mewo();
        c.eat();
        babbydog b=new babbydog();
        b.bark();
        b.paly();
    }
}
