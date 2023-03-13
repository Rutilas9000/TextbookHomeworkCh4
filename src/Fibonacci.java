/**
 * @Class: Fibonacci
 * @Author: Savion Plater
 * @Course: ITEC2140 - 05, Spring 2023
 * @Written: March 13, 2023
 * Description: Prints out the first 30 values in
 * the Fibonacci series.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print("The first 30 numbers in the Fibonacci series are: ");
        for(int i = 0; i < 30; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
