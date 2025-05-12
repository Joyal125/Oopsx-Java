package OOPS4;
class Rectangle{
int length;
int breath;
    public int area(){
        return length*breath;
    }
    public int parameter(){
        return 2*(length+breath);
    }

}
public class OOPS4 {
    public static void main(String[]args){
Rectangle s1 = new Rectangle();
s1.length = 34;
s1.breath = 3;
System.out.println(s1.area());
System.out.println(s1.parameter());
    }
}
