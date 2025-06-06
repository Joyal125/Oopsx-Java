class Car1{
    private String Model;
    private int Year;

    public String getModel(){
        return Model;
    }
    public void setModel(String n){
        Model = n;
    }

    public int getYear(){
        return Year;
    }
    public void setYear(int i){
        Year = i;
    }
}




public class OOPS28 {
    public static void main(String[] args) {
        Car1 s1 = new Car1();
        s1.setModel("Mahindra Thar");
        System.out.println(s1.getModel());
        s1.setYear(2024);
        System.out.println(s1.getYear());
    }
}
