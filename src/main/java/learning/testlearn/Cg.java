package learning.testlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cg {
    public static void main(String[] args) {
        //Print prime numbers between 100 and 200 in reverse order

        Integer ar1[] = {1,2,3,7,3,9,10,2,9};
        Integer ar2[] = {11,12,13,14,4,11,12,14};

        IntStream.rangeClosed(100,200).filter(s->IntStream.rangeClosed(2,(int)Math.sqrt(s)).allMatch(i->s%i !=0)).forEach(System.out::println);

       // Arrays.asList(ar1).stream().distinct().

       // List<List<Integer>> newList= new ArrayList<>();



        //for(int i:ar1){
          //  List.ad
        //}


        //IntStream.rangeClosed(100,200).map(s->s).collect(Collectors.toList());

    }


}
