import java.util.*;

public class Grade{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks to check grade");
        int marks=sc.nextInt();

        if(marks<30)
        {
            System.out.println("C");
        }
        else if(30=<marks<70)
        {
            System.out.println("B");
        }
        else if(70=<marks<90)
        {
            System.out.println("A");
        }
        else if(90=<marks=<100)
        {
            System.out.println("A+");
        }
        else{
            System.out.println("Invalid");
        }
    }
}