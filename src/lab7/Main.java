package lab7;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        problema2var2();
    }
    public static void problema1var1(){
        List<Integer> numereIntregi = Arrays.asList(3,6,8,12);
        AtomicReference<Integer> sum= new AtomicReference<>(0);
        numereIntregi.forEach(n->{
            sum.set(sum.get() + n);
        });
        System.out.println(sum.get()/numereIntregi.size());

    }
    public static void problema2var1(){

        List<String> str = Arrays.asList("cuv1","cuv2","cuv3");
        str.forEach(n->{str.set(str.indexOf(n),n.toUpperCase());});
        System.out.println(str);
    }

    public static void problema1var2(){
        List<Integer> numereIntregi = Arrays.asList(3,6,8,12);
        double v = numereIntregi
                .stream()
                .mapToDouble(i -> i.doubleValue())
                .average()
                .orElse(0.0);
        System.out.println(v);
    }
    public static void problema2var2(){
        List<String> str = Arrays.asList("cuv1","cuv2","cuv3");
       List<String> newList = str.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
       System.out.println(newList);

    }
}
