class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        Queue<int[]> pq = new PriorityQueue<>((a,b)->{
            int dist1 = a[0]*a[0] + a[1]*a[1];
            int dist2 = b[0]*b[0] + b[1] * b[1];

            return Integer.compare(dist1,dist2);
        });

        for (int[] point:points){
            pq.add(point);
        }

        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            result.add(pq.poll());
        }
        return result.toArray(new int[result.size()][]);
    }
}
