package multithreadingpkg;

public class PrioritiesEx {
    public static void main(String[] args){
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("parent priority "+Thread.currentThread().getPriority());

        test2 t = new test2();
        t.setPriority(3);
        t.start();


    }
}
class test2 extends Thread{
    public  void run(){
        System.out.println("child thread ");
        System.out.println("child priority "+Thread.currentThread().getPriority());

    }

}