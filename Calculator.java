
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        String yesNo;
        
        do{
            System.out.println("Please write the calculation you prefer to do (+, -, *, /). ");
            System.out.println("First and third inserts are numbers, second insert an operator. After every insert click 'ENTER'.");

            Scanner fn = new Scanner(System.in); 
            Scanner op = new Scanner(System.in); 
            Scanner sn = new Scanner(System.in);
            Scanner yn = new Scanner(System.in);


            int frstNum = fn.nextInt(); 
            String operator = op.next(); 
            int scndNum = sn.nextInt();

            if (operator.equals("+")){
                System.out.println ("The result is : " + (frstNum + scndNum));
            }
            else if (operator.equals("-")){
                System.out.println ("The result is : " + (frstNum - scndNum));
            }
            else if (operator.equals("*")){
                System.out.println ("The result is : " + (frstNum * scndNum));
            }
            else {
                if (operator.equals("/")){
                    if (scndNum == 0){
                        System.out.println ("Can't divide with number 0. ");
                    }    
                    else{
                        System.out.println ("The result is : " + (frstNum / scndNum));
                }}
                else {
                    System.out.println ("Wrong calculation"); 
                }
            } 
            System.out.println("If you want to make a new calculation write 'yes', otherwise write something else.");
            yesNo = yn.next();
        }
        while(yesNo.equals("yes"));
        System.out.println("Thank you! Bye :)");
    }
}    
