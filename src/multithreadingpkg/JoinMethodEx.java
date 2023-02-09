package multithreadingpkg;

public class JoinMethodEx {
    static Thread mainthread;

    public void run() throws InterruptedException {
        mainthread.join(1000);

        for (int ii=0;ii<=5;ii++){

            System.out.println(ii+"  "+Thread.currentThread().getName());
        }

    }
    public static void main(String[] args) throws InterruptedException {
            mainthread = Thread.currentThread();
            Test t = new Test();
            t.start();
//            t.join();
        Thread.sleep(1000);
            for (int i=0;i<=5;i++){
                System.out.println(i+"  "+Thread.currentThread().getName());


            }


    }

}
