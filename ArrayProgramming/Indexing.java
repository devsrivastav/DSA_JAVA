package DSA_Programming.ArrayProgramming;

public class Indexing {
    void demoArrays(){
        int [] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];

        //AGES
        ages[0] =34;
        ages[1] =12;
        ages[2] =45;

        //WEIGTHS 
        weights[0] =23.8f;
        weights[1] =45.5f;
        weights[2] =55.9f;

        //STRINGS
        names[0] = "Dev";
        names[1] ="Pratyush";
        names[2]= "Kartik";

        System.out.println("This section is for ages only: ");
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println("This section is for weights only: ");
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        System.out.println("This section is for names only: ");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
    public static void main(String[] args) {
        Indexing obj= new Indexing();
        obj.demoArrays();
    }
}
