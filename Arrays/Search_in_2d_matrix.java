class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null) return false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows* columns-1;
        while(left <= right){
            int mid = left + (right -left)/2;
            int mid_element = matrix[mid/columns][mid%columns];
            if(mid_element == target) return true;
            else if(target < mid_element){
                right = mid -1;
                
            }
            else if(target > mid_element){
                left = mid+1;
            }
        }
        return false;
    }
}
