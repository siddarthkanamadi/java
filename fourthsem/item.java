package fourthsem;

interface item {
    int no=10;
    String itemname="computer";
    void display();

    
}
class items implements item{
    void show(){
        System.out.println("no="+no);
        System.out.println("itemname="+itemname);
    }

}
class interfacedemo{
    public static void main(String[] args) {
        items i=new items();
        i.show();
    }
}

