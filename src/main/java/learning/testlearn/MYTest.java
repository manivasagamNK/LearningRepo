package learning.testlearn;

import java.util.*;
import java.util.stream.Collectors;

public class MYTest {
    public static void main(String[] args) {
        // return the top 3 most frequent words with their counts, sorted by frequency (desc) and then alphabetically (asc) in case of a tie.
        //
        //"apple", "banana", "Apple", "orange", "banana", "apple",
          //  "kiwi", "orange", "banana", "ORANGE", "kiwi", "kiwi", "kiwi"
        //
        //Expected output
        //  apple=3,
        //  banana=3,
        //  kiwi=4

        List<String> strList= Arrays.asList( "apple", "banana", "Apple", "orange", "banana", "apple",
                "kiwi", "orange", "banana", "ORANGE", "kiwi", "kiwi", "kiwi");
       HashMap<String,Long>newHashMap= strList.stream().collect(Collectors.groupingBy(s->s, HashMap::new,Collectors.counting()));

        System.out.println(newHashMap);

        //newHashMap.

       // System.out.println(strList.stream().collect(Collectors.groupingBy(s->s.toLowerCase(),Collectors.counting())).
         //       entrySet().stream().sorted(Comparator.reverseOrder(Map.Entry::comparingByValue)).collect(Collectors.toList()));


    }
}
