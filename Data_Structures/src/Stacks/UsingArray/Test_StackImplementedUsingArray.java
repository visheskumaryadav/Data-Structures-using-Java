package Stacks.UsingArray;

class Stack{
    private int[] stack;
    private int top;
    public Stack(int size){
        stack=new int[size];
        top=-1;
    }
    private boolean isEmpty(){ return top==-1;    }
    private boolean isFull(){ return top==stack.length-1;}
    void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }else{
            top++;
            stack[top]=data;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");return(-1);
        }else{
            int popData=stack[top];
            top--;
            return popData;
        }
    }

    int peek(){
        return stack[top];
    }
    void displayAsArray(){
        for (int j : stack) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
public class Test_StackImplementedUsingArray {
    public static void main(String[] args) {
        Stack stack=new Stack(5);

    }
}
