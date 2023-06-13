import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class prob {
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) {
        	int a=sc.nextInt();
        	nums[i]=a;
        }
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}