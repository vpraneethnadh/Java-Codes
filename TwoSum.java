public class TwoSum{
    public static boolean sum(int[] arr,int tar){
        for(int i = 1;i < arr.length;i ++){
            if(arr[i - 1] + arr[i] == tar)
                return true;
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr = {10,5,7,8,3};
        int tar = 75;
        int tar2 = 15;
        System.out.println(sum(arr,tar));
        System.out.println(sum(arr,tar2));
    }
}