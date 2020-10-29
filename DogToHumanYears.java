package dogtohumanyears;

import java.util.Scanner; 

public class DogToHumanYears {

    public static void main(String[] args) {
       System.out.println("Please insert dog years to transform them to human years"); 
       Scanner dy = new Scanner(System.in);
       int dogYears = dy.nextInt();
       if ( dogYears <= 0 || dogYears > 30 ){
           System.out.println("Can't be this age.");
       }
       else{   
               if ( dogYears < 3 ){
                   System.out.println("Dog years transformed to human years is :" + dogYears);
               }
               else{
                   System.out.println("Dog years transformed to human years is :" + (2 + (dogYears - 2)*5));
               }    
       }
    }
}