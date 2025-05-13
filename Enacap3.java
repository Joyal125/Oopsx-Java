class Rectangle1{

    private int length;
    private int width;

    public int getWidth() {
        return length*width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return 2*(length+width);
    }

    public void setLength(int length) {
        this.length = length;
    }
}

public class Enacap3 {
    public static void main(String[]args){
Rectangle1 s1 = new Rectangle1();

s1.setWidth(32);
s1.setLength(54);
System.out.println(s1.getLength());
System.out.println(s1.getWidth());
    }
}
