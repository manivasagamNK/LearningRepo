package learning.testlearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class itc {
    public static void main(String[] args) {
        // list of Sting say
        List<String> fruits = Arrays.asList("orange", "pineapple","apple", "kiwi", "mango","straberry","kiwi","watermelon");
        //make filter character length greater than 5 , convert strings to uppercase ,sort based on length of character and print

        System.out.println(fruits.stream().filter(s->s.length()>5).map(String::toUpperCase).sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()));
    }
}
