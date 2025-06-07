class Student2 {
    private int RollN;
    private String Name;
    private int Marks;

    public int getRollN() {
        return RollN;
    }

    public void setRollN(int k) {
        RollN = k;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }

    public int getMarks() {
return Marks;
    }
    public void setMarks(int j){
        Marks = j;
    }

}



public class OOPS32 {
    public static void main(String[] args) {
Student1 s1 = new Student1();
s1.setName("J.D");
System.out.println(s1.getName());
s1.setMarks(70);
System.out.println(s1.getMarks());


    }
}
