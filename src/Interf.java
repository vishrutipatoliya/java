public class Interf {
    public static void main(String[] args){
        SubIServiceProvider s = new SubIServiceProvider();
        s.service();
        s.always();
        s.stop();

    }

}
interface ServiceProvider extends ServiceAva,Stop{
    void service();
}
 class SubIServiceProvider implements ServiceProvider{
    public void service(){
        System.out.println("service are provide");

    }
     public void always(){
        System.out.println("always available");

     }
    public void stop(){
        System.out.println("service stop");

     }

}
interface ServiceAva{
    void always();

}
interface Stop{
    void stop();
}

