package fourthsem.skilltest;
//this how to implement multipile inhertaiance 
public class bike {
    void tftscreen(){
        System.out.println("every bike has a screen");
    }
}

interface tyer{
    void dot();  
}

class company extends bike implements tyer{
    void bhp(){
        System.out.println("most of the bikes offer a well maintaince ");
    }
    void tourque(){
        System.out.println("old bikes provide more tourque");

    }
}

class bikes{
    public static void main(String[] args) {
        company c=new company();
        c.bhp();
        //c.dot();
        c.tftscreen();
        c.tourque();
    }
}