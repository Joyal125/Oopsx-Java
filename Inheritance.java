package Inheritance;
class Circle{
    public void write(){
        System.out.print("The cicle is ");
    }

}
class Cylinder extends  Circle{
    public void write(){
        System.out.print("The cylinder is round in");
    }
}


public class Inheritance{
    public static void main(String[]args){
Circle s1 = new Circle();
s1.write();
    }
}
