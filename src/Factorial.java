/**
 * @Class: Factorial
 * @Author: Savion Plater
 * @Course: ITEC2140 - 05, Spring 2023
 * @Written: March 13, 2023
 * Description: This program would ask the user to enter
 * a number, and the program would find the factorial of it.
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        int count = 1;
        for(int i = 1; i <= num; i++) {
            count = count * i;
        }
        System.out.println("The factorial of " + num + " is " + count);
    }
}
