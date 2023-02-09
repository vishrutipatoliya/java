public class Throws {
    public static void main(String[] args){
        Throws ts = new Throws();
        try {
            ts.Division(50,0);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }


    }
    public int Division(int a,int b) throws ArithmeticException{
        int c = a/b;
        return c;
    }
}
