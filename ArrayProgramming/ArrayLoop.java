package DSA_Programming.ArrayProgramming;

public class ArrayLoop {
    void ArrayLoop(){
        int[] ages = new int[3];
        ages[0]=33;
        ages[1]=40;
        ages[2]=56;

        //for loop 
        for(int i=0; i<3; i++){
            System.out.println(ages[i]);
        }

        //for each loop
        for(int age : ages){
            System.out.println(age);
        }

        //While loop
        int i=0;
        while (i<3) {
            System.out.println(ages[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        ArrayLoop obj = new ArrayLoop();
        obj.ArrayLoop();
    }
    
}
