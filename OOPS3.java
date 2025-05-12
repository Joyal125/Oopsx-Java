package OOPS3;
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}
public class OOPS3{
    public static void main(String[]args){
square sq = new square();
sq.side = 3;
System.out.println(sq.area());
System.out.println(sq.parameter());

    }
}
