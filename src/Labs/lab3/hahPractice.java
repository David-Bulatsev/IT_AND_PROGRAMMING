package Labs.lab3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hahPractice {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("psya");


        Map<String, String> map = new HashMap<>();
        map.put("Petya", "52");
        map.put("Pysada", "5we2");
        map.put("govno", "0");
        for (String val: map.values()){
            System.out.println(val);
        }
//        System.out.println(map.get("Petya"));


    }
}
