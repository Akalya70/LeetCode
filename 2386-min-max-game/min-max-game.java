class Solution {
    public int minMaxGame(int[] nums) {
       int n=nums.length;
       while(n>1){
        n/=2;
        for(int i=0;i<n;i++){
            int a=nums[2*i];
            int b=nums[2*i+1];
            if(i%2==0){
                nums[i]=Math.min(a,b);
            }else{
                nums[i]=Math.max(a,b);
            }
        }
       } 
       return nums[0];
    }
}