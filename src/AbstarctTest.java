public class AbstarctTest extends Electronics{
    public  static  void main(String[] args){
Electronics e = new AbstarctTest();
e.mouse();


    }

    @Override
    void mouse() {
        System.out.println("Mouse is work..");
    }

    @Override
    void keyboard() {

    }

    @Override
    void phone() {

    }
}
abstract class Electronics{
    abstract void keyboard();
    abstract void mouse();
    abstract void phone();
}
