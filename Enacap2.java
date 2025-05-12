class Student1{
    private String Name;
    private int Marks;

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

public class Enacap2 {
    public static void main(String[]args){
Student1 p1 = new Student1();
p1.setMarks(344);
p1.setName("J.D");
System.out.println(p1.getMarks());
System.out.println(p1.getName());
    }
}
