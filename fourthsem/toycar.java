package fourthsem;

public class toycar implements toy,movable {
    double cprice;
    String ccolor;
    public void price(double p){
        cprice=p;
    }
    public void color(String c){
        ccolor=c;
    }
    public void dispaly(){
        System.out.println("toy car details"+cprice+ccolor);
    }
}   
