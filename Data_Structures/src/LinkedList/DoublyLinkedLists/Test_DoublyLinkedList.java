package LinkedList.DoublyLinkedLists;

import java.util.Scanner;

//class for defining structure of a Node
class Node{
    int  data;
    Node next,prev;
     public Node(int data){
         this.data=data;
     }
}

class  DoublyLinkedList{
    Node head;
    int length; // length of doubly linked list
    //Adding node at the end of the list
    void add(int data){
        Node newNode=new Node(data);
        length++;
        if(head==null){
            head=newNode;
        }else{
            Node ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            newNode.prev=ptr;
            ptr.next=newNode;
        }

    }
    //Adding node at specified position
    void insertAtPosition(int data,int pos){
        Node newNode=new Node(data);
        if(pos<1 || pos>length+1){
            System.out.println("INVALID Position");
        }else{
            if(head==null){
                head=newNode;
                length++;
            }else{
                if(pos==1){
                    newNode.next=head;
                    head.prev=newNode;
                    head=newNode;
                    length++;
                }else if(pos==length+1){
                    add(data);
                }
                else{
                    Node ptr=head;
                    for(int i=1;i<pos-1;i++){
                        ptr=ptr.next;
                    }
                    newNode.next=ptr.next;
                    newNode.next.prev=newNode;
                    newNode.prev=ptr;
                    ptr.next=newNode;
                    length++;
                }
            }
        }


    }

    //Displaying doubly linked list in forward and backward direction
    static void printForward(DoublyLinkedList list){
        System.out.println("Forward printing:");
        System.out.println();
        Node ptr=list.head;
        while(ptr!=null){
            System.out.print(ptr.data+ " ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    static void printBackward(DoublyLinkedList list){
        System.out.println("Backward printing:");
        Node ptr=list.head;
        System.out.println();
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        while(ptr!=null){
            System.out.print(ptr.data+ " ");
            ptr=ptr.prev;
        }
        System.out.println();
    }
}

//Client class
public class Test_DoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        System.out.println("Length1: " + list.length);

        System.out.println("Enter the length of the linked list");
        Scanner input=new Scanner(System.in);
        int length=input.nextInt();
        System.out.println("Enter the values of nodes:");
        for(int node=0;node<length;node++){
            list.add(input.nextInt());
        }
        System.out.println("Length1: " + list.length);

        DoublyLinkedList.printForward(list);
        DoublyLinkedList.printBackward(list);

        System.out.println("Enter the value to be inserted with position");

        int data= input.nextInt();
        int pos= input.nextInt();
        list.insertAtPosition(data,pos);
        DoublyLinkedList.printForward(list);
        DoublyLinkedList.printBackward(list);
        System.out.println("Length3: " + list.length);

    }
}
