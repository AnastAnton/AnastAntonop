package exercise.pkg3;

import java.time.LocalDate;
        
public class Bootcamp {

    String name;
    LocalDate startingDate;
    LocalDate endingDate;
    
    Bootcamp(String nm, String sd, String ed){
    
        name = nm;
        startingDate = LocalDate.parse(sd);
        endingDate = LocalDate.parse(ed);
    }
}
