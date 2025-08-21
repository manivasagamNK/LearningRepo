package learning.testlearn;

import java.util.Arrays;
import java.util.Comparator;

public class ss {
    public static void main(String[] args) {
        String s= "My name is Manivasagam";

        System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get());


    }
}
