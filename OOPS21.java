interface vehicle1{
    default void Start(){
        System.out.print("The car is start");
    }
    public void Drive();

    class Car implements vehicle1{
        public void Drive(){
            System.out.print("Thw car is Starting");
        }
    }
}
public class OOPS21{
    public static void main(String[] args) {
        Car s1 = new Car();
        s1.Start();

    }
}