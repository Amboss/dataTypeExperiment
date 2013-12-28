package dataTypeExperiment;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Class
 */
public class MyHashMap implements HashMapped{

    /**
     * Generating String map
     *
     * @return Map
     */
    @Override
    public Map<String, String> setHashMap() {
        Map<String, String> foo = new HashMap<String, String>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int bar = random.nextInt(10000);
            String str = Integer.toString(bar);
            foo.put(str, str);
        }
        return foo;
    }

    /**
     * Printing list to console
     *
     * @param map - Map<String, String>
     */
    @Override
    public void printHashMap(Map<String, String> map) {

        System.out.printf("\n%s, ", "hashMap contain this elements: \n");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }


}
