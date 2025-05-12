package OOPS6;
class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius =  radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.14*radius*radius*+2*3.142*radius*height;
    }
    public double volume(){
        return 3.142*radius*radius*height;
    }
}
public class OOPS6{
    public static void main(String[]args){
Cylinder s1 = new Cylinder();
s1.setHeight(12);
System.out.println(s1.getHeight());
s1.setRadius(3);
System.out.println(s1.getRadius());
System.out.println(s1.surfaceArea());
System.out.print(s1.volume());
    }
}
