class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer,Integer> m=new HashMap<>();
        List<Integer> n = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(nums[i])){
                n.add(nums[i]);
            }
            else{
                m.put(nums[i], i);
            }
        }
        return n;
    }
}
