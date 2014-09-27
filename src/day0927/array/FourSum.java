package day0927.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target.
 * 
 * Note: Elements in a quadruplet (a,b,c,d) must be in non-descending order.
 * (ie, a ≤ b ≤ c ≤ d) The solution set must not contain duplicate quadruplets.
 * 
 * @author zhushiqing
 *
 */
public class FourSum {
	public List<List<Integer>> fourSum(int[] num, int target) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (num.length < 4)
			return result;
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				int start = j + 1;
				int end = num.length - 1;

				while (start < end) {
					int sum = num[i] + num[j] + num[start] + num[end];
					if (sum == target) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[j]);
						temp.add(num[start]);
						temp.add(num[end]);
						if (!result.contains(temp))
							result.add(temp);
						start++;
						end--;
					} else if (sum < target) {
						start++;
					} else {
						end--;
					}
				}

			}
		}

		return result;

	}
}
