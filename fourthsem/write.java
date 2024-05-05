package fourthsem;
import java.io.*;
public class write {
public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("D:\\javacie2.txt"); 
        String s="welcome to vijayapur i am from karnatka";
        fw.write(s);
        fw.close();
    
    }
}

