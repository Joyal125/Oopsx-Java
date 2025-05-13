package OOPS7;
class Student2{
    String name;
    int rollNumber;
    int marks;
    public void system(){
        System.out.println("Displaying the Data");
    }
    public void printName(){
        System.out.println(this.name);
    }
    public void printrollNumber(){
        System.out.println(this.rollNumber);
    }
    public void printmarks(){
        System.out.println(this.marks);
    }
}
public class OOPS7 {
    public static void main(String[]args){
        Student2 s1 = new Student2();
        s1.name = "Harsh";
        s1.rollNumber = 76;
        s1.marks = 56;
        
        Student2 s2 = new Student2();
        s2.name = "kumar";
        s2.rollNumber = 34;
        s2.marks = 67;
        s1.system();
        s2.printName();
        Student2 s3 = new Student2();
        s3.rollNumber = 56;
        s3.printrollNumber();
        Student2 s4 = new Student2();
        s4.marks = 45;
        s4.printmarks();

    }


}
