package com.company;
import java.util.Arrays;


public class shrey {
    public static void main(String[] args){
        int[] a = {4,5,6};
        int[] b= {1,2};
        findMedianSortedArrays(a,b);

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double[] num1 = Arrays.stream(nums1).asDoubleStream().toArray();
        double[] num2 = Arrays.stream(nums2).asDoubleStream().toArray();
        double[] result = new double[(num1.length + num2.length)];
        System.arraycopy(num1,0,result,0,num1.length);
        System.arraycopy(num2,0,result,num1.length,num2.length);
        double median=0;
        double sum=0;


        for(int i=0;i<result.length;i++) {
            sum =+ result[i];
            median = sum/(result.length + 1);
        }
        return median;




    }
}

