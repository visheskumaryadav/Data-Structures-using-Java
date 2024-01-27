package Arrays.Problems;

import Arrays.Util;
public class RotateArray {
 
    //rotating the array once either from left or right
    public static void rotateOnce(int[] arr,boolean shiftSide){
        if(shiftSide){
            int temp=arr[0];

            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
        }else{
            int temp=arr[arr.length-1];

            for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
        }
    }
    //rotating the array by n times from left and right side SOLUTION 1
    public static void rotateArrayBy(int times,int[] arr,boolean shiftSide){
        while(times>0){
            rotateOnce(arr, shiftSide);
            times--;
        }
    }
   
}
