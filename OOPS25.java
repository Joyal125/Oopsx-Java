class Rectaangle5{
    int length =4;
    int breadth = 8;

    public double area(){
        return length*breadth;
    }
    public double Perimeter(){
        return 2*(length+breadth);
    }
    public void PrintInfo(){
        System.out.println("Print the area of Rectangle");
    }
}


public class OOPS25 {
    public static void main(String[] args) {
         Rectaangle5 s1 = new Rectaangle5();
         s1.area();
         s1.Perimeter();
         s1.PrintInfo();
         System.out.println(s1.area());
         System.out.println(s1.Perimeter());
    }
}
