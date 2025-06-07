class person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name= n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int i){
        age = i;
    }


}



public class OOPS31 {
    public static void main(String[] args) {
person s1 = new person();
s1.setName("Code With J.D");
System.out.println(s1.getName());
s1.setAge(19);
System.out.println(s1.getAge());
    }
}
