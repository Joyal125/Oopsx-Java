import java.lang.Exception;

class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        try {
            Thread.sleep(4000);
        }catch (Exception e){

        }
    }
}




public class multi {
    public static void main(String[] args) {
        MyThread s1 = new MyThread();
        s1.start();
        System.out.println("hii");
    }
}
