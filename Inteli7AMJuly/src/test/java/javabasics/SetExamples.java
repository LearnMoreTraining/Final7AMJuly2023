package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {


        Set<Integer> s = new HashSet<Integer>();
        s.add(45);
        s.add(67);
        s.add(89);
        System.out.println(s);
        s.add(67);
        s.add(1);
        System.out.println(s);

    }
}
