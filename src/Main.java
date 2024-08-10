import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner handleUserInput = new Scanner(System.in);
        System.out.println("Enter the number of  students");
        int NumberOfStudents = handleUserInput.nextInt();
        handleUserInput.nextLine();
        int[] GradesOfStudents = new int[NumberOfStudents];
        for (int a = 0; a < NumberOfStudents; a++) {
            System.out.println("enter the grade for student " + (a + 1));
            int grade = handleUserInput.nextInt();
            handleUserInput.nextLine();
            GradesOfStudents[a] = grade;
        }

        int sumOfGrades = 0;

        for (int b = 0; b < GradesOfStudents.length; b++) {
            sumOfGrades += GradesOfStudents[b];
        }

        int average=50;
        int  avaerageGrade= sumOfGrades/NumberOfStudents;
        System.out.println("the following is the report from the correction of exam : ");
        for(int a=0; a < GradesOfStudents.length; a++){
            if(GradesOfStudents[a] >= average){
                System.out.println(" student with id "+a + " passed the exam and got " + GradesOfStudents[a] );
            }
            else{
                System.out.println("the student with id " + a + " failed the exam and got " + GradesOfStudents[a]);
            }
        }

        System.out.println(" finally  the average grade for  students is " +avaerageGrade);



    }
}