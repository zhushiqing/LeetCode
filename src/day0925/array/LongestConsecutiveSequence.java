package day0925.array;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * Given an unsorted array of integers, find the length of the longest
 * consecutive elements sequence.
 * 
 * For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements
 * sequence is [1, 2, 3, 4]. Return its length: 4.
 * 
 * Your algorithm should run in O(n) complexity.
 * 
 * @author zhushiqing
 *
 *空间换时间 hashtable or hashset
 */


public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] num) {
		Set<Integer> set = new HashSet<Integer>();
		int max = 0;
		
		for (int i : num) {
			set.add(i);
		}
		

		for (int i = 0; i < num.length; i++) {
			int len = 1;
			if (set.contains(num[i])) {
				int next = num[i] + 1;
				set.remove(num[i]);// 及时移除，减少以后的查找量
				while (set.contains(next)) {
					set.remove(next);//
					len++;
					next++;
				}
				next = num[i] - 1;
				while (set.contains(next)) {
					set.remove(next);//移除很重要
					len++;
					next--;
				}
				max = Math.max(max, len);
			}
		}
		return max;
	}

	@Test
	public void test() {
		int[] num = { 1, 2, 3, 4, 5, 8, 9, 6 };
		int len = longestConsecutive(num);
		System.out.println(len);
	}
}
