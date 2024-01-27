package Arrays.Problems;

import Arrays.Util;

public class Largest3Elements {
    
    public static void inArray(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        int[] result=new int[3];

        for(int i=0;i<arr.length;i++){

            if(arr[i]>first){
                int temp=second;
                second=first;
                third=temp;
                first=arr[i];
               
            }else if(arr[i]>second && arr[i]!=first){
                third=second;
                second=arr[i];
            }else if(arr[i]>third && arr[i]!=second){
                third=arr[i];
            }
        }

        result[0]=first;result[1]=second;result[2]=third;

        Util.printArray(result);
    }
}
