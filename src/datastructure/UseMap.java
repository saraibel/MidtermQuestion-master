package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        Map <Integer, String> map = new LinkedHashMap <Integer, String>();

        map.put(1, "New york");
        map.put(2, "Texas");
        map.put(3, "Florida");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        for (Map.Entry<Integer, String> USAcity : map.entrySet()) {
            System.out.println(USAcity.getKey() + "  " + USAcity.getValue());
        }
        System.out.println("=====================================");
        List <String> usacity = new ArrayList <>();

        usacity.add("New york");
        usacity.add("Texas");
        usacity.add("Florida");

        List<String> Canadacity = new ArrayList<>();

        Canadacity.add("Quebec");
        Canadacity.add("Toronto");
        Canadacity.add("Alberta");

        Map<Integer, List<String>> map2 = new LinkedHashMap<>();

        map2.put(1, usacity);
        map2.put(2,  Canadacity);

        for (Map.Entry<Integer, List<String>> city : map2.entrySet()) {
            System.out.println(city.getKey() + "   " + city.getValue());
        }


    }

}
