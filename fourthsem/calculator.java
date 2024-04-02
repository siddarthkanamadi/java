package fourthsem;

public class calculator {
    addition a = new addition();
    subtraction s= new subtraction();
    multiplication m =new multiplication();
    division d = new division();
    
    public void performadditon(int x,int y){
        a.add(x,y);
    }
    public void perfromsubtrcation(int x,int y){
        s.sub(x,y);

    }
    public void perfrommultiplication(int x,int y){
        m.mul(x,y);
    }
    public void perfromdivison(int x,int y){
        d.div(x,y);
    }


}
 class addition{
    int res;
    public void add(int a,int b){
        res=a+b;
        System.out.println("the addition of two numbers is ="+res);
    }
}
class subtraction{
    int res;
    public void sub(int a,int b){
        res=a-b;
        System.out.println("the subtarction of two numbers is ="+res);

    }
}
class multiplication{
    int res;
    public void mul(int a,int b){
        res=a*b;
        System.out.println("the multiplication od two numbers is ="+res);
    }
}
class division{
    int res;
    public void div(int a,int b){
        res=a/b;
        System.out.println("the division of two number is="+res);
    }
}
 class testcal{
    public static void main(String[] args) {
        calculator c=new calculator();
        c.performadditon(10,20);
        c.perfromsubtrcation(60,70);
        c.perfrommultiplication(2,4);
        c.perfromdivison(2,6);
    }
}
