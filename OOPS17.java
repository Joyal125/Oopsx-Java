package OOPS17;

interface Shape{
    int radius = 9;
    public void area();
}
class Circle implements Shape{
    public Double calculates(){
        return 3.14*radius*radius;
    }
    public void area(){
        System.out.println("Print the area of Circle");
    }

}
public class OOPS17 {
    public static void main(String[]args){
Circle c1 = new Circle();
c1.calculates();
c1.area();
System.out.print(c1.calculates());
    }
}
