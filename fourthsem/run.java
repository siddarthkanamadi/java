package fourthsem;
import java.io.*;
public class run {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("D:\\javacie2.txt");
        int i;
        while((i=fr.read())!=-1) {
        	System.out.print((char)i);
        	
        }
        
        
        

    }
}
  
