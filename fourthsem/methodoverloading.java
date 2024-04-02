package fourthsem;
public class methodoverloading {
    int a=10;
    void display(){
        System.out.println("a="+a);
    }
    void display(float a,float b){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    void display(float s){
        System.out.println("s="+s);

    }

}
class methodoverloadingdemo{
    public static void main(String[] args) {
        methodoverloading m=new methodoverloading();
        m.display();
        m.display(5.0f);
        m.display(5.6f,2.3f);
        
    }
}