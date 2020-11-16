package privateschool;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int tuitionFees;
    ArrayList<Assignment> assignments;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public Student(String fn, String ln, String dob, int tf, ArrayList<Assignment> asg) {
        this.firstName = fn;
        this.lastName = ln;
        this.dateOfBirth = LocalDate.parse(dob, formatter);
        this.tuitionFees = tf;
        this.assignments = asg;
    }

    @Override
    public String toString() {
        return "Student{" + firstName + " " + lastName + ", date of Birth= "
                 + dateOfBirth + ", tuition fees= " + tuitionFees + '}';
    }
    
    public void assignmentsPerStudent(){
        System.out.println(this.toString() + " has the following assignments:");
        for(Assignment as : assignments){
            System.out.println(as.toString());
        
        }
        System.out.println("\n");
    }
}