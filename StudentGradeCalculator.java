import java.util.*;

public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects=sc.nextInt();

        int totalMarks=0;

        
        for (int i=1;i<=numberOfSubjects;i++){
            System.out.print("Enter marks obtained in subject "+i+" (out of 100): ");
            int marks=sc.nextInt();
            totalMarks+=marks;
        }

        
        double averagePercentage=(double)totalMarks/numberOfSubjects;

        
        String grade;

        if(averagePercentage>=90){
            grade= "A";
        }else if(averagePercentage>=80){
            grade="B";
        }else if(averagePercentage>=70){
            grade="C";
        }else if(averagePercentage>=60){
            grade="D";
        }else{
            grade="F";
        }

       
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Percentage: "+averagePercentage+"%");
        System.out.println("Grade: "+grade);
    }
}