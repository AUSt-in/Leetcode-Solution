class Solution {
    public int[] sortedSquares(int[] nums) {
        // Brute Force:
        // int[] x = new int[nums.length];
        // for(int i=0; i<x.length; i++){
        //     x[i] = nums[i]* nums[i];
        // }
        // Arrays.sort(x);
        // return x;
        //Two pointer approach
        if (nums == null || nums.length == 0) {
            return new int[] {};
            
        }
        int[] outArr = new int[nums.length];
        int l = 0; int h = nums.length-1; int idx = h;
        while(l <= h){
            if(Math.abs(nums[l]) < Math.abs(nums[h])){
                outArr[idx] = nums[h]*nums[h];
                h--;
            }
            else{
                outArr[idx] = nums[l]*nums[l];
                l++;
            }
            idx--;
        }
        return outArr;
    }
}
