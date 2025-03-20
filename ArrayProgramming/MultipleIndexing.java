package DSA_Programming.ArrayProgramming;

public class MultipleIndexing {
    void multiArr(){
        //int[][] arr_1= new int[5][3]
        int [][] arr = {{56, 43, 6}, {34, 7, 8}, {12, 15, 56}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }
    public static void main(String[] args) {
        MultipleIndexing obj = new MultipleIndexing();
        obj.multiArr();
    }
}
