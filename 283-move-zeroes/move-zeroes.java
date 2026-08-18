class Solution {
    public void moveZeroes(int[] nums) {
        
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
           // nums[j]=nums[i];
           int temp=nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
            j++;
        }}
      //  while(j<nums.length){
       //     nums[j]=0;
       //     j++;
       // }
       
    }
}