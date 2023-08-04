package javabasics;

public class VariableExample {
    int a ;    //Global variable


    public static void main(String[] args) {

    }
    public void m1(){
        a = 1;
      //  int a = 1;      //local variable
        System.out.println(a);
    }

    public void m2(){

        System.out.println(a);

    }
}
