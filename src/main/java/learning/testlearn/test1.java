package learning.testlearn;

public class test1  extends  Thread {
    int count = 0;



    public synchronized void run() {
        count++;
    }
    //thread extend-> thread obj created-> obj.start-> run method invoke == behaviour thread

    public static void main(String[] args) {
        test1 t= new test1();
        test1 t2= new test1();
        test1 t3= new test1();
       // test1 t= new test1();
       // Thread th = new test1();
        t.start();
      //  t.run();
        t2.start();
        t3.start();
        StringBuffer ss= new StringBuffer("hi");
        ss.append("ss").append("ssss");
        //StringBuffer ss= new StringBuffer("hi");




    }
}
