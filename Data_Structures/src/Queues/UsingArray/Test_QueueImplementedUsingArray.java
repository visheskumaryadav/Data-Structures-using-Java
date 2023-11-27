package Queues.UsingArray;

class Queue{

    private final int[] queue;
    int count;
    private int front,rear;

    public Queue(int size){
        queue=new int[size];
        count=0; front=rear=0;
    }
    private boolean isEmpty(){return count==0;}
    private boolean isFull(){return count==queue.length;}

    void enqueue(int data){

        if(isFull()){
            System.out.println("Queue is Full");
        }else{
            queue[rear%queue.length]=data;
            rear++;count++;
        }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            front++;
            count--;
        }
    }
    void top(){
        if(!isEmpty()){
            System.out.println( queue[front]);
        }else{
            System.out.println("Queue is Empty");
        }
    }
    void display()
    {
        if(!isEmpty()){
            for(int i=front;i<rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("Queue is Empty");
        }
    }
}
public class Test_QueueImplementedUsingArray {

    public static void main(String[] args) {

        Queue q1=new Queue(4);
        q1.enqueue(2);
        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(11);
        q1.display();
        q1.top();
        q1.dequeue();
        q1.dequeue();
        q1.display();
        q1.top();


    }
}
