package day0925.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤
 * b ≤ c) The solution set must not contain duplicate triplets. For example,
 * given array S = {-1 0 1 2 -1 -4},
 * 
 * A solution set is: (-1, 0, 1) (-1, -1, 2)
 * 
 * @author zhushiqing
 *
 */
public class ThreeSum {
	
	//方法1：时间复杂度(log^2(n)*n^2) 快排 二分查找 嵌套循环
	public List<List<Integer>> threeSum(int[] num) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(num);
		for(int n : num){
			System.out.println(n);
		}
		int index = 0;
		int target = 0;
		for (int i = 0; i < num.length; i++) {
			if(i!=0 && num[i]==num[i-1])
				continue;
			for (int j = i + 1; j < num.length; j++) {
				target = -(num[i]+num[j]);
				index = binarySearch(j+1,num.length-1,target,num);
				List<Integer> list = new ArrayList<Integer>();
				if(index != -1){
					list.add(num[i]);
					list.add(num[j]);
					list.add(num[index]);
				}
				if(list.size()!=0&&!result.contains(list))
					result.add(list);
			}
		}
		

		return result;
	}

	public int binarySearch(int left, int right, int target, int[] num) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (num[mid] == target) {
				return mid;
			} else if (num[mid] < target) {
				left = mid + 1;
			} else if (num[mid] > target) {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public List<List<Integer>> threeSum2(int[] num) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(num.length < 3)
			return result;
		//sort the nums
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			// //avoid duplicate solutions
			if (i == 0 || num[i] > num[i - 1]) {
	 
				int negate = -num[i];
	 
				int start = i + 1;
				int end = num.length - 1;
	 
				while (start < end) {
					//case 1
					if (num[start] + num[end] == negate) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[start]);
						temp.add(num[end]);
	 
						result.add(temp);
						start++;
						end--;
						//avoid duplicate solutions
						while (start < end && num[end] == num[end + 1])
							end--;
	 
						while (start < end && num[start] == num[start - 1])
							start++;
					//case 2
					} else if (num[start] + num[end] < negate) {
						start++;
					//case 3
					} else {
						end--;
					}
				}
	 
			}
		}
	 
		return result;
		
		
	}
	
	
	@Test
	public void test(){
		int[] num = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
		List<List<Integer>> list = threeSum2(num);
		for(List<Integer> e : list){
			System.out.println(e.toString());
		}
	}
}
