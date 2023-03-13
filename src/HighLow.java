/**
 * @Class: HighLow
 * @Author: Savion Plater
 * @Course: ITEC2140 - 05, Spring 2023
 * @Written: March 13, 2023
 * Description: The program will prompt the user for student grades
 * and display the highest and lowest grades in the class.
 */
import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student grades. Enter a character to stop.");
        double lowGrade = 74;
        double highGrade = 75;
        while (input.hasNextDouble()) {
            double grade = input.nextDouble();
            if (grade == 0) {
                break;
            }
            if (grade < lowGrade) {
                lowGrade = grade;
            }
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        System.out.println("The highest grade is: " + highGrade);
        System.out.println("The lowest grade is: " + lowGrade);
    }
}