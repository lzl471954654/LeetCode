public class TwoSum {
    public static void main(String[] args) {
        int[] array = new Solution().twoSum(new int[]{3,2,4},6);
        for (int i : array) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if((nums[i]+nums[i1]) == target){
                    answer[0] = i;
                    answer[1] = i1;
                    return answer;
                }
            }
        }
        return answer;
    }
}
