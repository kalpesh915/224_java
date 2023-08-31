
import java.io.*;

public class pro6 {
    public static void main(String[] args) {
        try{
            Writer fw = new FileWriter("data11.txt");
            fw.write("Welcome to world of Java Io");
            fw.close();
        }catch(Exception err){
            System.out.println("Error is "+err);
        }
        
}
}
