package DSA_Programming.ArrayProgramming;

public class change_array {
    
    static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    static void change_array(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = 0;
        }
    }

    static void changeval(int a){
        a = 1004;
    }
    public static void main(String[] args) {
        int a =5;
        changeval(a);
        System.out.println(a);
        
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;

        change_array(arr);
        printArray(arr);
    }
}
