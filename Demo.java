import java.util.*;
public class Demo
 {
    public static void main(String[] args) 
    {
        Demo demo = new Demo();
        Map<String, List<String>> test = demo.getMap();
        int i = 0;
        for(Map.Entry<String, List<String>> listEntry : test.entrySet())
        {
            System.out.println("Iterating list number - " + ++i);
            for(String name : listEntry.getValue())
            {
                System.out.println("Fruit - " + name);
            }
        }
    }
    private Map<String, List<String>> getMap()
    {
        Map<String, List<String>> test = new HashMap<String, List<String>>();
        
        List<String> temp = new ArrayList<String>();  
        temp.add("Apple");
        temp.add("Banana");
        test.put("1", temp);
      
        temp = new ArrayList<String>();  
        temp.add("Guaua");
        temp.add("Pineapple");
        test.put("2", temp);
        
        temp = new ArrayList<String>();
        temp.add("Watermelon");
        temp.add("Mango");
        test.put("3", temp);
        return test;
    }
}