abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}






public class Exception {
    public static void main (String[]args){
        Chicken chicken= new Chicken();
        chicken.walk();
        Horse horse = new Horse();
        horse.walk();
    }
}
