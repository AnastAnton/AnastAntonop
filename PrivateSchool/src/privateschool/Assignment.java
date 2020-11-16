package privateschool;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment {

    private String title;
    private String description;
    private LocalDate subDateTime;
    private int oralMark;
    private int totalMark;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    
    Assignment(String ti, String de, String sd, int om, int tm){
        this.title = ti;
        this.description = de;
        this.subDateTime = LocalDate.parse(sd, formatter);
        this.oralMark = om;
        this.totalMark = tm;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title= " + title + ", description= " + description 
                + ", submission date time= " + subDateTime + ", oral mark= " + oralMark 
                + ", total mark= " + totalMark + '}';
    }
    
}
