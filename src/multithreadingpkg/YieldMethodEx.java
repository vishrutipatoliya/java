package multithreadingpkg;

public class YieldMethodEx extends Thread{
    public static void main(String[] args){
        Test t = new Test();
        t.start();
        for (int i=0;i<=5;i++){
            System.out.println(i+"  "+Thread.currentThread().getName());


        }



    }
    public void run(){
        Thread.yield();

        for (int ii=0;ii<=5;ii++){

            System.out.println(ii+"  "+Thread.currentThread().getName());
        }

    }
}
