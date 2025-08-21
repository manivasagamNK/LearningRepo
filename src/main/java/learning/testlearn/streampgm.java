package learning.testlearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streampgm {
    public static void main(String[] args) {
        String ss="swiss";
        System.out.println( ss.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(), HashMap::new,Collectors.counting())).entrySet()
                 .stream().filter(entry->entry.getValue()==1L).map(Map.Entry::getKey).findFirst().get());
        //
        //sslist.stream.sorted(Comparator.comparing(Employee::getSalary)).reversed.skip(1).findFirst().orElse(null);
        //
        //Map<Character,Long>ssmap= new hashMap();
        //
        //for(int i=0;i<str.length;i++)
        //Character c= str.charAt(i);
        //if(ssmap.containsKey(c))
        //{
        //ssMap.put(C, ssMap.getOrDefault(C,0)+1)
        //}


        HashMap<String,Integer> ghashmap= new HashMap<>();
        ghashmap.put("apple",10);
        ghashmap.put("orange",20);
        ghashmap.put("grapes",30);
        ghashmap.put("Greenapple",10);
        ghashmap.put("Greenorange",20);
        ghashmap.put("brackgrapes",30);

       // ghashmap.entrySet().stream().filter(Mpa)

      for(Map.Entry<String,Integer> s:ghashmap.entrySet()){
          if(s.getValue()<20){
              System.out.println(s.getKey());
          }
      }




        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "(()";

        System.out.println(checkPara(test1));
       // System.out.println(s);

    }

    private static Boolean checkPara(String test1) {
        Stack<Character>c= new Stack<>();

        for(int i=0;i<test1.length();i++){
            Character f= test1.charAt(i);

            if(f=='(' || f=='[' || f=='{')
                c.push(f);

            else if (f==')'|| f==']' || f=='}') {
                if(c.isEmpty()){
                    return false;
                }
                char Top= c.pop();

                    if(!(Top=='(' && f==')' || Top=='[' && f==']'
                        || Top=='{' && f== '}')) {
                        return false;

                    }

            }
        }

        return c.isEmpty();
    }
}
