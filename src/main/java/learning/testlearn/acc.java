package learning.testlearn;

import java.util.Arrays;

public class acc {
    public static void main(String[] args) {

        int[] arr= {1,2,3,5};



        for(int i=0;i<arr.length-1;i++){
                if(arr[i+1] - arr[i]>1) {
                int number= arr[i]+1;
                    System.out.println(number);
            }
        }

        int x=10;
        int y= x++ + ++x;
        System.out.println(y);



    }
}
