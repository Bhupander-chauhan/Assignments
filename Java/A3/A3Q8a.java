package JavaFiles;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class A3Q8a {
    public static void failFast(Map<String, String> cityCode)
    {
        Iterator iterator = cityCode.keySet().iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.println(cityCode.get(iterator.next())); 
            cityCode.put("Faridabad", "India");
        }
    }
    public static void main(String[] args) 
    {
    	Map<String, String> cityCode = new HashMap<String, String>(); 
        cityCode.put("Delhi", "India"); 
        cityCode.put("Mumbai", "India"); 
        cityCode.put("Banglore", "India"); 
        failFast(cityCode);
    }
}