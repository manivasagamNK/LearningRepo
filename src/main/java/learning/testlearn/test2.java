package learning.testlearn;

public class test2 implements Comparable<test2>{
    String name;
    int age;

    test2(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(test2 testtt) {
        if (age< testtt.age) {
            return -1;
        }
        if(age> testtt.age) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        test2 tt= new test2("mani",15);
        test2 ff = new test2("gopal",12);
        System.out.println( tt.compareTo(ff));
    }
}
