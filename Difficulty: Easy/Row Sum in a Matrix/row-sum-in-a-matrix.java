class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int n=mat[0].length;
        int m=mat.length;
        int[] arr= new int[m];
        for(int i=0; i< m; i++){
            int sum =0;
            for(int j=0; j<n; j++){
                sum +=mat[i][j];
            }
            arr[i] = sum;
        }
        return arr;
    }
}