class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
        (p1,p2) ->getDistance(p1).compareTo(getDistance(p2)));
        for(int i=0; i<points.length; i++){
            pq.add(points[i]);
        }
        int[][ ] result = new int[k][2];
        for(int i =0; i<k; i++){
            result[i] = pq.poll();
        }
        return result;
    }
    private Double getDistance(int [] points){
        return Math.sqrt((points[0]*points[0]) +(points[1]*points[1]));
    }
}
