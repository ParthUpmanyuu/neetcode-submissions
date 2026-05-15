class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // We will use HashMap to compare keys (characters) with other strings characters if they are same add them in list 
        // We will do that via Initialisation of HashMap -> Loop through array of string given 
        //  by setting count to [26] because we are given only lowercase english alphabet 
        //-> Go into the loop  intialisation variable and make the character loop go through it 
        // -> count frequency of each character by  variable used in second loop - 'a' qith increment outside increasing frequency
        //  then convert the count int arr to string arr and then put the value of key in hashmap and create a new arraylist 
        // and then get the key and associated values with the key 
        // It gets the associated values because other values has the same values as key 
        // We have put up the condition also Map.putIfAbsent(key) if the key value same then only add it as the value of the default key 

        Map<String,List<String>> Map = new HashMap<>();

        for(String s : strs){            // String Loop 
           int [] count = new int [26];  //Values of lowercase alphabet can lie 
            
            for(char c : s.toCharArray()){    //Char array 
                count[c - 'a']++;             //Frequency Counter of each Character 
            }
        
         
        String keys = Arrays.toString(count);     // count arr -> string arr 
        Map.putIfAbsent(keys,new ArrayList<>());  // Putting the key val in new ArrayList 
        Map.get(keys).add(s);                     // If key(count frequency )matches with any values dont add it as key
                                                  // add it as values of that key
    }
    // At last return the values of the keys in the form of list as mentioned in intialisation 
    return new ArrayList<>(Map.values());

                           //Tc - O(n*k) where n is time taken for loop and k is total time taken for frequency-count strings
                           //Oc - O(n*k) space taken for sorted keys and n is for storing original values 
}
}
