class MobilePhone1{
    private String Brand;
    private String Model;
    private int Price;


    public String getBrand(){
        return Brand;
    }
    public void setBrand(String n){
        Brand = n;
    }
    public String getModel(){
        return Model;
    }
    public void setModel(String i){
        Model =i;
    }
    public int getPrice(){
        return Price;
    }
    public void setPrice(int j){
        Price = j;
    }
}


public class OOPS33 {
    public static void main(String[] args) {
MobilePhone1 s1 = new MobilePhone1();
s1.setBrand("Samsung");
System.out.println("Brand:"+s1.getBrand());
s1.setPrice(28000);
System.out.println("Price:"+s1.getPrice());
s1.setModel("S series");
System.out.println("Model:"+s1.getModel());
    }
}
