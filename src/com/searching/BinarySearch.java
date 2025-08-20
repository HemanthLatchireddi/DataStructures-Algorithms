package com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
          int[] nums={2,5,7,11,13,17};


           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the Target:");
           int target=sc.nextInt();

          int index=binarySearch(nums ,target,0,nums.length-1);

          if (index == -1){
              System.out.println("Element not found");
          }
          else{
              System.out.println("Element found at index:"+index);
          }
    }

      public static int binarySearch(int[] nums , int target,int start,int end){
        //int start=0 , end=nums.length-1;

//          while(start <= end){
//              int mid=(start+end)/2;
//
//              if(nums[mid] == target){
//                  return mid;
//              }
//              else if(nums[mid] < target ){
//                  start=mid+1;
//              }
//              else{
//                  end=mid-1;
//              }
//        }
       //Recursion
             if(start <= end){
                 int mid=(start+end)/2;

                if(nums[mid] == target)
                 return mid;

            else if(nums[mid] < target )
                 return binarySearch(nums, target,mid+1, end);
            else
                    return binarySearch(nums, target,start, mid-1);


             }

         return -1;
      }
}
