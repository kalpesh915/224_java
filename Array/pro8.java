
public class pro8 {

    public static void main(String[] args) {
        int ip1[][] = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        
        for(int tmp[] : ip1){
            for(int x : tmp){
                System.out.print(" "+x);
            }
            System.out.println("");
        }
    }
}
