package multithreadingpkg;

public class MovieBookApp extends  Thread{
    static BookTheaterSeat v;
    int seat;
    public void run(){
        System.out.println();
        v.bookSeat(seat);
    }
    public static void main(String[] args){

         v = new BookTheaterSeat();
         MovieBookApp adi = new MovieBookApp();
         adi.seat=6;
         adi.start();
        MovieBookApp asha = new MovieBookApp();
        asha.seat=3;
        asha.start();




    }
}
class BookTheaterSeat{
    int total_seat=10;
     void bookSeat( int seat){
         //synchronized block
         synchronized(this){


        if(total_seat>=seat){
            System.out.println(seat+"seat book successfully");
            total_seat = total_seat-seat;
            System.out.println(total_seat+"seat left");


        } else {
            System.out.println("seat not book ");

        }}

    }
    
}
