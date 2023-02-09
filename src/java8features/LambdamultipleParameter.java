package java8features;

public class LambdamultipleParameter {
    public static void main(String[] args) {
        Area a = (int x, int y) -> {

            return x * y;


        };
        System.out.println(a.areaCal(4, 7));

        Area a2 = (x, y) -> (x * y);
        System.out.println(a2.areaCal(40, 7));


    }
}

interface Area {
    public int areaCal(int a, int b);
}
