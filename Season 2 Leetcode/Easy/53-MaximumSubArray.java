package Easy;

class Solution {
  public int maxSubArray(int[] nums) {
      int sum = 0;
      int max = Integer.MIN_VALUE;
      for (int num : nums) {
          if (sum < 0) {
              sum = num;
          } else {
              sum += num;
          }
          max = Math.max(sum, max);
      }
      return max;
  }
}