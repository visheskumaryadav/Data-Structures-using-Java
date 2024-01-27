package Arrays.Problems;

import java.util.ArrayList;
import java.util.List;

import Arrays.Util;

public class GenerateSubArrays {
    public static void printSubArrays(int[] arr){
       int i=0;int j=1;
       List<List<Integer>> subArrays=new ArrayList<>();
       List<Integer> temp=null; 
       while(i<arr.length){
        temp=new ArrayList<>();
        for(int k=i;k<j;k++){
            temp.add(arr[k]);
        }
        subArrays.add(temp);
        if(j<arr.length){
            j++;
        }else{
            i++;j=i+1;
        }
       }

       for(List<Integer> l:subArrays){
        Util.printArray(l);
       }
    }
    
    public static void twoPointerSubArrays(int[] arr){
        int left=0;int right=0;int k=0;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        while(left<arr.length){
               temp.add(arr[left]);
               if(left==right){
                right++;
                result.add(temp);
                temp=new ArrayList<>();left=k;
                if(right>arr.length-1){
                    left=left+1;
                    k++;   
                    right=left;
                    continue; 
                }
                continue;
               }else{
                left++;
               }
                
        }
        for(List<Integer> l:result){
            Util.printArray(l);
           }
        
    }

    // public static void recursive(int i,int[]arr,List<Integer> list){
    //     if(i>arr.length-1){
    //         return;
    //     }

    //     for(int k=i;k<arr.length;k++){
    //         list.add(arr[k]);
    //         recursive(k+1, arr, list);
    //         Util.printArray(list);
    //         list.remove(Integer.valueOf(arr[k]));
    //     }
       
    // }
}
