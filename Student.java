package Task;

import java.util.ArrayList;

public class Student{
    String studentID;
    String name;
    ArrayList<Course>registeredCourses;

    public Student(String studentID,String name){
        this.studentID=studentID;
        this.name=name;
        this.registeredCourses=new ArrayList<>();
    }

    public void registerCourse(Course course){
        if(course.isAvailable()){
            registeredCourses.add(course);
            course.enroll();
            System.out.println("Successfully registered for course: "+course.title);
        }else{
            System.out.println("Course "+course.title+" is full. Registration failed.");
        }
    }

    public void dropCourse(Course course){
        if(registeredCourses.contains(course)){
            registeredCourses.remove(course);
            course.drop();
            System.out.println("Successfully dropped course: "+course.title);
        }else{
            System.out.println("You are not registered for this course.");
        }
    }

    public void displayRegisteredCourses(){
        System.out.println("Courses registered by "+name+":");
        for(Course course:registeredCourses){
            System.out.println(course.title+" ("+course.courseCode+")");
        }
        System.out.println();
    }
}