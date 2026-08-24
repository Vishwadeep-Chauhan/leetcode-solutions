class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        int a=arr[i];
        if(map.containsKey(a)){
            map.put(a,map.get(a)+1);
        }
        else{
            map.put(a,1);
        }
     }

      HashSet<Integer> freq = new HashSet<>(map.values());
      return freq.size()==map.size();
     
        }
      }
   
