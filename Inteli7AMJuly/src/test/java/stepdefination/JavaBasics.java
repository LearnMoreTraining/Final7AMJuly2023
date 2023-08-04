package stepdefination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaBasics {

    int a = 89;

    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(34);
        l1.add(78);
        l1.add(90);
        System.out.println(l1);

        for(int u:l1){
            System.out.println(u);
        }

        List<String > h = new ArrayList<String>();
        h.add("abc");
        h.add("xyz");

        for(String out:h){
            System.out.println(out);
        }

        Set <String> j = new HashSet<String>();
        j.add("45");
        j.add("67");
        for(String val:j){
            System.out.println(val);
        }


    }

}
