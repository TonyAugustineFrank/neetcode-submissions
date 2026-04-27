class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double [][] t = new double[position.length][2];
        for(int i=0;i<position.length;i++)
        {
            t[i][0]=position[i];
            t[i][1]=speed[i];
        }
        Arrays.sort(t,(a,b)->Double.compare(b[0],a[0]));
        int fleet=0;
        double min=Double.MIN_VALUE;
        for(int i=0;i<t.length;i++)
        {
            double time = (target - t[i][0])/t[i][1];
            if(time>min){
                fleet++;
                min=time;
            }
        }
        return fleet;

    }
}
