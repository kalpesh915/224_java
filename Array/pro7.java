
import java.util.Random;
import java.util.Scanner;

class GenerateArray{
    public int[] getArray(){
        int ip1[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        return ip1;
    }
    
    public int[] getArray1(){
        int ip1[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<ip1.length; i++){
            System.out.println("Enter value for ip1["+i+"]");
            ip1[i] = sc.nextInt();
        }
        return ip1;
    }
    
    public int[] getArray2(){
        int ip1[] = new int[10];
        
        Random rd = new Random();
        for(int i = 0; i<ip1.length; i++){
            ip1[i] = rd.nextInt(100);
        }
        return ip1;
    }
    
    public int[] getArray3(){
        return new int[]{11, 22, 33, 44, 55};
    }
    
    
}

public class pro7 {
    public static void main(String[] args) {
        GenerateArray ga = new GenerateArray();
        //int ans[] = ga.getArray();
        //int ans[] = ga.getArray1();
        //int ans[] = ga.getArray2();
        int ans[] = ga.getArray3();
        
        for(int tmp : ans){
            System.out.print(" "+tmp);
        }
    }
}
