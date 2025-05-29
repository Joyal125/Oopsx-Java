interface Vehicle{
    public void Start();
}
class Car implements Vehicle{
    public void Blowhorn(){
        System.out.println("pee pooo ");
    }
    public void Start(){
        System.out.println("Vehicle is Starting");
    }
}

public class OOPS18 {
    public static  void main(String[]args){
Car c2 = new Car();
c2.Blowhorn();
c2.Start();
    }
}
