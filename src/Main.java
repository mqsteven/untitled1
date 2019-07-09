import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] i=new int[]{1,2,3,5,2,6,4,4};
        int[] ints = twoSum2(i, 11);
        System.out.println(ints[0]+"   "+ints[1]);
    }
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


