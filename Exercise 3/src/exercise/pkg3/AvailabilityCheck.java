package exercise.pkg3;

import java.time.LocalDate;

public class AvailabilityCheck {

    LocalDate startingDate;
    LocalDate endingDate;
    LocalDate checkDate;
    
    public Boolean AvailCheck(String sd, String ed, String cd){
    
        startingDate = LocalDate.parse(sd);
        endingDate = LocalDate.parse(ed);
        checkDate = LocalDate.parse(cd);
        
        if(startingDate.isBefore(checkDate) && endingDate.isAfter(checkDate)){
        
            return true;
        }else{
          
            return false;
        }
    }
}
