package learning.ds;

public class GMLinkedList {

    Node head;
    private void insert(int data) {
     Node newNode= new Node(data);

     if(head==null){
         head= newNode;
         return;
     }

     Node currentNode = head;

     while(currentNode.next!=null){
         currentNode= currentNode.next;
     }
    currentNode.next= newNode;

    }
    void display(){
        Node current= head;

        while(current!=null){
            System.out.print(current.data +"->");
            current= current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        GMLinkedList ss= new GMLinkedList();
        ss.insert(10);
        ss.insert(101);
        ss.insert(1011);

        ss.display();


    }


}
