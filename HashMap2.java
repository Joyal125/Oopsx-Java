import java.util.ArrayList;
import java.util.ListIterator;

public class HashMap2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Anjali");
        names.add("sohan");
        names.add("Priya");
        names.add("amit");
        ListIterator<String> it = names.listIterator();
        while(it.hasNext()){
            String ele = it.next();
            System.out.print(ele);
        }
        System.out.print("prey");
        while(it.hasPrevious()){
            String LastValue = it.previous();
        }
    }
}
