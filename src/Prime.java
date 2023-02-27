/**
 * @class: Prime
 * @author: Savion Plater
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 27, 2023
 * description: This program will ask the user for an integer
 * and displays if the provided integer is a prime number or not.
 * */
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = 2;
        boolean c = false;
        while(b <= a / 2) {
            if (a % b == 0) {
                c = true;
                break;
            }
            ++b;
        }
        if(!c) {
            System.out.println(a + " is a prime number");
        }
        else {
            System.out.println(a + " is not a prime number");
        }
    }
}
