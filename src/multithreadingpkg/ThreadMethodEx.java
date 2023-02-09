package multithreadingpkg;

public class ThreadMethodEx {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("vish");
        System.out.println(Thread.currentThread().getName());

//        System.out.println(2/0);
        MyThread3 t3 = new MyThread3();
        t3.start();
        t3.setName("adii");
        System.out.println(Thread.currentThread().isAlive());

    }

}
class MyThread3 extends Thread{
    @Override
    public void run(){
        System.out.println("thread task"+Thread.currentThread().getName());
    }


}