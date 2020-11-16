package privateschool;

import java.lang.Math; 
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CalendarWeek {
    private LocalDate date;
    private ArrayList<Student> students;
    static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    CalendarWeek(String date, ArrayList<Student> students){
        this.date = LocalDate.parse(date, format);
        this.students = students;
    }

    public void calendarWeek (){

        DayOfWeek day = date.getDayOfWeek();
        int k = 0;
        int i = day.getValue();
        for(Student stud : students){
            for(Assignment asg : stud.assignments){               
                Period period = Period.between(date, asg.getSubDateTime());
                if(period.getYears() == 0 && period.getMonths() == 0){
                    if(date.isAfter(asg.getSubDateTime())){
                        if( Math.abs(period.getDays()) <= (7-i)){
                            System.out.println(stud + " needs to submit " + stud.assignments);
                            k = 1;
                        }
                    }else{
                        if(period.getDays() < i ){
                            System.out.println(stud + " needs to submit " + stud.assignments);
                            k = 1;
                        }
                    }
                }    
            }
        }
        if(k == 0){
            System.out.println("No students need to submit an assignment on this date");
        }
    }
}
