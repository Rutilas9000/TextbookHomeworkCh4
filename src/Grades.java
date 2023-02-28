/**
 * @class: Grades
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 27, 2023
 * description: This program will ask the user for student grades,
 * calculates and displays the average grade in the class.
 * The user should enter a character to stop providing values.
 * */
import java.util.Scanner;
public class Grades {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        int numOfgrades=0;
        int grade;
        System.out.println("Enter student grades: ");
        while(sc.hasNextInt()){
            grade=sc.nextInt();
            sum+=grade;
            numOfgrades++;
        }

        double avg=(sum/(double)numOfgrades);
        System.out.println("Average student grade is "+avg);
    }
}
