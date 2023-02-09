public class ExceptionHandling {
    public  static void main(String[] args){
        try{
            int a = 40;
            int b = 0;
            int c = a/b;
        }catch (ArithmeticException arth){
            System.out.println(arth);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally block execute..");
        }
    }
}
