package learning.testlearn;

import java.util.*;
import java.util.stream.Collectors;

public class al {
    public static void main(String[] args) {
        //Find the second largest salary of an employee using Java 8

        List<Integer> empSalary= new ArrayList<>();

        empSalary.add(100);
        empSalary.add(200);
        empSalary.add(300);
        empSalary.add(400);

        System.out.println(empSalary.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().get());

        String s = "aabbcdde";
        List<String> list = Arrays.asList(s.split(""));
       // list.stream().filter(i -> i).findFirst()
        System.out.println(list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).
                entrySet().stream().filter(t->t.getValue()==1).map(Map.Entry::getKey).findFirst().get());
        System.out.println(list);


        int nums[]= {3,2,0};

        Arrays.sort(nums);

        for(int i:nums){
            System.out.print(i);
        }

        for(int i=0;i< nums.length;i++){

        }

    }
}
