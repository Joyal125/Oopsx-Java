interface animal{
    public void MakeSound();
}
class Dog implements animal{
    public void Start(){
        System.out.print("The Start Braking");
    }
    public void MakeSound(){
        System.out.println("Brake");
    }

}

public class OOPS19 {
    public static void main(String[] args) {
Dog q1 = new Dog();
q1.MakeSound();
q1.Start();

    }
}
