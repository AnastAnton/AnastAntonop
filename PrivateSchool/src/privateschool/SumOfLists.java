package privateschool;

import java.util.ArrayList;
import java.util.List;

public class SumOfLists {
    static ArrayList<Student> listStudents = new ArrayList<Student> ();
    ArrayList<Trainer> listTrainers = new ArrayList<Trainer> ();
    ArrayList<Course> listCourses = new ArrayList<Course>() ;
    ArrayList<Assignment> listAssignments = new ArrayList<Assignment>();
    int NumOfStud, j, NumOfTrain, k, NumOfCourse, m, NumOfAssig, n;
        
    public void sumStudent(ArrayList<Student> stud){
        for (Student std : stud){
            listStudents.add(j, std); 
            j = NumOfStud + 1;
        }
        NumOfStud += stud.size();
    } 

    public void sumTrainers(ArrayList<Trainer> trn){
        for (Trainer tr : trn){
            listTrainers.add(k, tr); 
            k = NumOfTrain + 1;
        }
        NumOfTrain += trn.size();
    } 

    public void sumUserCourses(ArrayList<Course> crs){ 
        this.listCourses = crs;
    }
    
     public void sumCourses(ArrayList<Course> crs){ 
        for (Course cr : crs){
            listCourses.add(m, cr);
            m++;
        }
     }
    public void sumAssignments(ArrayList<Assignment> ass){ 
        for (Assignment asg : ass){
            listAssignments.add(n, asg); 
            n = NumOfAssig + 1;
        }
        NumOfAssig += ass.size();
    } 
    
    public void PrintAllStudents(){
        System.out.println("The list of all students is:");
        for (Student std : listStudents){
            System.out.println(std.toString());
        }
        System.out.println("\n");
    }
    
    public void PrintAllTrainers(){
        System.out.println("The list of all trainers is:");
        for (Trainer trn : listTrainers){
            System.out.println(trn.toString());
        }
        System.out.println("\n");
    }
    
    public void PrintAllCourses(){
        System.out.println("The list of all courses is:");
        for (Course cr : listCourses){
            System.out.println(cr.toString());
        }
        System.out.println("\n");    
    }
    
    public void PrintAllAssignments(){
        System.out.println("The list of all assignments is:");
        for (Assignment asg : listAssignments){
            System.out.println(asg.toString());
        }
        System.out.println("\n");
    }
}
