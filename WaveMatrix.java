public class WaveMatrix {
    public static void wave(int[][] mat){
        int n = mat.length;
        int[][] mat2 = new int[n][n];
        for(int j = 0;j < n;j ++){
            for(int i = 0;i < n;i ++)
                mat2[j][i] = mat[i][j];
            for(int i = n;i < 0;i --)
                mat2[j][i] = mat[i][j];
        }

        for(int i = 0;i < n;i ++){
            for(int j = 0;j < n;j ++)
                System.out.print(mat2[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat = { {4,3,1},
                        {9,0,7},
                        {5,6,2} };
        wave(mat);    
    }
}
