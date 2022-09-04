class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowBegin = 0;
        int rowEnd = matrix.length -1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length -1;
        
        List<Integer> op = new ArrayList<>();
        
        
        while(rowBegin <= rowEnd && columnBegin <= columnEnd){
            for(int i=columnBegin; i<=columnEnd; i++){
                op.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin; i<= rowEnd; i++){
                op.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            
            if(rowBegin <= rowEnd){
                for(int i=columnEnd; i>= columnBegin;i--){
                    op.add(matrix[rowEnd][i]);
            }
            }
            rowEnd--;
            if(columnBegin <= columnEnd){
            for(int i=rowEnd; i>= rowBegin; i--){
                op.add(matrix[i][columnBegin]);
            }
            }
            
            columnBegin++;
            
        }
        return op;
    }
}
