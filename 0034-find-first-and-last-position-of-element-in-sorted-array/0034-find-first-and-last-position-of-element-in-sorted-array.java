class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left=0;
       int right=nums.length-1;
       int first=-1;
       int last=-1;
      while(left<=right){
        int middle=left+(right-left)/2;
        if(nums[middle]==target){
            first=middle;
            right=middle-1;
        }
        else if(nums[middle]<target){
            left=middle+1;

        }
        else{
            right=middle-1;
        }
        }
        left=0;
        right=nums.length-1;
           while (left <= right) {
             int middle = left + (right - left) / 2;
             if (nums[middle] == target) {
                last = middle;
                left = middle + 1;   
            }
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
       }
       return new int[]{first,last};
    }
}
