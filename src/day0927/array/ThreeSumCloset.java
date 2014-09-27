package day0927.array;

import java.util.Arrays;

/**
 * 
 * Given an array S of n integers, find three integers in S such that the sum is
 * closest to a given number, target. Return the sum of the three integers. You
 * may assume that each input would have exactly one solution.
 * 
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * @author zhushiqing
 *
 */
public class ThreeSumCloset {

	public int threeSumClosest(int[] num, int target) {
		
		Arrays.sort(num);
		int min = Integer.MAX_VALUE;
		int result = 0;
		
		for (int i = 0; i < num.length; i++) {
			int start = i+1;
			int end = num.length-1;
			
			while(start < end){
				int sum = num[start]+num[end]+num[i];
				int diff = Math.abs(sum-target);
				if(diff<min){
					min = diff;
					result = sum;
				}
				if(sum<target){
					start++;
				}else
					end--;
			}
		}
		
		return result;
		
	}
}
