/**
 * @Class: Asterisk
 * @Author: Savion Plater
 * @Course: ITEC2140 - 05, Spring 2023
 * @Written: March 13, 2023
 * Description: This program will create a pattern of asterisks
 */
public class Asterisk {
    public static void main(String[] args) {
        for(int a = 1; a <= 6; a++) {
            for(int b = a; b <= 6; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
