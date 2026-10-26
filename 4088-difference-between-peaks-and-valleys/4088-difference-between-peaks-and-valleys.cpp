class Solution {
public:
    int peakValleyDifference(vector<int>& nums) {
        int sum=0;
        int diff=0;
        for(int i=1;i<nums.size()-1;i++){
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                sum=sum+nums[i];
            }else if(nums[i]<nums[i-1]&&nums[i]<nums[i+1]){
                diff=diff+nums[i];
            }
        }
                  return sum-diff;
    }
};