package javabasics;

public class ConstructorExample {

    static int a ;
    static int b ;

    private ConstructorExample(){

        a = 1;
        b = 100;

    }

    public static void main(String[] args) {

        ConstructorExample c = new ConstructorExample();
        System.out.println(a);
        System.out.println(b);
    }
}
