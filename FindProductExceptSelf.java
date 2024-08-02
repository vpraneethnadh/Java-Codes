public class FindProductExceptSelf {
    public static void multiplyself(int[] arr){
        int[] mul = new int[arr.length];
        for(int i = 0;i < arr.length;i ++)
            mul[i] = 1;

        for(int i = 0;i < arr.length;i ++){
            int j = 0;
            while(j < arr.length){
                if(i != j)
                    mul[i] = mul[i] * arr[j];
                j ++;
            }
        }
        for(int i = 0;i < mul.length;i ++)
            System.out.print(mul[i] + " ");

    }
    public static void main(String args[]){
        int[] arr = {10, 3, 5, 6, 2};
        multiplyself(arr);
    }
}
