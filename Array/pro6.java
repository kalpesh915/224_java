class ArrayCalculation{
    public void findMaximum(int ip1[]){
        int tmp = 0;
        for(int x : ip1){
            if(tmp < x){
                tmp = x;
            }
        }
        System.out.println("Maximum is "+tmp);
    }
}

public class pro6 {
    public static void main(String[] args) {
        int ip1[] = {11, 33, 47, 23, 78, 556, 89, 989, 445, 345};
        ArrayCalculation ac = new ArrayCalculation();
        ac.findMaximum(ip1);
    }
}
