package exercise2;

import java.util.ArrayList;

public class Person {

    public String name;
    public int age;
    public ArrayList<Pet> pets = new ArrayList<Pet>(); 

//    constructor for member with no pet.
    Person (String nm, int ag){
    name = nm;
    age = ag;
        System.out.println(name + " is " + age + " years old and doesn't have "
                + "pets.");
    }
    
//    constructor with pets.
    Person (String nm, int ag, ArrayList<Pet> pt){
        name = nm;
        age = ag;
        pets = pt;
    }        
    
    public void printPerson(){    
        System.out.print(name + " is " + age + " years old and has " );
        
        for (int i=0; i<=pets.size()-1; i++){
            
            String nn = null;
            String ty = null;
            Pet pet = new Pet( nn, ty);
            pets.get(i);
            pet = pets.get(i);
            System.out.println("a " + pet.type + " called " + pet.nickname);
        }
    }
    
    
}
