package learning.testlearn;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class executeclass  {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,50).filter(executeclass::isprime).forEach(System.out::println);
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        System.out.println(nestedList.stream().flatMap(List::stream).collect(Collectors.toList()));

        List<String>ss = Arrays.asList("apple","orange","mani","ssss","appls","orangg","s");

        System.out.println(ss.stream().collect(Collectors.groupingBy(String::length)));



      Map<Character,Long>sssss=s1.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));
        System.out.println(sssss);
        //s1.chars().mapToObj(s-> char(s)).collect(Collectors.groupingBy(Function.identity(),HashMap::new, Collector.counting())).
          //      entryset.stream.filter(entry->entry.getvalue==1).map(Map.Entry::getKey)
        if(s1==s3){
            System.out.println("Hi");
        }

        if(s1.equals(s3)){
            System.out.println("Hiii");

        }

        test1 t = new test1();
       // t.display();
        // t.gopal();

       // test2 tt = new test2();
        String str = "mani";


        List<String> csk= new ArrayList<>();
        csk.add("mahi");
        csk.add("rutu");
        csk.add("ss");
        csk.add("rt");

      //  csk.stream().filter()

        List<cskclass> cskList= new ArrayList<>();
        cskList.add(new cskclass("dhoni",40,"5000"));
        cskList.add(new cskclass("rutu",25,"500"));
        cskList.add(new cskclass("jaddu",30,"1500"));

        System.out.println("Max age"+ cskList.stream().max(Comparator.comparing(cskclass::getPlayerage)).get());

        cskList.stream().sorted(Comparator.comparing(cskclass::getPlayerage).reversed()).skip(1).collect(Collectors.toList());
        //List.stream().max(Integer::compare);


       // cskList.stream().map(cskclass::getPlayerage).collect(Collectors.toList());
      //  Collections.sort(cskList);
        //people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
       // System.out.println(cskList.stream().sorted((p1,p2)->Integer.compare(p1.playerage,p2.playerage)).collect(Collectors.toList()));
        //cskList.stream().sorted(Comparator.comparing(test2).)

        System.out.println(cskList.stream().filter(s->s.playerage> 25).
                        filter(s->s.playername.startsWith("d"))
                .map(cskclass::getPlayername).collect(Collectors.toList()));

        String st = null;

        //String safe=


      //  Optional<String> safe = Optional.ofNullable(cskList::getPlayerName);

       // System.out.println(safe.orElse("Default"));

        //safe.get();

        Optional<String> name = Optional.of("gopal");

        if(!name.isPresent()){
            System.out.println("hi");
        }
        System.out.println(name.get());



        // System.out.println(csk.stream().filter(s->s.length()>3).collect(Collectors.toList()));
    }

    private static boolean isprime(int i) {
        if (i<=1) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(i)).allMatch(n->i%n!=0);
    }

}

