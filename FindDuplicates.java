public class FindDuplicates{
    public static void findduplicates(int[] arr){
        for(int i = 0;i < arr.length;i ++){
            int j = i + 1;
            while(j < arr.length){
                if(arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
                j ++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,3,5};
        findduplicates(arr);
    }
}