/*Find the last occurences of an elements x in a given array. */
package DSA_Programming.ArrayProgramming;

import java.util.Scanner;

public class Last {
    static int lastOccurences(int[] arr, int x){
        int lastIndex = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + "elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("LAST OCCUENCES OF X: " +lastOccurences(arr, x));
    }
}
