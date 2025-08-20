package com.sortings;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums={3,6,2,8,4,1,10,9,5,7};

        System.out.println("before Swapping");
        for(int num:nums){
            System.out.print(num+" ");
        }
        int temp=0;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            System.out.println();
            for(int num:nums){
                System.out.print(num+" ");
            }
        }
      System.out.println();
        System.out.println("After sorting:");
        for(int num:nums){
            System.out.print(num+" ");
        }


    }
}
