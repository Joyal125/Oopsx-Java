abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    void fly() {
        System.out.println("The Eagle is flying high");
    }

    class Sparrow extends Bird {
        void fly() {
            System.out.println("The Sparrow is little in size");
        }
    }
}

public class OOPS23 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();

        Eagle.Sparrow sparrow = eagle.new Sparrow();
        sparrow.fly();
    }
}
