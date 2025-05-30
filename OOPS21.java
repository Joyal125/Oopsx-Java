 abstract class Animal3{
    abstract void MakeSound();
 }
  class Cat extends Animal3{
    void System(){
        System.out.print("CAt");
    }
    void MakeSound(){
        System.out.print("Meow");
    }
 }

public class OOPS21{
    public static void main(String[] args) {
Cat s1 = new Cat();
s1.MakeSound();

    }
}