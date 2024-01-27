package Arrays;

import java.util.ArrayList;

import Arrays.Problems.GenerateSubArrays;
import Arrays.Problems.Largest3Elements;
import Arrays.Problems.ReverseArray;
import Arrays.Problems.RotateArray;

public class TestProblems {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        // Util.printArray(arr);
        // RotateArray.rotateOnce(arr,true);
        // Util.printArray(arr);
        // RotateArray.rotateOnce(arr, false);
        // Util.printArray(arr);
        // RotateArray.rotateArrayBy(3,arr,true);
        // Util.printArray(arr);

        // ReverseArray.reverse(arr);
        // Util.printArray(arr);

        int[] arr1={1,2,3};
        // GenerateSubArrays.printSubArrays(arr1);
        // GenerateSubArrays.twoPointerSubArrays(arr1);
        // GenerateSubArrays.recursive(0, arr1,new ArrayList<>());
        int[] arr2=  {10, 4, 3, 50, 23, 90};
        Largest3Elements.inArray(arr2);

    }
}
