public class Throw {
    public static void main(String[] args){
        Throw t = new Throw();
        t.election(12);

    }
    public void election(int age){
        if(age<18){
            throw new ArithmeticException("not eligible for vote");
        }else {
            System.out.println("eligible for vote");
        }
    }
}
