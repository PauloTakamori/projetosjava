package mapprogram;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("User", "Maria");
        //System.out.println(map.get("User"));
        map.put("Fone", "972860961");

        for (String key : map.keySet()){
            System.out.println("Chave: " + key + ", valor: " + map.get(key));
        }

    }
}
