package learning.testlearn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.lang.StringBuffer;
import java.util.stream.Collectors;

public class TestTTDxc {
    public static void main(String[] args) {
        //Write a program using java 8 feature to reverse words of a given string.
        String input = "The hungry fox jumps on the rabbit";
        //output = "ehT yrgnuh xof spmuj no eht tibbar"

     //   Write a program using java 8 feature to filter name which are greater than 3 characters
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream().filter(s->s.length()>3).forEach(System.out::println);


        StringBuffer ss = new StringBuffer(input);
        System.out.println( ss.reverse());

        //input.chars().boxed().ma.mapToObj(s->(char)s).collect(Function.identity(),collect)
       // input.chars().boxed().forEach(StringBuffer::reverse);

      Arrays.stream(input.split(" ")).toList().stream().map(s->new StringBuffer(s).reverse()).forEach(System.out::print);

        //You are given an array of intervals where each interval is
        //represented as [start, end]. Merge all overlapping intervals and
        //return an array of the non-overlapping intervals that cover all the intervals in the input.
        //Input: [[1,3],[2,6],[8,10],[15,18]]
        //Output: [[1,6],[8,10],[15,18]]
       // int a[][]= [{1,3}, {2,6}, {8,10}, {15,18}];



        }

    }
