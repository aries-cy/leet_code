package leetcode1_10;

import java.util.HashMap;

public class A1_TwoNumSum {
    /**
     * leetCode第一个题：两数之和
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用
     *
     * 示例：
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */

        public static int[] twoSum(int[] nums, int target) {
            int arr[] = {0,0};
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target&&i!=j){
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
            return arr;
        }

    /**
     * 更优秀的解法
     */
        public int[] twoSum2(int[] numbers, int target) {
            int [] res = new int[2];
            if(numbers==null||numbers.length<2)
                return res;
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i = 0; i < numbers.length; i++){
                if(!map.containsKey(target-numbers[i])){
                    map.put(numbers[i],i);
                }else{
                    res[0]= map.get(target-numbers[i]);
                    res[1]= i;
                    break;
                }
            }
            return res;
        }
    }


