public class WaveSorting {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void waveSort(int[] arr){
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                swap(arr, i, i - 1);
            }
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        for(int i = 0;i < arr.length;i ++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int[] arr = {-45 ,45 ,-50 ,-60 ,0 ,34 ,9 ,12}; 
        waveSort(arr);
    }
}
