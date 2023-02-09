package java8features;

public class LambdaEx {

    public static void main(String[] args){
        Printer p = new Printer(){
            @Override
            public void print() {
                System.out.println("print ");
            }
        };
        p.print();
        Printer2 p2 =()->{
            System.out.println("print2 ");


        };
p2.print2();
    }
}
interface Printer{
    public void print();
}
interface Printer2{
    public void print2();
}