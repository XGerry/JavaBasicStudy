import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Value1");
        map.put("2", "Value2");
        map.put("3", "Value3");
        map.put(null, "11");
        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key :
                map.keySet()) {
            System.out.println(key);
        }
        for (String value :
                map.values()) {
            System.out.println(value);
        }
        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }
        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()
                ) {
            System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }
        Vector vector = new Vector();
        vector.add("11");

//        Map<String,Integer> stringIntegerMap=new ConcurrentHashMap<>();
//        stringIntegerMap.put(null,11);
        HashSet hashSet = new HashSet();
        hashSet.add(11);
    }
}
