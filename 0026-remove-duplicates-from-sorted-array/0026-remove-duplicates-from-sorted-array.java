import java.util.*;

class Solution {

    public static int removeDuplicates(int[] arr) {

        int left = 0;

        for(int right = 1; right < arr.length; right++){
            if(arr[left] != arr[right]){
                left++;
                arr[left] = arr[right];
            }
        }

        return left + 1;
    }

    // public static void main(String args[]){

    //     int arr[]={0,0,1,1,1,2,2,3,3,4};

    //     int noduplicate = removeDuplicates(arr);

    //     System.out.println(noduplicate);
    // }
}
