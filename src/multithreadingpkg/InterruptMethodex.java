package multithreadingpkg;

public class InterruptMethodex extends Thread{
    public void run(){
//        System.out.println(Thread.interrupted()); //status true ->false
        System.out.println(Thread.currentThread().isInterrupted());//status true ->true

        try {
            for (int i=0;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println(Thread.interrupted());


            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        InterruptMethodex i1= new InterruptMethodex();
        i1.start();
        i1.interrupt();

    }
}

