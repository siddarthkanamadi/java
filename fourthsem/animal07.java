package fourthsem;
public class animal07 {
    void eat(){
        System.out.println("eating");
    }
}
interface wildanimal{
    void livingplace();
}

class elephant extends animal07 implements wildanimal{
    void livingplace(){
        System.out.println("it lives in forest");
    }
    void feauters(){
        System.out.println("it is a vegitarian");
    }
}
class elephantdemo{
    public static void main(String[] args) {
        elephant e=new elephant();
        e.eat();
        //e.livingplace();
        e.feauters();
    }
}
