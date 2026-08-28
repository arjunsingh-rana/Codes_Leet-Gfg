class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left=0,right=1;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[left]=nums[i];
                left+=2;
            }else{
                result[right]=nums[i];
                right+=2;
            }
        }
        return result;
    }
}