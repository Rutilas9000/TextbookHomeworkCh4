/**
 * @Class: ReverseString
 * @Author: Savion Plater
 * @Course: ITEC2140 - 05, Spring 2023
 * @Written: March 13, 2023
 * Description: The program will ask for a string and display
 * the reverse of that value
 */
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = in.nextLine();
        String reverse = "";
        for(int i = str1.length()-1; i >= 0; i--) {
            reverse = reverse + str1.charAt(i);
        }
        System.out.println("The reversed String is: " + reverse);
        if(str1.equals(reverse)) {
            System.out.println("The two strings are equal to each other");
        }
        else {
            System.out.println("The two strings are not equal to each other");
        }
    }
}
