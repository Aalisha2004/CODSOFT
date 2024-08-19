package Task;

public class Course{
    String courseCode;
    String title;
    String description;
    int capacity;
    String schedule;
    int enrolledStudents;

    public Course(String courseCode,String title,String description,int capacity,String schedule){
        this.courseCode=courseCode;
        this.title=title;
        this.description=description;
        this.capacity=capacity;
        this.schedule=schedule;
        this.enrolledStudents=0;
    }

    public boolean isAvailable(){
        return enrolledStudents<capacity;
    }

    public void enroll(){
        if(isAvailable()){
            enrolledStudents++;
        }
    }

    public void drop(){
        if (enrolledStudents>0){
            enrolledStudents--;
        }
    }

    public void displayCourseInfo(){
        System.out.println("Course Code: "+courseCode);
        System.out.println("Title: "+title);
        System.out.println("Description: "+description);
        System.out.println("Capacity: "+capacity);
        System.out.println("Schedule: "+schedule);
        System.out.println("Available Slots: "+(capacity - enrolledStudents));
        System.out.println();
    }
}