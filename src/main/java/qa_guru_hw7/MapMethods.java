package qa_guru_hw7;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    private static Map<String,String> stringMap;

    public static void addElementInMap(HashMap<Object, Object> stringMap, String key, String value) {
        stringMap.put(key, value);
    }

    public static void removeElementByKey(HashMap<Object, Object> stringMap, String key) {
        stringMap.remove(key);
    }

    public static String getEntry(HashMap<Object, Object> stringMap, String key) {
        for (Map.Entry<Object, Object> entry:
             stringMap.entrySet()) {
            if (entry.getKey().equals(key))
                return String.format((String) entry.getKey(),entry.getValue());
        }
        return "Элемент отсутвует";
    }

}
