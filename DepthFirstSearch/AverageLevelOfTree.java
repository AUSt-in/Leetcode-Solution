//This is a basic depth first search algorithm to practice which will help you prep well!
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        double level_sum;
        while(!queue.isEmpty()){
            level_sum = 0;
            int size = queue.size();
            for(int i= 0; i< size; i++){
                TreeNode curr = queue.poll();
                level_sum += curr.val;
                if(curr.right != null) queue.offer(curr.right);
                if(curr.left != null) queue.offer(curr.left);
                
            }
            double level_avg = level_sum/size;
            result.add(level_avg);
        }
        
        return result;
    }
}
