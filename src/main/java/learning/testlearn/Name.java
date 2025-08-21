package learning.testlearn;

import java.awt.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;



public class Name {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

  private    String firstName;
    private String lastName;

    public Name(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public static void main(String[] args) {
        HashMap<Integer,Name>newHashMap= new HashMap<>();
        newHashMap.put(1,new Name("Mani","N"));
        newHashMap.put(2,new Name("Ravi","A"));
        newHashMap.put(4,new Name("Dinesh","Bhai"));
        newHashMap.put(8,new Name("Raj","kumar"));

        HashMap<Integer,String>newHashMap1= new HashMap<>();
        newHashMap1.put(1,"mani");
        newHashMap1.put(2,"yugan");
        newHashMap1.put(4,"aji");
        newHashMap1.put(6,"Raj");

        Map<Integer,String>resMap=newHashMap1.entrySet().stream().sorted(Comparator.comparing(s->s.getValue().toLowerCase()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(s1,s2)->s1,LinkedHashMap::new));
        System.out.println(resMap);




        Map<Integer, Name> sortedMap = newHashMap.entrySet().stream().
               sorted(Comparator.comparing(s->s.getValue().firstName)).
                collect(Collectors.toMap(Map.Entry::getKey,
                    Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}
