package OOPS10;
class Car{
    String Brand ;
    String Model;
    int Price;
    public void Detail(){
        System.out.println("Car details are given below");

    }
    public void PrintBrand(){
        System.out.println(this.Brand);
    }
    public void PrintModel(){
        System.out.println(this.Model);
    }
    public void PrintPrice(){
        System.out.println(this.Price);
    }

}

public class OOPS10{
    public static void main(String[]args){
Car s1 = new Car();
s1.Brand = "TATA";
s1.Model = "latest";
s1.Price = 34;
        s1.Detail();
s1.PrintBrand();
s1.PrintModel();
s1.PrintPrice();

    }
}
