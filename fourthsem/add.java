package fourthsem;

abstract class add {
    int a=50,b=60;
    public void sum(){

    }
}
class addop extends add{
    int c;
    public void sum(){
        c=a+b;
        System.out.println("additon ="+c);
    }
}
class abstractdemo{
    public static void main(String[] args) {
        addop a=new addop();
        a.sum();
    }
}