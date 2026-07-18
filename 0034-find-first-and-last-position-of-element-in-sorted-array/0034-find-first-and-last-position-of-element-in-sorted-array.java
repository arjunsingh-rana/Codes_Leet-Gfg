class Solution {
    public int first(int[] nums,int target){
        int n=nums.length;
        int start =0, end=n-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
    public int last(int[] nums,int target){
        int n=nums.length;
        int start =0, end=n-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
       int first=first(nums,target);
       int last=last(nums,target);

       return new int[]{first,last};
    }
}