package fourthsem;

interface area{
    float pi=3.147f;
    public float compute(float x,float y);
}

class rectangle implements area {
    public float compute(float  x,float y){
        float rarea=x+y;
        return rarea;
    }
    
}
class circle implements area {
    public float compute(float  x,float y){
        x=y;
        float carea=pi*x*x;
        return carea;
    }
    
}

public class inter{
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        float r2=r1.compute(2.6f, 3.63f);
        System.out.println("the area is="+r2);

    }
}

