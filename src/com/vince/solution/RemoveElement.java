package com.vince.solution;

import org.junit.Test;

public class RemoveElement {
	
	@Test
	public void test1(){
		int[] A = {4,5};
		int num = 4;
		int number = removeElement(A,num);
		System.out.println(number);
	}
	
	
	public int removeElement(int[] A, int elem) {
	    int count = 0;
	    for (int i = 0; i < A.length; ++i) {
	        if (A[i] == elem) {
	            ++count;
	        } else if(count > 0) {
	            A[i - count] = A[i];
	        }
	    }
	    
	    return A.length - count;
	}
}
