abstract class Tool {
    static void Info() {
        System.out.print("Print the info");
    }

    abstract void use();
}
    class Hammer extends Tool {
        void use() {
            System.out.print("The Tool is Ready");
        }
    }



public class OOPS24 {
    public static void main(String[] args) {
Hammer s1 = new Hammer();
s1.Info();
    }
}
