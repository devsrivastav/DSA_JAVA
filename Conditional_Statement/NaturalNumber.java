package DSA_Programming.Conditional_Statement;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you numbere here: ");

        int n =sc.nextInt();
        int sum = 0;

        int i =1;
        while (i<=n) {
            sum  = i;
            i++;
        }
        System.out.println("Sum is: "+sum);
        sc.close();
    }
}
