package exercise.pkg3;

import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        
        System.out.println("Hi. Please write about 3 bootcamps.");
        ArrayList<Bootcamp> bootcampList = new ArrayList<Bootcamp>();
        
        for (int i = 0; i <= 2; i++) {
            
            System.out.println("Set Bootcamp's name.");
            Scanner nm = new Scanner(System.in);
            String name = nm.next();
            System.out.println("Now write the starting date as yyyy-mm-dd"
                    + " with numbers.");
            Scanner sd = new Scanner(System.in);
            String startDate = sd.next();
            System.out.println("And now the ending date as yyyy-mm-dd"
                    + " with numbers.");
            Scanner ed = new Scanner(System.in);
            String endDate = ed.next();
            Bootcamp bootcamp = new Bootcamp(name, startDate, endDate);
            bootcampList.add(i, bootcamp);
            System.out.println("Now please write a date to check if a bootcamp "
                    + "is available");
            Scanner av = new Scanner(System.in);
            String available = av.next();
            AvailabilityCheck avCheck = new AvailabilityCheck();
            
            if(avCheck.AvailCheck(startDate, endDate, available)){
                
                System.out.println("Bootcamp " + bootcamp.name + " will be"
                                     + " available in " + avCheck.checkDate 
                                    + ". It starts " + avCheck.startingDate 
                                    + " and ends " + avCheck.endingDate + ".");
            }else{
            
                System.out.println("Sorry " + bootcamp.name + " isn't available"
                        + " in " + avCheck.checkDate + ".");
            }
        }
    }
}
