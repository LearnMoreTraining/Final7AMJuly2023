package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(3456,"tyu");
        m.put(535365,"zxcv");

        System.out.println( m.get(535365));

        for(Map.Entry k:m.entrySet()){

            System.out.println(k.getKey());
            System.out.println(k.getValue());
        }


    }


}
