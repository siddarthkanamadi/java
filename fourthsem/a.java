package fourthsem;

public class a {
    int a=10;
    void dispaly(){
        System.out.println("a="+a);
    }
    
}
 class b extends a{
    int c=20;
    int d=60;
    int sum=c+d;
    void dispaly1(){
    System.out.println("sum is ="+sum);
    }
}

class inhertancedemo{
    public static void main(String[] args) {
        b b=new b();
        b.dispaly1();
        b.dispaly();
    }
}