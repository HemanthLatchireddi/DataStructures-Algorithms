package com.sortings;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] nums={4,2,6,8,9,5};

        System.out.println("before Swapping");
        for(int num:nums){
            System.out.print(num+" ");
        }
        int temp=0;
        int minIndex=-1;

        for(int i=0;i<nums.length-1;i++){
            minIndex=i;

            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex] > nums[j]){
                    minIndex=j;
                }

                temp=nums[minIndex];
                nums[minIndex]=nums[i];
                nums[i]=temp;
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
