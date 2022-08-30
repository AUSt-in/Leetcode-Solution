class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] x = new int[m];
        int[] y = new int[n];
        Arrays.fill(x , 1);
        Arrays.fill(y , 1);
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    x[i] = 0;
                    y[j] = 0;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(x[i]==0 || y[j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
