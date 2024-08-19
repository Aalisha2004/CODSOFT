import java.util.*;

public class QuizApplication{
    private static final int TIMER_SECONDS=40;
    private static int score=0;     
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println();
        System.out.println("****************************Quiz******************************");
        System.out.println();
        System.out.println("NOTE:The timer for each question is set to 40 seconds.So, have to solve the question within the time otherwise you'll be exit from the QUIZ.");
        System.out.println();
        String questions[][]={
            {"Where is the Victoria Memorial located?","Mumbai","New Delhi","Kolkata","Chennai"},
            {"What is the name of the folk dance of Andhra Pradesh?","Bharatanatyam","Kathak","Kuchipudi","Odissi"},
            {"When is International Mother Language Day celebrated?","January 21","February 21","March 21","April 21"},
            {"Who wrote Wings of Fire?","Rabindranath Tagore","Dr. A.P.J. Abdul Kalam", "R.K. Narayan", "Jawaharlal Nehru"},
            {"What is the name of the national bird of the United States of America?","Bald Eagle","Golden Eagle","American Robin","Peregrine Falcon"}
        };
        int correctAnswers[]={3, 3, 2, 2, 1};
        for (int i=0;i<questions.length;i++){
            askQuestion(questions[i],correctAnswers[i]);
        }
        displayResults(questions,correctAnswers);
    }

    private static void askQuestion(String questionData[],int correctAnswer) {
        System.out.println(questionData[0]);
        for(int i=1;i<questionData.length;i++){
            System.out.println(i+". "+questionData[i]);
        }
        int userAnswer=getUserAnswerWithTimer();
        if(userAnswer == correctAnswer){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Incorrect!");
        }
    }   

    private static int getUserAnswerWithTimer(){
        Timer timer=new Timer();
        TimerTask task=new TimerTask(){
            public void run(){
                System.out.println("\nTime's up!");
                System.exit(0);
            }
        };
        timer.schedule(task,TIMER_SECONDS*1000);
        int userAnswer=scanner.nextInt();       
        timer.cancel();                          
        return userAnswer;
    }

    private static void displayResults(String questions[][],int correctAnswers[]){
        System.out.println("\nQuiz Finished!");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~Your final score is: "+score+"/"+questions.length+"  ~~~~~~~~~~~~~~");
        System.out.println();
          System.out.println("-----Here is the Summary-----");
          for(int i=0;i<questions.length;i++){
            System.out.println("\nQuestion: "+questions[i][0]);
            System.out.println("Your answer: "+questions[i][correctAnswers[i]]);
            System.out.println("Correct answer: "+questions[i][correctAnswers[i]]);
        }
    }
}