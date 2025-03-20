package DSA_Programming.Basic_Java_Programming;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your first item : ");
        float pencil = sc.nextInt();

        System.out.println("Enter your second item : ");
        float pen = sc.nextInt();

        System.out.println("Enter your third item : ");
        float eraser = sc.nextInt();
      
        float total = pen+pencil+eraser;
        System.out.println("Bill is: "+total);

        //Add on with 18% GST
        float newtotal = total+(0.18f * total);
        System.out.println("Bill with 18% TAX: "+newtotal);
        System.out.println("Thank you to buy a items have a nice day.");
        sc.close();
    }
}
