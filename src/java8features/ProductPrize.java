package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductPrize {
    String name;
    int prize;
    public ProductPrize(String name,int prize){
        this.name = name;
        this.prize=prize;

    }
    public static void main(String[] args){
        ProductPrize p1 = new ProductPrize("phone",10000);
        ProductPrize p2 = new ProductPrize("laptop",100000);
        ProductPrize p3 = new ProductPrize("laptop",100000);

        List<ProductPrize> ls = new ArrayList<>();
        ls.add(p1);
        ls.add(p2);
        ls.add(new ProductPrize("mouse",200));
        List<ProductPrize> st = ls.stream().filter(p->p.prize>50000).collect(Collectors.toList());
        st.forEach(e->{
            System.out.println(e.prize+" "+e.name);
        });
        int tatalPrize = ls.stream().map(p->p.prize).reduce(5,(sum,prize)->sum+prize);
        System.out.println(tatalPrize);

        int totalPrize2 = ls.stream().map(p->p.prize).reduce(0,Integer::sum);

        int totalPrize3 = ls.stream().collect(Collectors.summingInt(p->p.prize));
        System.out.println(totalPrize3);
        int min = ls.stream().map(p->p.prize).min((x,y)-> x.compareTo(y)).get();
        System.out.println(min);
        int max = ls.stream().map(p->p.prize).max((x,y)->x.compareTo(y)).get();
        System.out.println(max);
        long con = ls.stream().filter(p->p.prize < 10000).count();

        // List to set convert remove duplicate value using set
        Set<Integer> setToList = ls.stream().filter(p->p.prize >10000).map(p->p.prize).collect(Collectors.toSet());
        System.out.println(setToList);
        Map<Integer,String> listToMap = ls.stream().collect(Collectors.toMap(p->p.prize,p->p.name));
        System.out.println(listToMap);



        }




}
