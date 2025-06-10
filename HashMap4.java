
import java.util.HashMap;

public class HashMap4 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //insertion
        map.put("India",90);
        map.put("Us", 78);
        map.put("China", 70);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
        //Search operation
        if(map.containsKey("China")){
            System.out.println("the key is present in the map");


            }else{
            System.out.println("the key is not present in the map");

        }
        System.out.println(map.get("China"));
        System.out.println(map.get("Bijpur"));
    }
}
