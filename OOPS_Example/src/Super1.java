class ParentClass{

    public ParentClass() {
        System.out.println("Parent Class Constructor Called");
    }
    
    public void msg(){
        System.out.println("Parent Class Msg Called");
    }
    
}

class ChildClass extends ParentClass{

    public ChildClass() {
        super(); // parent class constrtutor
        System.out.println("Child Class Constructor Called");
    }
    
    public void msg(){
        System.out.println("Child Class Msg Called");
        super.msg();
    }
}

public class Super1 {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.msg();
    }
}
