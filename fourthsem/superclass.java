package fourthsem;

public class superclass {
    int x;
    superclass(int x){
        this.x=x;

    }
    void display1(){
        System.out.println("x="+x);
    }

}
class subclass extends superclass{
    int y;
    subclass(int x,int y){
        super(x);
        this.y=y;
    }
    void display(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
        
}
class superdemo{
    public static void main(String[] args) {
        subclass s=new subclass(30, 50);
        s.display();
        s.display1();
    }
}
