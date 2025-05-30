import java.util.ArrayList;
import java.util.Iterator;


public class HashMap {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.add("Ravi");
        names.add("Anjali");
        names.add("sohan");
        names.add("Priya");
        names.add("amit");
      Iterator<String> it = names.iterator();

      while(it.hasNext()){
          String elem = it.next();
          System.out.print(elem);
          if(elem.startsWith("A")){
              it.remove();
          }
      }
      System.out.print(names);
   }
}
