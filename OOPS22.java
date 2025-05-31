
abstract class Device {
    public void Power() {
        System.out.print("Power is ON");
    }

    abstract void use();
}
    class Laptop extends Device{
        void use(){
            System.out.print("Device is used to use");
        }
    }


public class OOPS22{
    public static void main(String[] args) {
        Laptop s1 = new Laptop();
        s1.Power();
    }
}