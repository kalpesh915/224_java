package myMaths;

public class Calculation2 {
    public void max(int i, int j){
        if(i > j){
            System.out.println("Max is "+i);
        }else{
            System.out.println("Max is "+j);
        }
    }
    
    public void min(int i, int j){
        if(i < j){
            System.out.println("Min is "+i);
        }else{
            System.out.println("Min is "+j);
        }
    }
    
    public void square(int i){
        System.out.println("Square is "+(i*i));
    }
    
    public void cube(int i){
        System.out.println("Cube is "+(i*i*i));
    }
}
