import java.util.*;
class Solution {
    public static void addSolve(int[] arr,int tar){
        int count = 0;
        for(int i = 0;i < arr.length;i ++){
            for(int j = i + 1;j <= arr.length - 1;j ++){
                if(arr[i] + arr[j] == tar){
                    System.out.println(arr[i] + " " + arr[j]);
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
    
    public static void subSolve(int[] arr,int tar){
        int count = 0;
        for(int i = 0;i < arr.length;i ++){
            for(int j = i + 1;j <= arr.length - 1;j ++){
                if(Math.abs(arr[i] - arr[j]) == tar){
                    System.out.println(arr[i] + " " + arr[j]);
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]) {
        int[] arr = {6,7,3,1,14,2,5};
        int tar1 = 10;
        addSolve(arr,tar1);
        int tar2 = 5;
        subSolve(arr,tar2);
    }
}
