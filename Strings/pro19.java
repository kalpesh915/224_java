
class Student {

    int roll;
    String fname, lname;

    public Student(int roll, String fname, String lname) {
        this.roll = roll;
        this.fname = fname;
        this.lname = lname;
    }

    public String toString(){
        return roll+" "+fname+" "+lname;
    }
}

public class pro19 {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Ritish", "Solanki");
        System.out.println(s1.toString());
    }
}
