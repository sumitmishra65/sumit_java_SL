package com.company;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for(int i =0;i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {10,20,30,40,50,60};
        int key = 40;
        System.out.println(key+"Found at index:" +linearSearch(a1,key));

    }

}
