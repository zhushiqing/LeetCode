package zju.zsq.selectionsort;

import org.junit.Test;

public class SeletionSort {
	
	public void selectionSort(int[] num){
		int min = 0;
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			min = i;
			for (int j = i+1; j < num.length; j++) {
				if(num[min] > num[j]){
					min = j;
				}
			}
			if(i != min){
				temp = num[i];
				num[i] = num[min];
				num[min] = temp;
			}
		}
	}
	
	@Test
	public void testSelectionSort(){
		int[] nums = {4,2,1,3,7,8,9,11,6};
		selectionSort(nums);
		for(int num : nums){
			System.out.print(num+" ");
		}
	}
}
