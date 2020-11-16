package privateschool;

import java.util.ArrayList;

public class StudentsInManyCourses {
    ArrayList<Student> finalStudents = new ArrayList<Student>();

    public void studentsManyCourses(SumOfLists sumOfList){
        int checker = 0;
        int checker2 = 0;
        for(Student stud : sumOfList.listStudents){
            for(Course crs : sumOfList.listCourses){
               for (Student st : crs.getStudents()){
                   if(st.equals(stud)){
                        checker++;
                    }
                } 
            }
            if(checker > 1 ){
                if(finalStudents.isEmpty()){
                        finalStudents.add(stud);                        
                }else{
                    for (Student studen : finalStudents){
                        if(stud.equals(studen)){
                            checker2++;
                        }
                    }
                    if(checker2 == 0){
                       finalStudents.add(stud); 
                    }
                }    
            }
            checker = 0;
        }
        if(finalStudents.isEmpty()){
            System.out.println("No students has participated to more than one course.");
        }else{
            for(Student st : finalStudents){
                System.out.println(st.toString()+ " has participated to more than one courses.");
            }    
        }
    } 
    
}
