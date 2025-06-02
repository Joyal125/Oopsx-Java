interface Vehicle5 {
    default void Start(){
        System.out.print("Start the game");
    }
    public void Drive();
    class Car implements Vehicle5{
        public void Drive(){
            System.out.print("the Car is Started");
        }
    }
}





public class OOPS27 {
    public static void main(String[] args) {
Car s1 = new Car();
s1.Start();

    }
}
