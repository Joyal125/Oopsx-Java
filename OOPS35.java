class Shape34 {
    Double length = 4.0;
    Double Breath = 7.0;
    Double Radius = 5.0;

    public Double area() {
        return length * Breath;

    }

    public double Circle() {
        return 3.14 * Radius * Radius;
    }



}






public class OOPS35 {
    public static void main(String[] args) {
        Shape34 s1 = new Shape34();
s1.area();
System.out.println("Area of Rectangle:"+s1.area());
System.out.println("Area of Circle:"+s1.Circle());

    }
}
