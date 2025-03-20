package DSA_Programming.ArrayProgramming;

public class LenghtArray {
    void LenghtArray(){
        int[] ages = new int[3];
        String[] names = {"Dev", "Pratyush", "Kartik", "Aman"};

        System.out.println(ages.length);
        System.out.println(names.length);
    }
    public static void main(String[] args) {
        LenghtArray obj = new LenghtArray();
        obj.LenghtArray();
    }
 
}
