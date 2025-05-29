package OOPS16;
interface Animal{
    public void MakeSound();
}
class Dog implements Animal{
    public void HeyAnimal(){
        System.out.println("Say Hey to the animal");
    }

    public Dog() {
        super();
    }

    public void MakeSound(){
        System.out.println("Brake ");
    }
}

public class OOPS16{
    public static void main(String[]args){
Dog d1 = new Dog();
d1.HeyAnimal();
d1.MakeSound();
    }
}
