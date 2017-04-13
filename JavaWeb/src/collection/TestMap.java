package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by admin on 2017/4/13.
 */
public class TestMap {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","黄飞鸿");
        map.put("2","李小龙");
        map.put("3","成龙");

        //第一种 普通使用，二次取值
        System.out.println("通过Map.keySet遍历key和value");
        for(String key:map.keySet()){
            System.out.println("key = "+key+" and value = "+map.get(key));
        }

        //第二种
        System.out.println("通过map.entrySet使用iterator遍历key和value");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println("key = "+entry.getKey()+" and value = "+entry.getValue());
        }

        //第三种：推荐 ，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key = "+entry.getKey()+" and value = "+entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但是不能遍历key");
        for(String v : map.values()){
            System.out.println("value = "+v);
        }
    }
}
