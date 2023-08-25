import java.util.Scanner;

class ValidAgeException extends Exception{
    public ValidAgeException(String msg) {
        super(msg);
    }
}

public class pro17 {
    public static void main(String[] args) throws ValidAgeException{
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        
        if(age < 18){
            throw new ValidAgeException("Not a Valid Age");
        }else{
            System.out.println("Welcome to voiting ");
        }
        
    }
}
