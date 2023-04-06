package programmers.lv1;
import java.util.*;

public class Q1845 {
	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        Map map = new HashMap<>();
	        for (int i=0; i<nums.length; i++) {
	            for (int j=nums.length-1; j>=0; j--) {
	                    map.put(nums[i],nums[j]);
	            }
	        }
	        if (nums.length/2 < map.size() ) {
	            return answer = nums.length/2;
	        }
	        return answer = map.size();
	    }
	}
}
