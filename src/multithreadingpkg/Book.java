package multithreadingpkg;

public class Book {
    public static void main(String[] args) throws InterruptedException {
        Totalearnings t = new Totalearnings();

        t.start();
        System.out.println("total earnings "+t.total);
        synchronized (t){
            t.wait();
            System.out.println("total earnings "+t.total);

        }

    }
}
class Totalearnings extends Thread{
    int total=0;



        public void run() {
            synchronized (this)

            {
        for (int i = 0; i <= 10; i++) {
            total = total + 100;
        }
        this.notify();
    }
    }
}