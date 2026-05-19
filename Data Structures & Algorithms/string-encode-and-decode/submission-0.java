class Solution {

    public String encode(List<String> strs) {
    //Convert list of string into a string 
    StringBuilder sb = new StringBuilder();
    for(String s : strs){
        sb.append(s.length()).append("#").append(s);
    }
    return sb.toString();
    }

    public List<String> decode(String str) {
    //Convert back the single string into list 
    // List to convert the string into list of strings

     List<String> result = new ArrayList<>();
     int i =0;
     while(i<str.length()){
        int j = str.indexOf("#",i);
        int length = Integer.parseInt(str.substring(i,j));
        i = j+1;
       result.add(str.substring(i, i + length));
        i+=length;
     }                                  // Tc - O(n) 
                                        //Sc - O(n)
     return result ;
    }
}
