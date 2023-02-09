package multithreadingpkg;
import java.lang.Thread;

public class DaemonThreadEx {
    public static void main(String[] args){
        Test2 t = new Test2();
        t.setDaemon(true);
        t.start();
        System.out.println(Thread.currentThread().isDaemon());

    }

}
 class Test2 extends Thread{
    public void run(){
        System.out.println("daemon method");
    }
 }