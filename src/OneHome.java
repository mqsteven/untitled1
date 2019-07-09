import java.util.HashMap;
import java.util.Map;

/**
 * 题目一
 *
 */
public class OneHome {





    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] i=new int[]{1,2,3,5,2,6,4,4};
        int[] ints = twoSum2(i, 11);
        System.out.println(ints[0]+"   "+ints[1]);
    }

    public String check(String s,String s2){
        return "";
    }
    /**
     * 两次循环
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * hashMap算法循环两次
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i <nums.length ; i++) {
            int complement= target-nums[i];
            if (map.containsKey(complement)&&map.get(complement)!=i){
                return new int[] { i, map.get(complement) };
            }
        }

        return new int[]{};
    }

    /**
     * hashmap算法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int complement=target-nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }


}


