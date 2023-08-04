package javabasics;

public class PolyExample {


    public static void main(String[] args) {

        m1(1);
    }

    public static int m1(int a , int b){

        System.out.println(a +b);
        return a;
    }

    public static void m1(String a , String b){

        System.out.println(a);
        System.out.println(b);
    }

    public static void m1(int a){
        System.out.println(a);
    }

    public static void m1(int a , int b , String c){
        System.out.println(a+b);
        System.out.println(c);
    }
}
