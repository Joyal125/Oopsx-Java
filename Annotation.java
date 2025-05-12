
class Student{

    String name;
    int age;
    public void printInfo(){
        System.out.print(this.name);
        System.out.print(this.age);
    }
}

public class Annotation{
public static void main(String[]args){


    Student s1 = new Student();
    s1.age = 23;
    s1.name = "j.d";
    s1.printInfo();
}
}



