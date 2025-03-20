package DSA_Programming.Basic_Java_Programming;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the input: ");
        float rad = Sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println(area);
        Sc.close();
    }
}
