class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int num : nums1){
            map.put(num,true);
        }
        for(int num: nums2){
            if(map.containsKey(num) && map.get(num)){
                result.add(num);
                map.put(num,false);
            }
        }
        int[] arr = new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
}