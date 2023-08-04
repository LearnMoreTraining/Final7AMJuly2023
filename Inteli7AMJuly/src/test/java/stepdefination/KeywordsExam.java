package stepdefination;

public class KeywordsExam extends JavaBasics{


    int a = 7;
   final double pie = 3.14 ;

    public static void main(String[] args) {

        KeywordsExam k = new KeywordsExam();
        k.m1();
        k.m2();
    }

    public int m1(){
        int a = 2 ;
        System.out.println(a);
        System.out.println(this.a);

        return a;
    }
    public void m2(){

        a = 78;
        System.out.println(a);
        System.out.println(super.a);
    }
}
