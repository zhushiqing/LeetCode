package com.vince.solution;

import java.util.HashMap;

import org.junit.Test;



public class Solution {

	public int[] twoSum(int[] numbers, int target) {
		int indices[] = new int[2];
		int temp;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i],i);
		}
		for (int i = 0; i < numbers.length; i++) {
			if(map.get(target-numbers[i])!=null && map.get(target-numbers[i])!=i){
				indices[0] = i + 1;
				indices[1] = map.get(target-numbers[i])+1;
				if(indices[0]>indices[1]){
					temp = indices[0];
					indices[0] = indices[1];
					indices[1] = temp;
				}
			}
			else
				continue;
		}
		
		
		
		return indices;
    }
	
	
	public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        String string;
        
        if(str.length == 1)
        	return string = str[0].trim();
        for (int i = str.length - 1; i >= 0; i--) {
        	if(str[i].equals(""))
        		continue;	
        	else if( i == (str.length-1)){
				sb = sb.append(str[i]);
			}
			else{
				sb = sb.append(" ");
				sb = sb.append(str[i]);
			}
		}
        
        
        string = sb.toString();
		return string;        
    }
	
	
	@Test
	public void s(){
		String str = reverseWords(" 1");
		System.out.println(str);
		System.out.println(" "+"1223");
		
		
	}
}
