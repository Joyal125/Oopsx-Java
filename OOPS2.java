package OOPS2;
class Cellphone{
    public void ringing(){
        System.out.println("Ringing........");
    }
    public void vibrating(){
        System.out.println("viberating..............");
    }
    public void callFriend(){
        System.out.println("calling......");
    }
}
public class OOPS2 {
    public static void main(String[]args){
       Cellphone s2 = new Cellphone();
       s2.callFriend();
       s2.ringing();
       s2.vibrating();
    }
}
