import java.util.ArrayList;
import java.util.ListIterator;

public class HashMap3 {
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
            if(ele.length()<=4){
                it.set("bye");
            }
            System.out.print(names);
            int count = 0;


                String e= it.previous();
                count++;
                if(count == names.size()){
                    it.set("hello");
                }
            }
        }
    }
}
