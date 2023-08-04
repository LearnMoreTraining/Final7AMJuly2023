package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int [] a = {45,67,90,100};  //0,1,2,3

        for (int k = 0 ; k < a.length ; k++){

            System.out.println(a[k]);
        }
        //0 < 4
        //1 < 4
        //2 < 4
        // 3 < 4
        //4 < 4

        String [] b = {"apple","mango"}; //0,1

        System.out.println(a[1]);
        System.out.println(b[0]);

        for(int i =0 ; i < b.length; i++ ){

            System.out.println(b[i]);
        }

        // 0 < 2
        // 1 < 2
        // 2 < 2


    }
}
