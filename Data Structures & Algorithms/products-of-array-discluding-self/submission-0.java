class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Optimized way to find the product of others numbers without the product of the specific element 
        // We have to find this for all the values in the array 
        // will do by multiplying left and right values of the particular element without whom product would be 


        int [] left = new int [nums.length];
        int [] right = new int [nums.length];

        left[0] =1;
        for(int i =1;i<nums.length;i++){
            left[i] = nums[i-1] * left[i-1];  // -- Acc to example 1 -- 
                                                 //  [1,1,2,8]
        }
         right[nums.length-1] = 1;
        for(int i =nums.length-2;i>=0;i--){
            right[i] =  right[i+1] * nums[i+1]; //-- [48,24,6,1]
        }

        // Mutiply both to get the accurate value 
        int [] result = new int [nums.length];
        for(int i =0;i<nums.length;i++){
            result[i] = left[i] *right[i];              //--[48,24,12,8]
        }
        return result;                       //Tc - O(n) iterating and using nums array thats why both ar O(n)
                                             //Sc - O(n)
    }
}  
