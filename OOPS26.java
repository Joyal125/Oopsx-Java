interface Connectable{
    void connect();
}

abstract class Appliance{
    abstract void operator();
}
class WashingMachine extends Appliance implements Connectable{
    public void connect(){
        System.out.println("Connected to Power");
    }
    public void operator(){
        System.out.println("Washing the cloth");
    }
}




public class OOPS26 {
    public static void main(String[] args) {
WashingMachine s1 = new WashingMachine();
s1.operator();
s1.connect();
    }
}
