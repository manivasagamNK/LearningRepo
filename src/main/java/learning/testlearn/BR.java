package learning.testlearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.stream.Collectors;

public class BR {
    public static void main(String[] args) {
        String str= "StringJavast";

        int ar[] ={0,1,4,3,0,8,9,0};

        int res[]= new int[ar.length];

        int residx=0;

        for(int num:ar){
            if(num!=0){
                res[residx++]=num;
            }
        }

        System.out.println(str.chars().mapToObj(s->(char)s).collect(Collectors.toSet()));

        System.out.println( str.toLowerCase().chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(s->s, HashMap::new,Collectors.counting())).
                entrySet().stream().filter(r->r.getValue()==2).map(Map.Entry::getKey).collect(Collectors.toList()));


       // str.chars().filter(Character::isLetterOrDigit).mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());

        int left=0;
        int right=str.length()-1;
        str= str.replace("[^a-zA-Z0-9]","").toLowerCase();
        while(left<right){
        if(str.charAt(left)!= str.charAt(right)){
           // return false;
        }
        left++;
        right--;

        }
//return true;

    }
}
