package fourthsem;

public class rectangle {
    double height=3.66;
    double breadth=5.66;
    void dispaly1(){
        System.out.println("the height is :"+height);
        System.out.println("the beradth is :"+breadth);

    }

}
class area extends rectangle{
    double area=0.5*breadth*height;
    void dispaly(){
        System.out.println("the area is :"+area);
    }
}
class recatngledemo{
    public static void main(String[] args) {
        area a=new area();
        a.dispaly1();
        a.dispaly();

    }
}