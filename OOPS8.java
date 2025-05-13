package OOPS8;
class rectangle3{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length*breath);
    }

}
public class OOPS8{
    public static void main(String[]args){
rectangle3 s1 = new rectangle3();
s1.breath = 3;
s1.length = 7;



System.out.println(s1.area());
System.out.println(s1.perimeter());
    }
}
