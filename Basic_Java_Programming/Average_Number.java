/*QUESTIONS: 
In a program input 3 numbers: A,B and C. You have to output the average
of these 3 numbers?*/
package DSA_Programming.Basic_Java_Programming;

import java.util.Scanner;

public class Average_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a =sc.nextInt();
        System.out.println("Enter your second number: ");
        int b =sc.nextInt();
        System.out.println("Enter your third number: ");
        int c =sc.nextInt();
        int average=(a+b+c)/3;
        System.out.println("The Average number is: "+average);
        sc.close();
    }
}
