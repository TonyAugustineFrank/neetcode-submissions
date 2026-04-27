class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Unit> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] result = new int[k];
        map.forEach((key,value)->{
            Unit unit = new Unit(key,value);
            pq.add(unit);
        });

        while(k>0){
            Unit temp = pq.poll();
            result[k-1] = temp.val;
            k--;
        }
        return result;
    }
}

class Unit implements Comparable<Unit>{
    public int val;
    public int priority;
    Unit(int val,int priority){
        this.val=val;
        this.priority = priority;
    }

    @Override 
    public int compareTo(Unit otherUnit) {
        return Integer.compare(otherUnit.priority, this.priority);
   
    }
}