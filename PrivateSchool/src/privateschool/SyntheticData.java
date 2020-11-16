package privateschool;

import java.util.ArrayList;

public class SyntheticData {

    static ArrayList<Course> courses1 = new ArrayList<Course>();
    static ArrayList<Trainer> trainers1 = new ArrayList<Trainer>();
    static ArrayList<Trainer> trainers2 = new ArrayList<Trainer>();
    static ArrayList<Trainer> trainers3 = new ArrayList<Trainer>();
    static ArrayList<Trainer> trainers4 = new ArrayList<Trainer>();
    static ArrayList<Trainer> trainers5 = new ArrayList<Trainer>();
    static ArrayList<Trainer> trainers6 = new ArrayList<Trainer>();
    static ArrayList<Student> students1 = new ArrayList<Student>();
    static ArrayList<Student> students2 = new ArrayList<Student>();
    static ArrayList<Student> students3 = new ArrayList<Student>();
    static ArrayList<Student> students4 = new ArrayList<Student>();
    static ArrayList<Student> students5 = new ArrayList<Student>();
    static ArrayList<Student> students6 = new ArrayList<Student>();
    static ArrayList<Assignment> assignments1 = new ArrayList<Assignment>();
    static ArrayList<Assignment> assignments2 = new ArrayList<Assignment>();
    static ArrayList<Assignment> assignments3 = new ArrayList<Assignment>();
    static ArrayList<Assignment> assignments4 = new ArrayList<Assignment>();
    static ArrayList<Assignment> assignments5 = new ArrayList<Assignment>();
    static ArrayList<Assignment> assignments6 = new ArrayList<Assignment>();

    public void courseData(){
        
        Course course1 = new Course("CB12", "Java", "Full time",
                                    "20-10-2020", "20-01-2021", students1, trainers1, assignments1);
        Course course2 = new Course("CB12", "C#", "Part time",
                                    "20-10-2020", "20-04-2021", students2, trainers2, assignments2);
        Course course3 = new Course("CB11", "C#", "Full time",
                                    "15-06-2020", "15-09-2020", students3, trainers3, assignments3);
        Course course4 = new Course("CB11", "Python", "Part time",
                                    "15-06-2020", "15-02-2021", students4, trainers4, assignments4);
        Course course5 = new Course("CB10", "JavaScript", "Full time",
                                    "18-02-2020", "18-05-2020", students5, trainers5, assignments5);
        Course course6 = new Course("CB10", "Java", "Part time",
                                    "18-02-2020", "18-08-2020", students6, trainers6, assignments6);
        
        courses1.add(course1);
        courses1.add(course2);
        courses1.add(course3);
        courses1.add(course4);
        courses1.add(course5);
        courses1.add(course6);
        
    }

    public void trainerData(){
    
        Trainer trainer1 = new Trainer("Vladimiros ", "Fotiadis", "Java");
        Trainer trainer2 = new Trainer("Pavlos ", "Haikalis", " Java");
        Trainer trainer3 = new Trainer("George ", "Pasparakis", "C#");
        Trainer trainer4 = new Trainer("Sakis ", "Mpoulas", "C#");
        Trainer trainer5 = new Trainer("Nerina ", "Pyrovolikou", "Python");
        Trainer trainer6 = new Trainer("Matina ", "Mantarinaki", "Python");
        Trainer trainer7 = new Trainer("Sotirios ", "Papadogiannis", "JavaScript");
        Trainer trainer8 = new Trainer("Petros ", "Filippidis", "JavaScript");
    
        trainers1.add(trainer1);
        trainers1.add(trainer2);
        trainers2.add(trainer3);
        trainers2.add(trainer4);
        trainers3.add(trainer3);
        trainers3.add(trainer4);
        trainers4.add(trainer5);
        trainers4.add(trainer6);
        trainers5.add(trainer7);
        trainers5.add(trainer8);
        trainers6.add(trainer1);
        trainers6.add(trainer2);
        
    }
    
    public void studentData(){
    
        Student student1 = new Student("Anastasios", " Antonopoulos", 
                                       "30-12-1994", 2500, assignments1);
        Student student2 = new Student("Maria", " Fostiropoulou", 
                                       "15-06-1993", 2500, assignments1);
        Student student3 = new Student("Alexandros", " Ageridis", 
                                       "07-08-1992", 2500, assignments1);
        Student student4 = new Student("Konstantinos", " Kousounis", 
                                       "02-04-1995", 2500, assignments2);
        Student student5 = new Student("Vasilios", " Liapis", 
                                       "14-11-1990", 2500, assignments2);
        Student student6 = new Student("Nicole", " Tsarouha", 
                                       "15-12-1985", 2500, assignments2);
        Student student7 = new Student("Andreas", " Lianos", 
                                       "20-05-1990", 2500, assignments3);
        Student student8 = new Student("Ilya", " Kraev", 
                                       "11-10-1988", 2500, assignments3);
        Student student9 = new Student("Anastasia-Antigoni", " Minaidou", 
                                       "15-01-1987", 2500, assignments3);
        Student student10 = new Student("Lefteris", " Papadogiannis", 
                                        "04-11-1990", 2500, assignments4);
        Student student11 = new Student("Michalis", " Karvelas", 
                                        "03-03-1990", 2500, assignments4);
        Student student12 = new Student("Andreas", " Sketzos", 
                                        "22-04-1994", 2500, assignments4);
        Student student13 = new Student("Alexandros", " Lambrakis", 
                                        "17-06-1989", 2500, assignments5);
        Student student14 = new Student("Konstantinos", " Vakouftsis", 
                                        "27-04-1984", 2500, assignments5);
        Student student15 = new Student("Dimitris", " Kasimatis", 
                                        "30-02-1992", 2500, assignments5);
        Student student16 = new Student("Dimitris", " Triantafullou", 
                                        "11-05-1994", 2500, assignments6);
        Student student17 = new Student("George", " Kokolakis", 
                                        "14-11-1990", 2500, assignments6);
        Student student18 = new Student("Giannis", " Grigoriou", 
                                        "06-12-1987", 2500, assignments6); 
        
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students2.add(student4);
        students2.add(student5);
        students2.add(student6);
        students2.add(student14);
        students3.add(student7);
        students3.add(student8);
        students3.add(student9);
        students4.add(student10);
        students4.add(student11);
        students4.add(student12);
        students5.add(student13);
        students5.add(student14);
        students5.add(student8);
        students5.add(student15);
        students6.add(student16);
        students6.add(student17);
        students6.add(student18);
        students6.add(student4);
        students6.add(student6);
        
        
    }
    
    public void assignmentData(){
    
        Assignment assignment1c1 = new Assignment("Assignment_1", "Create a class in Java",
                                                  "05-11-2020", 100, 100);
        Assignment assignment2c1 = new Assignment("Assignment_2", "Create a "
                                                  + "constructor in a class in Java", "15-11-2020", 100, 100);
        Assignment assignment3c1 = new Assignment("Assignment_3", "Create a "
                                                  + "class with methods", "25-11-2020", 100, 100);
        Assignment assignment4c1 = new Assignment("Assignment_4", "Create an "
                                                  + "Abstract in Java", "05-12-2020", 100, 100);
        Assignment assignment5c1 = new Assignment("Assignment_5", "Create an "
                                                  + "Abstract and an Interface in Java", "15-12-2020", 100, 100);
        Assignment assignment6c1 = new Assignment("Individual Project", "Create a "
                                                  + "private school in Java", "30-12-2020", 100, 100);
        Assignment assignment7c1 = new Assignment("Team Project", "Create a web "
                                                  + "site in Java", "10-01-2021", 100, 100);
                   
        Assignment assignment1c2 = new Assignment("Assignment_1", "Create a class in C#",
                                                  "05-11-2020", 100, 100);
        Assignment assignment2c2 = new Assignment("Assignment_2", "Create a "
                                                  + "constructor in a class in C#", "25-11-2020", 100, 100);
        Assignment assignment3c2 = new Assignment("Assignment_3", "Create a "
                                                  + "class with methods in C#", "08-12-2020", 100, 100);
        Assignment assignment4c2 = new Assignment("Assignment_4", "Create an "
                                                  + "Abstract in C#", "25-12-2020", 100, 100);
        Assignment assignment5c2 = new Assignment("Assignment_5", "Create an "
                                                  + "Abstract and an Interface in C#", "15-01-2021", 100, 100);
        Assignment assignment6c2 = new Assignment("Individual Project", "Create a "
                                                  + "private school in C#", "10-02-2021", 100, 100);
        Assignment assignment7c2 = new Assignment("Team Project", "Create a web "
                                                  + "site in C#", "30-03-2021", 100, 100);
        
        Assignment assignment1c3 = new Assignment("Assignment_1", "Create a class in C#",
                                                  "25-06-2020", 100, 100);
        Assignment assignment2c3 = new Assignment("Assignment_2", "Create a "
                                                  + "constructor in a class in C#", "05-07-2020", 100, 100);
        Assignment assignment3c3 = new Assignment("Assignment_3", "Create a "
                                                  + "class with methods in C#", "15-07-2020", 100, 100);
        Assignment assignment4c3 = new Assignment("Assignment_4", "Create an "
                                                  + "Abstract in C#", "25-07-2020", 100, 100);
        Assignment assignment5c3 = new Assignment("Assignment_5", "Create an "
                                                  + "Abstract and an Interface in C#", "05-08-2020", 100, 100);
        Assignment assignment6c3 = new Assignment("Individual Project", "Create a "
                                                  + "private school in C#", "20-08-2020", 100, 100);
        Assignment assignment7c3 = new Assignment("Team Project", "Create a web "
                                                  + "site in C#", "10-09-2021", 100, 100);
        
        Assignment assignment1c4 = new Assignment("Assignment_1", "Create a class in Python",
                                                  "30-06-2020", 100, 100);
        Assignment assignment2c4 = new Assignment("Assignment_2", "Create a "
                                                  + "constructor in a class in Python",  "15-07-2020", 100, 100);
        Assignment assignment3c4 = new Assignment("Assignment_3", "Create a "
                                                  + "class with methods in Python", "15-08-2020", 100, 100);
        Assignment assignment4c4 = new Assignment("Assignment_4", "Create an "
                                                  + "Abstract in Python",  "30-08-2020", 100, 100);
        Assignment assignment5c4 = new Assignment("Assignment_5", "Create an "
                                                  + "Abstract and an Interface in Python", "25-09-2020", 100, 100);
        Assignment assignment6c4 = new Assignment("Individual Project", "Create a "
                                                  + "private school in Python",  "20-11-2020", 100, 100);
        Assignment assignment7c4 = new Assignment("Team Project", "Create a web "
                                                  + "site in Python", "30-12-2021", 100, 100);
                 
        Assignment assignment1c5 = new Assignment("Assignment_1", "Create a class in JavaScript",
                                                  "28-02-2020", 100, 100);
        Assignment assignment2c5 = new Assignment("Assignment_2", "Create a "
                                                  + "constructor in a class in JavaScript", "08-03-2020", 100, 100);
        Assignment assignment3c5 = new Assignment("Assignment_3", "Create a "
                                                  + "class with methods in JavaScript", "18-03-2020", 100, 100);
        Assignment assignment4c5 = new Assignment("Assignment_4", "Create an "
                                                  + "Abstract in JavaScript", "03-04-2020", 100, 100);
        Assignment assignment5c5 = new Assignment("Assignment_5", "Create an "
                                                  + "Abstract and an Interface", "18-04-2020", 100, 100);
        Assignment assignment6c5 = new Assignment("Individual Project in JavaScript", "Create a "
                                                  + "private school",  "07-05-2020", 100, 100);
        Assignment assignment7c5 = new Assignment("Team Project", "Create a web "
                                                  + "site in JavaScript",  "15-05-2021", 100, 100);
                
        Assignment assignment1c6 = new Assignment("Assignment_1", "Create a class in Java",
                                                  "05-03-2020", 100, 100);
        Assignment assignment2c6 = new Assignment("Assignment_2", "Create a "
                                                  + "constructor in a class in Java", "25-03-2020", 100, 100);
        Assignment assignment3c6 = new Assignment("Assignment_3", "Create a "
                                                  + "class with methods in Java", "15-04-2020", 100, 100);
        Assignment assignment4c6 = new Assignment("Assignment_4", "Create an "
                                                  + "Abstract in Java", "05-05-2020",  100, 100);
        Assignment assignment5c6 = new Assignment("Assignment_5", "Create an "
                                                  + "Abstract and an Interface in Java", "30-05-2020", 100, 100);
        Assignment assignment6c6 = new Assignment("Individual Project", "Create a "
                                                  + "private school in Java", "30-06-2020", 100, 100);
        Assignment assignment7c6 = new Assignment("Team Project", "Create a web "
                                                  + "site in Java", "30-07-2021", 100, 100);
                
        assignments1.add(assignment1c1);
        assignments1.add(assignment2c1);
        assignments1.add(assignment3c1);
        assignments1.add(assignment4c1);
        assignments1.add(assignment5c1);
        assignments1.add(assignment6c1);
        assignments1.add(assignment7c1);
        
        assignments2.add(assignment1c2);
        assignments2.add(assignment2c2);
        assignments2.add(assignment3c2);
        assignments2.add(assignment4c2);
        assignments2.add(assignment5c2);
        assignments2.add(assignment6c2);
        assignments2.add(assignment7c2);  
    
        assignments3.add(assignment1c3);
        assignments3.add(assignment2c3);
        assignments3.add(assignment3c3);
        assignments3.add(assignment4c3);
        assignments3.add(assignment5c3);
        assignments3.add(assignment6c3);
        assignments3.add(assignment7c3);
        
        assignments4.add(assignment1c4);
        assignments4.add(assignment2c4);
        assignments4.add(assignment3c4);
        assignments4.add(assignment4c4);
        assignments4.add(assignment5c4);
        assignments4.add(assignment6c4);
        assignments4.add(assignment7c4);
        
        assignments5.add(assignment1c5);
        assignments5.add(assignment2c5);
        assignments5.add(assignment3c5);
        assignments5.add(assignment4c5);
        assignments5.add(assignment5c5);
        assignments5.add(assignment6c5);
        assignments5.add(assignment7c5);
        
        assignments6.add(assignment1c6);
        assignments6.add(assignment2c6);
        assignments6.add(assignment3c6);
        assignments6.add(assignment4c6);
        assignments6.add(assignment5c6);
        assignments6.add(assignment6c6);
        assignments6.add(assignment7c6);
        
    }
}
