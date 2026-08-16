class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int n = mat[0].length;
        int m = mat.length;
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            int sum =0;
            for(int j=0; j< m; j++){
                sum += mat[j][i];
            }
            arr[i] = sum;
        }
        return arr;
    }
}