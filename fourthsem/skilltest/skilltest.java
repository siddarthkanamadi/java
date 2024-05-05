package fourthsem.skilltest;
import java.io.*;
public class skilltest {
    public static void main(String[] args) throws Exception{
        FileWriter fw =new FileWriter("D:\\1.txt");
        String text="this is FileWriter method";
        fw.write(text);
        fw.close();
    }
    
}
