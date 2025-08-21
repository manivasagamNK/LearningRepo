package learning.testlearn;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Alti {
    Map<Integer,Node>map= new HashMap<>();
    int capacity;
    Node head= new Node(0,0);
    Node tail=new Node(0,0);

    Alti(int capacity){
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }

    private int get(int key){
        if(map.containsKey(key)){
            Node data=map.get(key);
            //move the data to top
            //remove the data
            remove(data);
            //insert
            insert(data);
            return data.value;
        }

        return -1;
    }

    private void put(int key,int value){
        //if value is already present we move it to top

        if(map.containsKey(key)){
            remove(map.get(key));
        }
        //if cache full
        if(capacity==map.size()){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void insert(Node node){

        map.put(node.key, node);
    Node headnext= head.next;
    head.next=node;
    node.prev=head;

    headnext.prev=node;
    node.next=headnext;

    }
    private void remove(Node node) {
    map.remove(node.key);
    node.prev.next= node.next;
    node.next.prev=node.prev;
    }


    class Node{
        int key,value;
        Node prev,next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    public static void main(String[] args) {
        Alti cache = new Alti(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2)); // -1
        cache.put(4, 4); // evicts key 1
        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4
    }
}
