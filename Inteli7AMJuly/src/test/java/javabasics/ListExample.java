package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(67);
        l1.add(55);
        System.out.println(l1);
        l1.add(89);
        System.out.println(l1);
        l1.add(100);
        System.out.println(l1);
        l1.add(55);
        System.out.println(l1);

        System.out.println(l1.get(1));


        List <String> name = new ArrayList<String>();
        name.add("aravinth");
        name.add("learn");
        name.add("more");
        System.out.println(name);

        for(String o:name){
            System.out.println(o);
        }




    }

}
