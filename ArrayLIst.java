import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIst {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add element
        list.add(0);
        list.add(3);
        list.add(8);
        System.out.println(list);
        // get element

        int element = list.get(1);
        System.out.print(element);

        // Add element in between
        list.add(1,1);
        System.out.println(list);
        // set element
        list.set(0,5);
        System.out.print(list);
        // Delete element
        list.remove(3);
        System.out.print(list);
        //size
        int size = list.size();
        System.out.print("Size:"+size);
        // loops
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //sorting
        Collections.sort(list);
        System.out.print(list);
    }
}
