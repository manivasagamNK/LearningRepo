package com.projects.springproject.javaproject;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.util.StringUtils;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManipulation {


    public static void main(String[] args) {

        List<String> inputList = Arrays.asList("cat", "tiger", "lion", "go", "cow","goat");

        List<String> inputAList = Arrays.asList("bat","arjun","ani","cat");

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> dupList = Arrays.asList(1, 2, 2, 3, 4, 3, 4);

        List<Integer> sqrList = Arrays.asList(1, 2, 3);

        List<String> wordList = Arrays.asList("cat", "", "lion", null, "bat");

        List<List<Integer>> numArrList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );

        List<Employee> employeeList = Arrays.asList(
                new Employee("selva", 55000,"IT"),
                new Employee("vijay", 65000,"MEDIA"),
                new Employee("swathy", 60000,"IT")
        );

        List<List<String>> nested = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e")
        );

        List<String> resultList = inputList.stream().filter(input -> input.length() > 3).collect(Collectors.toList());
        System.out.println(resultList);


        List<Integer> evenNumList = numList.stream().filter(input -> input % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumList);


        List<String> empResultList = employeeList.stream().filter(emp -> emp.getPrice() > 50000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(empResultList);

        List<Integer> distList = dupList.stream().distinct().collect(Collectors.toList());
        System.out.println(distList);

        List<String> nonNullList = wordList.stream().filter(word -> !StringUtils.isEmpty(word)).collect(Collectors.toList());
        System.out.println(nonNullList);

        List<Integer> sqrResult = sqrList.stream().map(sqr -> sqr * sqr).collect(Collectors.toList());
        System.out.println(sqrResult);

        List<String> upperList = inputList.stream().map(input -> input.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperList);

        List<Integer> lenList = inputList.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lenList);

        List<String> strList = sqrList.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(strList);

        List<String> empNameList = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(empNameList);


        int sum = dupList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        OptionalDouble avg = dupList.stream().mapToInt(Integer::intValue).average();
        System.out.println(avg.getAsDouble());

        int maxValue = dupList.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(maxValue);

        Integer multiValue = dupList.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiValue);

        long countValue = dupList.stream().filter(num -> num > 2).count();
        System.out.println(countValue);

        List<Integer> sortedList = dupList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedStrList = inputList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStrList);

        List<String> revSortedStrList = inputList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(revSortedStrList);

        List<String> sortedEmpList = employeeList.stream().sorted(Comparator.comparing(Employee::getPrice)).map(Employee::getName).collect(Collectors.toList());
        System.out.println(sortedEmpList);

        List<String> sortbyLength = inputList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(sortbyLength);

        Map<Integer, List<String>> groupByLen = inputList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLen);

        Map<String, List<String>> groupByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,HashMap::new,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(groupByDept);

        Map<Boolean, List<Integer>> partByEven = numList.stream().collect(Collectors.partitioningBy(input -> input % 2 == 0));
        System.out.println(partByEven);

        Map<Boolean, List<String>> partByLength = inputList.stream().collect(Collectors.partitioningBy(input -> input.length() > 3));
        System.out.println(partByLength);

        Map<Character, List<String>> groupByFirstChar = inputList.stream().collect(Collectors.groupingBy(input -> input.charAt(0), HashMap::new, Collectors.mapping(Function.identity(), Collectors.toList())));
        System.out.println(groupByFirstChar);

        Integer secondlargestNum = numList.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondlargestNum);

        List<String> top3 = inputList.stream().sorted((a,b)->Integer.compare(b.length(),a.length())).limit(3).collect(Collectors.toList());
        System.out.println(top3);

        List<Integer> sortByDup = dupList.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortByDup);

        List<String> mergeList=nested.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(mergeList);

        String input="java";
        Map<Character, Long> freqMap = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(freqMap);

        String []inputarr={"j","a","v","a"};
        Map<String, Long> freqArrMap = Arrays.stream(inputarr).collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(freqArrMap);
        
        String inStr = "selva";
        Map<Integer, Long> dupChar = inStr.chars().boxed().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        boolean res = dupChar.values().removeIf(value -> value > 1);

        Optional<String> longestChar = inputList.stream().sorted((a, b) -> Integer.compare(b.length(), a.length())).findFirst();
        System.out.println(longestChar.get());

        upperList=inputList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperList);

        List<String> startsAorted = inputAList.stream().filter(inputStr -> inputStr.startsWith("a")).sorted().collect(Collectors.toList());
        System.out.println(startsAorted);

        List<Integer> flatterList = numArrList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatterList);
    }
}

