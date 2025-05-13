package Enacap4;
class Temperature{
    private double celsius;

    public double getCelsius() {
        return (celsius * 9/5)+32;


    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
public class Enacap4 {
    public static void main(String[]args){
Temperature s1 = new Temperature();
s1.setCelsius(23);
System.out.print(s1.getCelsius());
    }
}
