package javabasics;

public class ConditionsExamples {

    public static void main(String[] args) {

        int a = 1 ;
        int b = 56 ;

        //both are equal

        if(a == b){
            System.out.println("Both are equal");
        }
        else if( a > b){
            System.out.println("a is greater");
        }
        else if( a < b){
            System.out.println(" a is less than b");
        }
        else{
            System.out.println("Both are not equal");
        }


    }
}
