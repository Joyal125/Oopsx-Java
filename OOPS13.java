interface Walkable{
    public  void walk();
}
interface Runnable{
   public  void Run();
}

class Human implements Walkable,Runnable {
    public void Park(){
        System.out.print("A man in the park");
    }
    public void walk(){
        System.out.print("A man walk in the park");
    }
    public void Run(){
        System.out.print("A man run in the park");
    }





}
public class OOPS13{
    public static void main(String[]args){
        Human h1 = new Human();
        h1.walk();
        h1.Run();

    }
}
