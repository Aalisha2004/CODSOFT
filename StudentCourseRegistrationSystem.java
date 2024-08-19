package Task;

import java.util.HashMap;
import java.util.Scanner;

public class StudentCourseRegistrationSystem{
    private static HashMap<String,Course>courseDatabase=new HashMap<>();
    private static HashMap<String,Student>studentDatabase=new HashMap<>();
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        courseDatabase.put("CS101",new Course("CS101","Introduction to Computer Science","Basics of Computer Science",3, " 9-10 AM"));
        courseDatabase.put("CS102",new Course("CS102","Data Structures","Introduction to Data Structures",2, " 11-12 AM"));
        courseDatabase.put("CS103",new Course("CS103","Computer Algorithms","Design and Analysis of Algorithms",2, " 2-3 PM"));

        studentDatabase.put("1001",new Student("1001","Alisha"));
        studentDatabase.put("1002",new Student("1002","Zeba"));
        studentDatabase.put("1003",new Student("1003","Misbah"));

        System.out.println();
        System.out.println("********* Student Registration **********");
        System.out.println();
        while(true){
            System.out.println("1. List Courses");
            System.out.println("2. Register for Course");
            System.out.println("3. Drop Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");

            System.out.print("Select an option: ");
            int option=scanner.nextInt();

            System.out.println();
            switch(option){
                case 1:
                    listCourses();
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    String studentID=scanner.next();
                    Student student=studentDatabase.get(studentID);
                    if(student!=null){
                        System.out.print("Enter Course Code: ");
                        String courseCode=scanner.next();
                        Course course=courseDatabase.get(courseCode);
                        if(course!=null){
                            student.registerCourse(course);
                        }else{
                            System.out.println("Course not found.");
                        }
                    }else{
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    studentID=scanner.next();
                    student=studentDatabase.get(studentID);
                    if(student!=null){
                        System.out.print("Enter Course Code: ");
                        String courseCode=scanner.next();
                        Course course=courseDatabase.get(courseCode);
                        if(course!=null){
                            student.dropCourse(course);
                        }else{
                            System.out.println("Course not found.");
                        }
                    }else{
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    studentID=scanner.next();
                    student=studentDatabase.get(studentID);
                    if(student!=null){
                        student.displayRegisteredCourses();
                    }else{
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void listCourses(){
        System.out.println("Available Courses:");
        System.out.println();
        for(Course course:courseDatabase.values()){
            course.displayCourseInfo();
        }
    }
}