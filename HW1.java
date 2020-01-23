
/**
 * Alex Pierce
 * CSCI 221, HW 1
 * I certify that this is my individual work.
 */
import java.util.Scanner;
public class HW1
{
    public static void main (String[] args)
    {   
    int zyBooksScore; 
    int labInclassAssignmentsScore;
    int programmingAssignmentsScore;
    int quizScore;
    int test1;
    int test2;
    int test3;
    int finalScore;
    
    System.out.print("Enter your Zybooks score: ");
    Scanner zybooks = new Scanner (System.in);
    zyBooksScore = zybooks.nextInt();
    
    System.out.print("Enter your lab/in-class assignments score: ");
    Scanner assignments = new Scanner (System.in);
    labInclassAssignmentsScore = assignments.nextInt();
    
    System.out.print("Enter your programming assignments score: ");
    Scanner programming = new Scanner (System.in);
    programmingAssignmentsScore = programming.nextInt();
    
    System.out.print("Enter your quiz score: ");
    Scanner quiz = new Scanner (System.in);
    quizScore = quiz.nextInt();
    
    System.out.print("Enter your score for Test 1: ");
    Scanner firstTest = new Scanner (System.in);
    test1 = firstTest.nextInt();
    
    System.out.print("Enter your score for Test 2: ");
    Scanner secondTest = new Scanner (System.in);
    test2 = secondTest.nextInt();
    
    System.out.print("Enter your score for Test 3: ");
    Scanner thirdTest = new Scanner (System.in);
    test3 = thirdTest.nextInt();
    
    System.out.print("Enter your score for the final exam: ");
    Scanner finalExam = new Scanner (System.in);
    finalScore = finalExam.nextInt();
    
    double assignmentsContribution;
    double testsQuizzesContribution;
    double finalExamContribution;
    double finalSemesterScore;
    
    assignmentsContribution = (((zyBooksScore + labInclassAssignmentsScore + programmingAssignmentsScore)/3.0)*0.25);
    testsQuizzesContribution = (((quizScore + test1 + test2 + test3)/4.0)*0.50);
    finalExamContribution = ((finalScore*0.25));
    finalSemesterScore = (assignmentsContribution + testsQuizzesContribution + finalExamContribution);
    
    int lowestGrade;
    
    lowestGrade = 0;
    
    if (test1 < test2 && test1 < test3) {
        lowestGrade = test1;
    } else if (test2 < test3 && test2 < test1) {
        lowestGrade = test2; 
    } else if (test3 < test1 && test3 < test2) {
        lowestGrade = test3;
    } 
    
    System.out.println();
    System.out.print("Lowest test score is: ");
    System.out.println(lowestGrade);
    
    if (lowestGrade < finalScore) {
        lowestGrade = finalScore;
    }
    
    var letterGrade = "";
    
    if (89 < finalSemesterScore && finalSemesterScore < 101) {
        letterGrade = "A";
    } else if (79 < finalSemesterScore && finalSemesterScore < 90) {
        letterGrade = "B";
    } else if (69 < finalSemesterScore && finalSemesterScore < 80) {
        letterGrade = "C";
    } else if (59 < finalSemesterScore && finalSemesterScore < 70) {
        letterGrade = "D";
    } else if (0 < finalSemesterScore && finalSemesterScore < 60) {
        letterGrade = "F";
    }
        
    
    System.out.print("Final Exam score: ");
    System.out.println(finalScore);
    System.out.print("Lowest test replaced by exam: ");
    System.out.println(lowestGrade);
    System.out.println();
    System.out.print("Final Semester Score: ");
    System.out.print(finalSemesterScore);
    System.out.print(", and earned the grade of ");
    System.out.print(letterGrade);
    System.out.print(" in the class.");
    
    }
}

