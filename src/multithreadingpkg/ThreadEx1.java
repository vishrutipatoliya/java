package multithreadingpkg;
import java.lang.Thread;

public class ThreadEx1  {
    public static void main(String[] args){

        MyThread t1 = new MyThread();
        t1.start();
        MyThread1 t2 = new MyThread1();
        t2.start();




    }

}
class  MyThread extends Thread{
    public void run(){
        System.out.println("animation");


    }
}
class  MyThread1 extends Thread{
    public void run(){
        System.out.println("play music");


    }
}