package javabasics;

public class ExceptionHandling {


    private ExceptionHandling(){

    }

    public static void main(String[] args) {

        String a = "123";  //0,1,2,3
        String b = "56";
        System.out.println(a.charAt(0));
        System.out.println(a.length());
        System.out.println(a.concat(b));


        try {
            int n = Integer.parseInt(a);
            System.out.println(n + 1);
        }
        catch (NumberFormatException j){

       String removeDollar = a.substring(1);
            int n = Integer.parseInt(removeDollar);
            System.out.println(n+8);

        }
        finally {
            System.out.println("gfi");
        }
    }
}
