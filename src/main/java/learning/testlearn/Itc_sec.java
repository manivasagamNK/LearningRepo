package learning.testlearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Itc_sec {
    public static void main(String[] args) {
        List<Integer> newList= new ArrayList<>();
        newList.add(2);
        newList.add(1);newList.add(1);newList.add(3);
        newList.add(1);newList.add(4);newList.add(3);

        System.out.println(newList);

       // System.out.println(newList.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())));

        System.out.println(newList.stream().collect(Collectors.groupingBy(s->s,HashMap::new, Collectors.counting())).entrySet().stream()
                .filter(Entry->Entry.getValue()>=2) .map(Map.Entry::getKey).collect(Collectors.toList()));

        int tValue=4;
        //2

        HashMap<Integer,Integer>newHashmap= new HashMap<>();

        for(int i=0;i<newList.size();i++){
            if(newHashmap.containsKey((i))){
                newHashmap.put(i,newHashmap.get(i)+1);
            }
            else{
                newHashmap.put(i,1);
            }
        }
      //  System.out.println(newHashmap);


    }
}
