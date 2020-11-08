package exercise2;

import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        int number;
        int j = 0;
        String type;
        ArrayList<Pet> petsList = new ArrayList<Pet>();
        System.out.println("Hi, please tell me the number of your family's "
                + "members. You must be at least 3.");
        Scanner nb = new Scanner(System.in);
        number = nb.nextInt();
        if (number >= 3) {

            for (int i = 1; i <= number; i++) {
                
                System.out.println("Type the name of a member of your family. ");
                Scanner nm = new Scanner(System.in);
                String name = nm.next();
                System.out.println("Now type the age of him/her. ");
                Scanner ag = new Scanner(System.in);
                int age = ag.nextInt();
                System.out.println("Does he/she has a pet? If not write: no, "
                        + "otherwise type something.");
                Scanner yn = new Scanner(System.in);
                String yesNo = yn.next();

                if (yesNo.equals("no")) {
                    
                    Person person = new Person(name, age);
                    System.out.println("Pets are best human's friends.");
                    
                } else {
                    
                    System.out.println("If he/she has pets please tell me what "
                            + "kind of pets does he/she has. ");
                    System.out.println("Please choose some of this pets: dog, cat, "
                            + "fish, turtle, elephant, iguana, giraffe, lion,"
                            + " hamster");
                    System.out.println("First write the type, then it's nickname. ");
                    String check;
                    
                    do {
                        
                        Scanner tp = new Scanner(System.in);
                        type = tp.next();
                        CheckAnimals ca = new CheckAnimals();
                        
                        if (ca.Check(type).equals("1")) {
                            
                            break;
                        }
                        Scanner nn = new Scanner(System.in);
                        String nickname = nn.next();
                        Pet pet = new Pet(nickname, type);
                        petsList.add(j, pet);
                        System.out.println("Does he/she has another pet? Type yes/no."
                                + "Then write again type and nickname.");
                        Scanner ch = new Scanner(System.in);
                        check = ch.next();
                        j++;
                        
                    } while (check.equals("yes"));
                    
                    CheckAnimals ca2 = new CheckAnimals();
                    
                    if (ca2.Check(type).equals("1")) {
                        
                        System.out.println("This is not a valid pet type.");
                        
                    } else {
                        
                        Person person = new Person(name, age, petsList);
                        person.printPerson();
                    }
                }
            }
            System.out.println("Thank you :) ");
            
        } else {
            
            System.out.println("Wrong member number. Try again.");
        }
    }
}
