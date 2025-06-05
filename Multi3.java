class MyThread2 extends Thread {
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.print(getName()+"is running with print");
            Thread.yield();
        }
    }
}



public class Multi3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("low Priority Thread");
        t2.setName("high Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}