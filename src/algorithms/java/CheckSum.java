package algorithms.java;

public class CheckSum {
    private static int count;
    boolean ans;
    boolean check(int[] nums, int k) {
        backTrack(nums, 0, nums[0], k);
        return ans;
    }

    void backTrack(int[] nums, int currentIndex, int currentSum, int k) {
        if(!ans) {
            count++;
            if (currentIndex == nums.length - 1) {
                if (currentSum % k == 0) {
                    ans = true;
                }
            } else {
                backTrack(nums, currentIndex + 1, currentSum + nums[currentIndex + 1], k);
                backTrack(nums, currentIndex + 1, currentSum - nums[currentIndex + 1], k);
            }
        }
    }

    void backTrackV2(int[] nums, int currentIndex, int currentSum, int k) {
        count++;
        if (currentIndex == nums.length - 1) {
            if (currentSum % k == 0) {
                ans = true;
            }
        } else {
            backTrackV2(nums, currentIndex + 1, currentSum + nums[currentIndex + 1], k);
            backTrackV2(nums, currentIndex + 1, currentSum - nums[currentIndex + 1], k);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 6, 3, 5, 1, 6, 3, 5, 1, 6, 3, 5};
        System.out.println(new CheckSum().check(nums, 7));
        System.out.println(count);
//        new Solution().nextPermutation(nums);
//        System.out.println(Arrays.toString(nums));
    }
}
