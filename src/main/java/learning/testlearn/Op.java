package learning.testlearn;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Op {
    public static void main(String[] args) {
        // Top 3 repeated elements from an integer array in java
        //1,2,3,3,3,3,3,5,5,4,4,4,4,4,7,8,9,6,6,6,6,6,6,0,10,10,11,12,23

        int ar[]= {1,2,3,3,3,3,3,5,5,4,4,4,4,4,7,8,9,6,6,6,6,6,6,0,10,10,11,12,23};

        HashMap<Integer,String>valueMap= new HashMap<>();
        for(int i=0;i<ar.length;i++){
            if(valueMap.containsKey(ar[i])){
                valueMap.put(i,valueMap.get(i)+1);
            }

        }


        System.out.println("num");
        List <Integer>sss = Arrays.stream(ar).boxed().collect(Collectors.groupingBy(s->s, HashMap::new, Collectors.counting())).entrySet().stream()
                .filter(u->u.getValue()==2).limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(sss);



        List<Integer> sslist= new ArrayList<>();

        sslist.add(1);
        sslist.add(2);

        sslist.add(3);
        sslist.add(4);
        sslist.add(5);

        String st= "My name is Manivasagam";
        System.out.println(Arrays.stream(st.split(" ")).max(Comparator.comparingInt(String::length)).get());

        System.out.println(sslist.stream().filter(s->s%2==0));

        System.out.println(sslist.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().get());

        // Given a list of strings,
        // write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
        //
        //



        List<String> strlist= Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        System.out.println(strlist.stream().filter(s->s.contains("a")).count());


        //Write a program to find the longest string in a list of strings using Java Stream API.
        System.out.println(strlist.stream().max(Comparator.comparing(String::length)).get());

        //Write a program to find the frequency of each element in a list of integers using Java Stream API

        List<Integer>intList= Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);

        System.out.println(intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));


        List<Integer>ss= Arrays.asList(2,3,4,6);
        List<Integer>rr = Arrays.asList(4,15,17);

        List<Integer>cList= new ArrayList<>();
        cList.addAll(ss);
        cList.addAll(rr);

        System.out.println("PrimeNumber"+ cList.stream().filter(Op::isPrime).distinct().collect(Collectors.toList()));

    //intStream.rangeClosed(2,(int)Math.sqrt(i)).alllMatch(r-> i %r !=0);

    }

    private static boolean isPrime(Integer i) {
        if (i<=1) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(i)).allMatch(n->i%n !=0);
    }
}
