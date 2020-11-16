package privateschool;

import java.util.*;
public class MainClass extends SyntheticData{

    public static void main(String[] args) {
            
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Trainer> trainers = null;
        ArrayList<ArrayList<Trainer>> listTrainers = new ArrayList<ArrayList<Trainer>>();
        ArrayList<Student> students = null;
        ArrayList<ArrayList<Student>> listStudents = new ArrayList<ArrayList<Student>>();
        ArrayList<Assignment> assignments = null;
        ArrayList<DataPerCourse> dataPerCourseList = new ArrayList<DataPerCourse> ();
        ArrayList<ArrayList<Assignment>> listAssignments = new ArrayList<ArrayList<Assignment>>();
        DataPerCourse dataPerCourse1 = null;
        DataPerCourse dataPerCourse2 = null;
        DataPerCourse dataPerCourse3 = null, dataPerCourse4 = null, dataPerCourse5 = null;
        DataPerCourse dataPerCourse6 = null;
        SumOfLists sumOfList = new SumOfLists();
        Scanner sc = null, sc2 =null, sc3 = null, sc4 = null, sc5 = null, sc6 = null;
        Scanner sc7 = null, sc8 = null, sc9 = null, sc10 = null;
        int k = 0, tuitionFees = 0, totalMark = 0;
        String[] arrOfStr;
        String str = null, titleCourse = null, stream = null; 
        String streamCourse = null, typeCourse = null, startingDateCourse = null;
        String  endingDateCourse = null, name = null, lastName = null, date = null;
        String scanner1, checkDate;
                
        System.out.println("Welcome to the construction of a private school");
        System.out.println("Would you like to input data for courses, trainers,"
                            + " students and assignments of school?");
        System.out.println("Press 'y' for yes, else press any other key");
        Scanner sc1 = new Scanner(System.in);
        scanner1 = sc1.next();
        if(scanner1.equals("y")){
            do{
                assignments = new ArrayList<Assignment>();
                trainers = new ArrayList<Trainer>();
                students = new ArrayList<Student>();
                
                System.out.println("Create a course (Type(with no spaces) title,stream,type,starting date,ending date). Date as dd-MM-yyyy");
                sc = new Scanner (System.in);
                str = sc.next();
                arrOfStr = str.split(",");
                titleCourse = arrOfStr[0];
                streamCourse = arrOfStr[1];
                typeCourse = arrOfStr[2];
                startingDateCourse = arrOfStr[3];
                endingDateCourse = arrOfStr[4];
                
                System.out.println("Type up to 7 assignments/projects of the course");
                
                do{
                    System.out.println("Type assignment's info (title,description,"
                                 + "submission date time,oral mark,total mark). "
                                 + "Date as dd-MM-yyyy");
                    sc2 = new Scanner(System.in);
                    str = sc2.next();
                    arrOfStr = str.split(",");
                    name = arrOfStr[0];
                    lastName = arrOfStr[1];
                    date = arrOfStr[2];
                    tuitionFees = Integer.parseInt(arrOfStr[3]);
                    totalMark = Integer.parseInt(arrOfStr[4]);
                    assignments.add(new Assignment(name, lastName, date, tuitionFees, totalMark));
                    System.out.println("Is it another assignment? Type 'y' for yes,"
                                     + " else any other key");
                    sc9 = new Scanner(System.in);
                }while(assignments.size() <= 7 && sc9.next().equals("y")); 
                
                System.out.println("Type the trainers of the course");
                do{
                    System.out.println("Type trainer's info (first name,last name,subject)");
                    sc3 = new Scanner(System.in);
                    str = sc3.next();
                    arrOfStr = str.split(",");
                    name = arrOfStr[0];
                    lastName = arrOfStr[1];
                    stream = arrOfStr[2];
                    trainers.add(new Trainer(name, lastName, stream));
                    System.out.println("Is it another trainer? Type 'y' for yes,"
                                     + " else any other key");
                    sc4 = new Scanner(System.in);
                }while(sc4.next().equals("y"));
                
                System.out.println("Type the students of the course");                
                do{
                    System.out.println("Type student's info (first name,last name,date of Birth,tuition Fees). Date as dd-MM-yyyy");
                    sc5 = new Scanner(System.in);
                    str = sc5.next();
                    arrOfStr = str.split(",");
                    name = arrOfStr[0];
                    lastName = arrOfStr[1];
                    date = arrOfStr[2];
                    tuitionFees = Integer.parseInt(arrOfStr[3]);
                    students.add(new Student(name, lastName, date, tuitionFees, assignments));
                    System.out.println("Is it another student? Type 'y' for yes,"
                                     + " else any other key");
                    sc6 = new Scanner(System.in);
                }while(sc6.next().equals("y")); 
                
                courses.add(new Course(titleCourse, streamCourse, typeCourse, 
                                    startingDateCourse, endingDateCourse, students, 
                                    trainers, assignments));
                sumOfList.sumStudent(students);
                listStudents.add(k, students);
                sumOfList.sumTrainers(trainers);
                listTrainers.add(k, trainers);
                sumOfList.sumAssignments(assignments);
                listAssignments.add(k, assignments);
                dataPerCourseList.add( new DataPerCourse(courses.get(k), students, trainers, assignments));
                System.out.println("Do you want to creat another course? "
                                 + "Press 'y' for yes, else press any other key");
                sc7 = new Scanner(System.in);
                k++;
            }while(sc7.next().equals("y"));
        
        }else{
            SyntheticData synData = new SyntheticData();
            synData.assignmentData();
            synData.studentData();
            synData.trainerData();
            synData.courseData();
            sumOfList.sumStudent(students1);
            sumOfList.sumStudent(students2);
            sumOfList.sumStudent(students3);
            sumOfList.sumStudent(students4);
            sumOfList.sumStudent(students5);
            sumOfList.sumStudent(students6);
            sumOfList.sumTrainers(trainers1);
            sumOfList.sumTrainers(trainers2);
            sumOfList.sumTrainers(trainers3);
            sumOfList.sumTrainers(trainers4);
            sumOfList.sumTrainers(trainers5);
            sumOfList.sumTrainers(trainers6);
            sumOfList.sumAssignments(assignments1);
            sumOfList.sumAssignments(assignments2);
            sumOfList.sumAssignments(assignments3);
            sumOfList.sumAssignments(assignments4);
            sumOfList.sumAssignments(assignments5);
            sumOfList.sumAssignments(assignments6);
            sumOfList.sumCourses(courses1);
          
            dataPerCourse1 = new DataPerCourse(courses1.get(0), students1, trainers1, assignments1);
            dataPerCourse2 = new DataPerCourse(courses1.get(1), students2, trainers2, assignments2);
            dataPerCourse3 = new DataPerCourse(courses1.get(2), students3, trainers3, assignments3);
            dataPerCourse4 = new DataPerCourse(courses1.get(3), students4, trainers4, assignments4);
            dataPerCourse5 = new DataPerCourse(courses1.get(4), students5, trainers5, assignments5);
            dataPerCourse6 = new DataPerCourse(courses1.get(5), students6, trainers6, assignments6);            
        }
        do{
            System.out.println("Which list of the following do you want to call? (Type number) ");
            System.out.println("(1) List of all students \n(2) List of all trainers \n"
                             + "(3) List of all assignments \n(4) List of all course \n"
                             + "(5) Students per course \n(6) Trainers per course \n"
                             + "(7) Assignments per course \n(8) Assignments per student \n"
                             + "(9) Students that belong to more than one cours \n"
                             + "(10) Assignments check for students");
            sumOfList.sumCourses(courses);
            sc8 = new Scanner (System.in);
            int i = sc8.nextInt();
            if(i==1){
                sumOfList.PrintAllStudents();
            }
            if(i==2){
                sumOfList.PrintAllTrainers();
            }
            if(i==3){
                sumOfList.PrintAllAssignments();
            }
            if(i==4){
                sumOfList.PrintAllCourses();
            }        
            if(i==5){
                if(!scanner1.equals("y")){
                    dataPerCourse1.printStudentsPerCourse();
                    dataPerCourse2.printStudentsPerCourse();
                    dataPerCourse3.printStudentsPerCourse();
                    dataPerCourse4.printStudentsPerCourse();
                    dataPerCourse5.printStudentsPerCourse();
                    dataPerCourse6.printStudentsPerCourse();
                }else{
                    for(DataPerCourse dpc : dataPerCourseList){
                        dpc.printStudentsPerCourse();
                    }
                }
            }
            if(i==6){
                if(!scanner1.equals("y")){
                    dataPerCourse1.printTrainersPerCourse();
                    dataPerCourse2.printTrainersPerCourse();
                    dataPerCourse3.printTrainersPerCourse();
                    dataPerCourse4.printTrainersPerCourse();
                    dataPerCourse5.printTrainersPerCourse();
                    dataPerCourse6.printTrainersPerCourse();
                }else{
                    for(DataPerCourse dpc : dataPerCourseList){
                        dpc.printTrainersPerCourse();
                    }
                }        
            }
            if(i==7){
                if(!scanner1.equals("y")){
                    dataPerCourse1.printAssignmentsPerCourse();
                    dataPerCourse2.printAssignmentsPerCourse();
                    dataPerCourse3.printAssignmentsPerCourse();
                    dataPerCourse4.printAssignmentsPerCourse();
                    dataPerCourse5.printAssignmentsPerCourse();
                    dataPerCourse6.printAssignmentsPerCourse();
                }else{
                    for(DataPerCourse dpc : dataPerCourseList){
                        dpc.printAssignmentsPerCourse();
                    }
                }          
            }
            if(i==8){
                if(!scanner1.equals("y")){
                    for (Student stud : students1){
                        stud.assignmentsPerStudent();
                    }
                    for (Student stud : students2){
                        stud.assignmentsPerStudent();
                    }
                    for (Student stud : students3){
                        stud.assignmentsPerStudent();
                    }
                    for (Student stud : students4){
                        stud.assignmentsPerStudent();
                    }
                    for (Student stud : students5){
                        stud.assignmentsPerStudent();
                    }
                    for (Student stud : students6){
                        stud.assignmentsPerStudent();
                    }
                }else{
                    for(ArrayList<Student> st : listStudents){
                        for (Student stud : st){
                            stud.assignmentsPerStudent();
                        }
                    }
                }
            }
            if(i==9){
                StudentsInManyCourses sinmc = new StudentsInManyCourses();
                sinmc.studentsManyCourses(sumOfList);
            } 
            if(i==10){
                System.out.println("Insert a date to check");
                sc10 = new Scanner(System.in);
                checkDate = sc10.next();
                CalendarWeek calWeek = new CalendarWeek(checkDate, sumOfList.listStudents);
                calWeek.calendarWeek();
            }
            System.out.println("Do you want another list? Press 'y' for yes, else any key");
            sc4 = new Scanner(System.in);
        }while(sc4.next().equals("y"));
        System.out.println("Bye :)");
    }     
}


