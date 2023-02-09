package multithreadingpkg;

public class PreventThreadmethod {
    public static void main(String[] args){
        Test t = new Test();
//        t.run();
        t.start();
        Test t1 = new Test();
//        t.run();
        t1.start();


    }
}
 class Test extends Thread{
        public void run(){
            for (int i=0;i<=5;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i+"  "+Thread.currentThread().getName());
            }

        }
}
