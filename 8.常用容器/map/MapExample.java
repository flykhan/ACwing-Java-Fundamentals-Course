package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
接口：java.util.Map<K, V>

实现：

    java.util.HashMap<K, V>：哈希表(无序)
    java.util.TreeMap<K, V>：平衡树(有序):可以使用二分
 */

public class MapExample {
    public void baseMapExample() {
        System.out.println("------------------------");
        System.out.println("baseMapExample:");
        Map<String, Integer> map = new HashMap<>();
        // 添加关键字及对应的值
        map.put("123", 2);
        map.put("321", 3);
        map.put("21", 10);

        // 获取关键字对应的值
        System.out.println(map.get("21"));

        // 判断是否包含关键字
        System.out.println(map.containsKey("1234"));

        // 删除关键字
        map.remove("21");

        // 返回元素数
        System.out.println(map.size());

        // 判空
        System.out.println(map.isEmpty());

        // 遍历获取 Map 中所有对象的集合
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // getKey() 获取关键字
            // getValue() 获取值
            entry.getKey();
            System.out.printf("%s %d\n", entry.getKey(), entry.getValue());
        }

        // 清空
        map.clear();

        // Map 中的对象类型

    }

    public void treeMapExample() {
        System.out.println("------------------------");
        System.out.println("treeMapExample:");
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(123, 2);
        treeMap.put(321, 3);
        treeMap.put(21, 10);

        Map.Entry<Integer, Integer> up = treeMap.ceilingEntry(123);
        System.out.println(up);

        Map.Entry<Integer, Integer> down = treeMap.floorEntry(12);
        System.out.println(down);

        // ceilingEntry(key) 返回大于等于 key 的最小元素,不存在则返回 null
        System.out.println(treeMap.ceilingKey(320));

        // floorEntry(key) 返回小于等于 key 的最大元素,不存在则返回 null
        System.out.println(treeMap.floorKey(320));
    }

    public static void main(String[] args) {
        new MapExample().baseMapExample();
        new MapExample().treeMapExample();
    }
}
