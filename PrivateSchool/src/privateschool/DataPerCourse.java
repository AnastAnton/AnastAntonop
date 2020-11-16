package privateschool;

import java.util.ArrayList;

public class DataPerCourse {

    private ArrayList<Student> studentsPerCourse;
    private ArrayList<Assignment> assignmentsPerCourse;
    private ArrayList<Trainer> trainersPerCourse;
    private Course course;

    public DataPerCourse(Course crs, ArrayList<Student> stud, ArrayList<Trainer> tr, ArrayList<Assignment> asg) {
        this.course = crs;
        this.studentsPerCourse = stud;
        this.assignmentsPerCourse = asg;
        this.trainersPerCourse = tr;
    }

    public void printStudentsPerCourse() {
        System.out.println("Students in " + course.toString() + " are: ");
        for(Student std : studentsPerCourse){
           System.out.println(std.toString()); 
        }
        System.out.println("\n");
    }
    public void printAssignmentsPerCourse() {
        System.out.println("Assignments for " + course.toString() + " are:");
        for(Assignment asg : assignmentsPerCourse){
           System.out.println(asg.toString()); 
        }
        System.out.println("\n");
    }
    public void printTrainersPerCourse() {
        System.out.println("Trainers in " + course.toString() + " are : ");
        for(Trainer trn : trainersPerCourse){
           System.out.println(trn.toString()); 
        }
        System.out.println("\n");        
    }     
}
