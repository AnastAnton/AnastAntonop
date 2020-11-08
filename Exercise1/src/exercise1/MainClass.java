package exercise1;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        int check = 0;
        
        do {
            check = 0;
            System.out.println("Please insert a number between 1 and 10.");
            Scanner num = new Scanner(System.in);
            String number = num.next();
            int length = number.length();
//        int i;
            int j;
            int numCheck = 0;

            for (j = 0; j < length; j++) {
                
//            for (i = 1; i <= 9; i++) {
// Couldn't find the way, below, to compare a char with an int so I web searched 
// and found the Character.isDigit() way.
//                if (number.charAt(j) == i) {
//                    numCheck++;
//                }
//            }
                if (Character.isDigit(number.charAt(j))) {
                    numCheck++;
                }
            }
            if (numCheck == length) {
                if ((length == 1 || number.equals("10")) && !"0".equals(number)) {
                    System.out.println("Your number is: " + number);
                } else {
                    System.out.println("Wrong number. Your number input must be"
                            + " between 1-10.");
                    System.out.print("Try again. ");
                    check = 1;
                }

            } else {
                System.out.println("This is not a valid number. Please insert "
                        + "a correct number.");
                System.out.print("Try again. ");
                check = 1;
            }
        } while (check == 1);
    }
}
