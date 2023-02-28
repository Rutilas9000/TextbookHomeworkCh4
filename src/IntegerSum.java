/**
 * @class: IntegerSum
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 27, 2023
 * description: This program will accept an integer from the user
 * and display the sum of the digits of the provided integer.
 * */
import java.util.Scanner;
public class IntegerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        int sum;
        for (sum = 0; number > 0; number = number / 10) {
            sum = sum + number % 10;
        }
        System.out.println("Sum  is " + sum);
    }
}
