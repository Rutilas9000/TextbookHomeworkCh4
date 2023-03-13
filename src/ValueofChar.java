/**
 * @Class: ValueofChar
 * @Author: Savion Plater
 * @Course: ITEC2140 - 05, Spring 2023
 * @Written: March 14, 2023
 * Description: The program will prompt the user for a string value and character value.
 * The program will then find the last occurrence of the provided character in the provided string
 * and display the corresponding index. If the character is not found in the String, display -1.
 */
import java.util.Scanner;
public class ValueofChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a character: ");
        String str2 = sc.nextLine();
        System.out.println("The last occurence of character " + str2 + " in " + str1 + " is at index " + str1.lastIndexOf(str2));
    }
}
