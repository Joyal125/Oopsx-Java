package OOPS14;
interface A{
    public void Display();


}
interface B{
    public void Display();
}

 class Demo implements A,B{
    public void Display(){
        System.out.println("Display");
    }




}
public class OOPS14 {
    public static void main(String[]args){
        Demo Display = new Demo();
        Display.Display();
    }
}
