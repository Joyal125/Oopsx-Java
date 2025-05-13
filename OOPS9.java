package OOPS9;
class Circle{
    double radius;

    public double area(){
        return 3.142* radius * radius;
    }
    public double circumference(){
        return 2*3.142*radius;
    }
}
public class OOPS9{
    public static void main(String[]args){
Circle s1 = new Circle();
s1.radius = 4;
System.out.println(s1.area());
System.out.println(s1.circumference());
    }
}
