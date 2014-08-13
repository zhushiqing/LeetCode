package com.vince.solution;

import org.junit.Test;

public class Pow {

	public double pow(double e , int n){
		double sum = Math.pow(e, n);
		return sum;
	}
	
	@Test
	public void excute(){
		System.out.println(pow(-1.0,1));
	}
	
}
