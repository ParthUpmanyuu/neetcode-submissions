class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Frequency Map + Bucket 

     Map <Integer,Integer> frequencyMap = new HashMap<>();
     for(int n : nums){
      frequencyMap.put(n,frequencyMap.getOrDefault((n),0)+1);
     }
  
     //List 
     List<Integer>[] bucket = new List[nums.length+1]; // because bucket doesnt have character value 0 because evry value starts from 1 
     for(int i =0;i<bucket.length;i++ ){
      bucket[i] = new ArrayList<>();
     }

     // Put frequent element in bucket 
     for(int num : frequencyMap.keySet()){
        int frequency = frequencyMap.get(num);
        bucket[frequency].add(num);
     }

     // Store the value in k 
     int [] result = new int [k];
     int count =0;

     for(int i=bucket.length-1;i>=0 && count < k ;i--){
        for(int num :bucket[i]){
          result[count] = num;
          count++;
          if(count==k) return result;
        }
     }
     return result;                //TC - O(n)
    }
}
