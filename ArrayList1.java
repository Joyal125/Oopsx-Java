import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.print(list);
        Collections.sort(list);
        System.out.print(list);
        list.remove(0);
        System.out.print(list);

    }
}
