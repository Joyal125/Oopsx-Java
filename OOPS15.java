class Monkey{
    public void jump(){
        System.out.print("The Monkey is Jumping");
    }
    public void bite(){
        System.out.print("The Monkey is biting");
    }
    interface BasicAnimal{
        void eat();
        void sleep();
    }
    class Human extends Monkey implements BasicAnimal{
        void human(){
            System.out.print("human");
        }
        public void eat(){
            System.out.println("eat");
        }
        public void sleep(){
            System.out.print("sleeping");
        }
    }
}


public class OOPS15 {
    public static void main (String[]args){
        Monkey m1 = new Monkey();
        m1.jump();
        m1.bite();

    }
}
