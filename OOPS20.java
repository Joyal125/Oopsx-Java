interface Flyable{
    public void fly();
}
interface Swimmable{
    public void Swim();
}
class Duck implements Flyable,Swimmable{
    public void fly(){
        System.out.println("The Bird are Flying in the Sky");
    }
    public void Swim(){
        System.out.println("The Fish are swimming in the river");
    }
}

public class OOPS20 {
    public static void main(String[] args) {
Duck D1 = new Duck();
D1.Swim();
D1.fly();
    }
}
