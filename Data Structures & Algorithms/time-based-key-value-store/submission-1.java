class TimeMap {

    private Map<String,List<Unit>> store;
    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<Unit> temp = store.getOrDefault(key,new ArrayList<>());
        temp.add(new Unit(value,timestamp));
        store.put(key,temp);
    }
    
    public String get(String key, int timestamp) {


        List<Unit> temp = store.get(key);
        int low =0;
        if(temp==null||temp.isEmpty())
        {
            return "";
        }
        int high = temp.size()-1;
        int mid;
        Unit best = null;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(temp.get(mid).getTimeStamp()==timestamp)
            {
                best= temp.get(mid);
                break;
            }
            else if(temp.get(mid).getTimeStamp()<timestamp)
            {
                best = temp.get(mid);
                low = mid +1;
            }
            else
            {
                high = mid -1;
            }
        }
        if(best==null)
        {
            return "";
        }
        else
        {
            return best.getValue();
        }
        
    }
    private class Unit{
        private String value;
        private int timeStamp;

        Unit(String value, int timeStamp)
        {
            this.value = value;
            this.timeStamp = timeStamp;
        }
        public String getValue()
        {
            return this.value;
        }
        public int getTimeStamp()
        {
            return this.timeStamp;
        }
    }
}
