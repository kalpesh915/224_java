class Student{
    int roll;
    String fname, lname;

    public Student(int roll, String fname, String lname) {
        this.roll = roll;
        this.fname = fname;
        this.lname = lname;
    }
    
    public Student(Student tmp){
        this.roll = tmp.roll;
        this.fname = tmp.fname;
        this.lname = tmp.lname;
    }
    
    public void printer(){
        System.out.println("Welcome "+fname+" "+lname+" your Roll No. is "+roll);
    }
    
}

public class Pro10 {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Ritsh", "Solanki");
        s1.printer();
        
        Student s2 = new Student(s1);
        s2.printer();
    }
}
