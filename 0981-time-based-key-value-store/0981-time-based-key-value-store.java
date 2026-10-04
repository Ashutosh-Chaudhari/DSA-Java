class TimeMap {

    class Data{
        String value;
        int timestamp;
        Data(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    HashMap<String, ArrayList<Data>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Data(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        String answer = "";
        ArrayList<Data> list = map.get(key);
        int low = 0;
        int high = list.size()-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(list.get(mid).timestamp<=timestamp){
                answer = list.get(mid).value;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return answer;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */