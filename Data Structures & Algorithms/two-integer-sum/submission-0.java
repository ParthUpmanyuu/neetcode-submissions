class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] [] A = new int [nums.length][2];
        for(int i =0;i<nums.length;i++){
          A[i][0] = nums[i];           // Stores elements 
          A[i][1] = i;                // Stores indices
        }

        Arrays.sort(A,Comparator.comparingInt(a->a[0]));  // Sorts array elements 

        // Two Pointers To find the best pair 

        int left = 0;
        int right = nums.length -1;

        while(left<right){
          int sum = A[left][0] + A[right][0];

          if(sum==target){
            return new int[] {Math.min(A[left][1],A[right][1]),
                              Math.max(A[left][1],A[right][1])};
          }
          else if (target>sum){
           left++;
          }
          else{
            right--;
          }
        }
        return new int [0];
    }
}
