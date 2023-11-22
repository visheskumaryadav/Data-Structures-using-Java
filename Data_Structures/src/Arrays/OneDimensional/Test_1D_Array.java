package Arrays.OneDimensional;

import java.util.Scanner;

public class Test_1D_Array {

    private  int[] arr;
    public Test_1D_Array(int size){
        arr=new int[size];
    }
    //Printing the array
    void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); // for new line
    }
    //Getting the input for array
    void enterDataInArray(){
        System.out.println("Enter the data");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
    void insertAtPosition(int pos,int data){
        int[] temp=new int[arr.length+1];
        System.out.println("Inserting the element: " + data + " at " + pos+" position");
        if(pos<=0||pos>arr.length) {
            System.out.println("Invalid position");
            return;
        }
        else {
            for (int i = 0; i < pos-1; i++) {     //copying elements of main array from 0->pos-1 to temp array
                temp[i] = arr[i];
            }
            temp[pos-1] = data;  //inserting element at pos-1 in temp array
            for (int i = pos-1; i < arr.length; i++) { //copying remaining elements of main array from pos-1->arr.length to temp array
                temp[i+1] = arr[i];
            }
            arr=temp; // making the arr to point to reference of temp array
        }
    }
    //Deleting element at position
    void deleteAtPosition(int pos){
        int[] temp=new int[arr.length-1];
        System.out.println("Deleting the element: " + arr[pos-1] + " from " + pos+" position");
        if(pos<=0||pos>arr.length){
            System.out.println("Invalid position");
            return;
        }
        else{
            for(int i=0;i<pos-1;i++){  //copying elements of main array from 0->pos-1 to temp array
                temp[i] = arr[i];
            }
            for(int i=pos;i<arr.length;i++){//copying remaining elements of main array from pos-1->arr.length to temp array
                temp[i-1]=arr[i];
            }
            arr=temp;
        }
    }

    //Running the code
    public static void main(String[] args) {

        Test_1D_Array a1=new Test_1D_Array(5);
        a1.enterDataInArray();
        a1.printArray();
        a1.insertAtPosition(5,10);
        a1.printArray();
        a1.deleteAtPosition(2);
        a1.printArray();
    }
}
