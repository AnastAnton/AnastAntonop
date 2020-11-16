package privateschool;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Course {

    private String title;
    private String stream;
    private String type;
    private LocalDate start_date;
    private LocalDate end_date;
    private ArrayList<Student> students;
    private ArrayList<Trainer> trainers;
    private ArrayList<Assignment> assignments;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
  
    Course(String ti, String str, String ty, String sd, String ed, 
           ArrayList<Student> stud, ArrayList<Trainer> tr, ArrayList<Assignment> asg){
        this.title = ti;
        this.stream = str;
        this.type = ty;
        this.start_date = LocalDate.parse(sd, formatter);
        this.end_date = LocalDate.parse(ed, formatter);
        this.students = stud;
        this.trainers = tr;
        this.assignments = asg;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" + "title= " + title + ", stream= " + stream + ", type= " 
                + type + ", starting date= " + start_date + ", ending date= " 
                + end_date + '}';
    }
   
}
