package Arrays.TwoDimensional;

import java.util.Scanner;

public class Test_TwoDimensionalArray {

    static void print(int[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    static int[][] addValues(int[][] arr){
        Scanner input=new Scanner(System.in); //for taking input
        System.out.println("Enter the input:");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=input.nextInt();
            }
            System.out.println();
        }
        return arr;
    }
    static int[][] deleteValue(int[][] arr,int r,int c){

        //create a temp 2-D array
        int[][] temp=new int[arr.length][];
        // Initialize inner arrays of temp
        for (int i = 0; i < temp.length; i++) {
            if(i==r-1){
                temp[i] = new int[arr[i].length-1];
            }
            else{
                temp[i] = new int[arr[i].length];
            }

        }
        // copying values from arr to temp using 2 pointer method
        int r1=0,c1=0,r2=0,c2=0;

        while(r1<arr.length){
            if(r1==r-1 && c1==c-1){
                c1++;
            }
            else{
                temp[r2][c2]=arr[r1][c1];
                c1++;c2++;
            }
            if(c1>arr[r1].length-1)
            {
                r1++;r2++;c1=0;c2=0;
            }
        }
        return temp;
    }
    public static void main(String[] args) {

        int[][] arr=new int[3][3]; // Declaration
        //Test_TwoDimensionalArray.print(arr);
        arr=Test_TwoDimensionalArray.addValues(arr);
        Test_TwoDimensionalArray.print(arr);

        arr=Test_TwoDimensionalArray.deleteValue(arr,2,2);
        Test_TwoDimensionalArray.print(arr);


    }
}
