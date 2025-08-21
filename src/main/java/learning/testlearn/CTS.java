package learning.testlearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CTS {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,20,2,4,5,80);

        System.out.println(

        al.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).distinct().skip(1).findFirst().get());

        String input = "abc";

        System.out.println("Permutations:");
        for (int i = 0; i < input.length(); i++) {
            Character c= input.charAt(i);
            for (int j = 0; j < input.length(); j++) {
                Character d= input.charAt(j);
                if (d == c) continue;
                for (int k = 0; k < input.length(); k++) {
                    Character e= input.charAt(k);

                    if (e == d || e == c) continue;
                    System.out.println("" + input.charAt(i) + input.charAt(j) + input.charAt(k));
                }
            }
        }
    }
}
