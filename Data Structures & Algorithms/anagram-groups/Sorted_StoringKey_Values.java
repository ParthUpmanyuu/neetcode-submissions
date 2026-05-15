class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
      // Via Sorting and adding 

      Map<String,List<String>> Map = new HashMap<>(); // Stores Key in String and Original values associated with keys in List<String>
      
      //Loop Through strs (String) to find out the characters and then sort and add the associated values to the key 

      for(String s : strs){
        char [] C = s.toCharArray();
        Arrays.sort(C);
        String Sorted = new String(C);

        Map.putIfAbsent(Sorted,new ArrayList<>());
        Map.get(Sorted).add(s);
      }
      return new ArrayList<>(Map.values());   // In HashMap data is sotred key-value pairs 
                                              // Return the values when values needed and vice - versa
                                            //Tc - O( n* k log n ) - where k is length of each string 
                                                                    // and n is total no of strings 
                                                                    // Loop runn till we have find out last string s lenght 
                                            // SC: O(n * k) -  // storing sorted keys + grouped original strings
                        
}
}

