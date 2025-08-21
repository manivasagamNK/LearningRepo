package learning.testlearn;

import java.util.*;
import java.util.stream.Collectors;

public class MPh {
    public static void main(String[] args) {
        List<List<Integer>> newList= new ArrayList<>();
        //[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        //
        //Write a function that returns a new list containing the second largest number from each sublist.
        //
        //Output: [2, 5, 8]
        List<Integer> intList= new ArrayList<>();
        intList.add(2);
        intList.add(5);
        intList.add(8);

        List<Integer>newList1 = new ArrayList<>();
        newList1.add(4);
        newList1.add(7);
        newList1.add(9);



        newList.add(intList);
        newList.add(newList1);

        Collections.sort(newList,Collections.reverseOrder());
        System.out.println(newList.get(1));

       // System.out.println(intList.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().get());



       // newList.stream().flatMap(s->s.stream()).sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().get();


        // Mississippi
        //{p=2, s=4, i=4, M=1

        String str= "Mississippi";

        HashMap<Character,Integer>newMap= new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character c= str.charAt(i);
        if(newMap.containsKey(c)){
            newMap.put(c, newMap.get(c)+1);
        }
        else {
            newMap.put(c,1);
        }
        }

        System.out.println(newMap);
    }
}
