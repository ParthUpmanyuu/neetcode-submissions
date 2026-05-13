class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       }
      HashMap<Character,Integer> CountS = new HashMap<>();
      HashMap<Character,Integer> CountT = new HashMap<>();

      for(int i= 0;i<s.length();i++){
        CountS.put(s.charAt(i) , CountS.getOrDefault(s.charAt(i),0) +1);
        CountT.put(t.charAt(i), CountT.getOrDefault(t.charAt(i),0) +1);
      }

      return CountS.equals(CountT);
    
    }
}