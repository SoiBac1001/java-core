package algorithms.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {11, 2, 7, 15};
        int[] input2 = {3, 2, 4};
        int[] input3 = {3, 2, 3};

        System.out.println("result 1: " + Arrays.toString(solution(input, 9)));
        System.out.println("result 2: " + Arrays.toString(solutionV2(input, 9)));
        System.out.println("result 2: " + Arrays.toString(solutionV2(input2, 6)));
        System.out.println("result 2: " + Arrays.toString(solutionV2(input3, 6)));
    }

    private static int[] solution(int[] nums, int target) {
        int[] result = new int[2];
        OUT_LOOP:
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    break OUT_LOOP;
                }
            }
        }

        return result;
    }

    private static int[] solutionV2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int remain = target - currentNumber;

            if(numMap.containsKey(remain)) {
                Integer index = numMap.get(remain);
                if(index != null) {
                    result[0] = i;
                    result[1] = index;
                    break;
                }
            } else {
                numMap.put(currentNumber, i);
            }
        }

        return result;
    }
}
