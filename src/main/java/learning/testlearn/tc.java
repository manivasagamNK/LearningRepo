package learning.testlearn;

import ch.qos.logback.core.BasicStatusManager;

import javax.xml.transform.Source;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class tc {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (in lowercase)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
       tc t= new tc();
        System.out.println(t.isPalindrome("A man, a plan, a canal: Panama"));

        String str= "madam";
        String res = "";
        StringBuilder op = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            res= res+str.charAt(i);
            op.append(str.charAt(i));
        }
        if(res.equals(str)){
            System.out.println("yes palin");
        } else {
            System.out.println("noo");
        }

        List<Integer> ss= Arrays.asList(1,22,1110,33,1,33,22,44);


        System.out.println( ss.stream().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting())).entrySet().stream().
                filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList()));

        Set<Integer>  set= new HashSet<>();
        System.out.println( ss.stream().filter(s->!set.add(s)).collect(Collectors.toList()));




        //// Given a list of strings, find the frequency of each word using Java streams
        //"apple", "banana", "apple", "cherry", "banana", "apple", "grapes"

        List<String >sss= Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple", "grapes");

        System.out.println(sss.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));






    }
}
