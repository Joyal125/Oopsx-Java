package OOPS;
class Employee{
    int Salary;
    String name;
    public int getSalary(){
        return Salary;


}
public String getName(){
        return name;
}
public void setName(String n){
        name = n;
}

}
public class OOPS {
    public static void main(String[] args) {
Employee employee = new Employee();
employee.setName("CodeWithJ.D");
System.out.println(employee.getName());
employee.Salary = 324;
System.out.println(employee.getSalary());
    }
}
