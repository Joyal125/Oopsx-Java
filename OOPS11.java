package OOPS11;
class Calculator{
    int a = 467;
    int b = 656;
    public int add(){
        return a+b;
    }
    public int Subtract(){
        return a-b;
    }
    public int Divide(){
        return a/b;
    }
    public int Multiply(){
        return a*b;
    }

}
public class OOPS11{
    public static void main(String[]args){
Calculator s1 = new Calculator();

System.out.println(s1.Subtract());
System.out.println(s1.Multiply());
System.out.println(s1.Divide());
System.out.print(s1.add());

    }
}
