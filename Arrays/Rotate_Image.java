class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
      // transpose of an image
        for(int i =0; i<N; i++){
            for(int j =i; j<N; j++){
                int k = matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i] = k;
            }
        }
      // swap an image with the other half side
        for(int i =0; i<N; i++){
            for(int j =0; j<(N/2); j++){
                int k = matrix[i][j];
                matrix[i][j] =matrix[i][N-1-j];
                matrix[i][N-1-j]=k;
            }
        }
        
    }
}
