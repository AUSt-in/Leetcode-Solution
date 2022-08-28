class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[candidate] == nums[i]){
                count++;
            }
            
            if(nums[candidate] !=nums[i]){
                count--;
            }
            
            if(count == 0){
                candidate = i;
                count = 1;
            }
        }
        
        return nums[candidate];
    
        
    }
}
