package javabasics;

public class CalculatorOperation {


    public static void main(String[] args) {

        int a = 2;
        int b = 7 ;

        String operator = "sub";

        int output = 0;

        if( operator.equals("add") ){

            output = a + b;

        }
        else if (operator.equals("sub")){
            if(a > b){
                output = a - b ;
            }else{
                output = b - a ;
            }
        }
        else if(operator.equals("multi")){
            output = a * b;
        }
        else if( operator.equals("div")){
            output = a / b;
        }
        else{

            System.out.println("invalid input ");
        }

        System.out.println(output);



    }
}
