class Solution {
    public void rotate(int[][] matrix) {
      int n = matrix.length-1;
      int k = 0;
        int [][]a = new int[matrix.length][matrix.length];
        for(int i=0; i<matrix.length; i++){
          for(int j=0; j<matrix.length; j++){
           a[i][j] = matrix[i][j];
          }
        }
        for(int i=n; i>=0; i--){
         for(int j=n; j>=0; j--){
          matrix[k][n-j] = a[j][k];
         }
         k++;
        }       
}
}