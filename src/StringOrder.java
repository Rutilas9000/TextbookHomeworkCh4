/**
 * @Class: StringOrder
 * @Author: Savion Plater
 * @Course: ITEC2140 - 05, Spring 2023
 * @Written: March 13, 2023
 * Description: The program will ask the user for two String values.
 * The program should then display if String 1 is greater in
 * length than string 2. The program will also display if
 * string 1 appears after string 2 in the
 * lexicographic order or if they are the same
 */
import java.util.Scanner;
public class StringOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Please enter String 2: ");
        String str2 = sc.nextLine();
        if(str1.length() > str2.length()) {
            System.out.println("String " + str1 + " is longer than String " + str2);
        }
        else if(str2.length() > str1.length()) {
            System.out.println("String " + str2 + " is longer than String " + str1);
        }
        else{
            System.out.println("Both Strings are the same in length");
        }
        int minlength = Math.min(str1.length(), str2.length());
        for(int i = 0; i < minlength; i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                if(str1.charAt(i) < str2.charAt(i)) {
                    System.out.println("String " + str1 + " appears before String " + str2 + " in lexicographic order");
                    break;
                }
                else {
                    System.out.println("String " + str2 + " appears before String " + str1 + " in lexicographic order");
                    break;
                }
            }
            else {
                System.out.println("Both Strings are the same in lexicographic order");
                break;
            }
        }
        System.out.println("New sentence created is: " + str1 + " " + str2);
    }
}
