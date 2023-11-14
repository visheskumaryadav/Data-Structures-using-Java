package LinkedList.SinglyLinkedLists;

import java.security.Signature;

class Node{
    int data;
    Node link;

    public Node(int data){
        this.data=data;
    }
}
class SinglyLinkedList{
   private  Node head;

    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node ptr=head;
            while(ptr.link!=null){
                ptr=ptr.link;
            }
            ptr.link=newNode;
        }
    }
    static void display(SinglyLinkedList list){
        if(list.head==null){
            System.out.println("Singly linked list is empty");
        }else{
            Node ptr=list.head;
                while(ptr!=null){
                    System.out.print(" "+ptr.data+" ");
                    ptr=ptr.link;
                }
        }

    }
}
public class Test_SinglyLinkedList {
    public static void main(String[] args) {
       SinglyLinkedList list=new SinglyLinkedList();

       for(int i=1;i<11;i++){
           list.add(5*i);
       }
       SinglyLinkedList.display(list);
    }
}
