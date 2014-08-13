package study.pat.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Removechar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒªÅĞ¶ÏµÄ×Ö·û´®");
		
		String str = sc.nextLine();
		char[] cs = str.toCharArray();
		
		int[] num = new int[cs.length];
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < cs.length; i++) {
			if(list.contains(cs[i])){
				num[i]=list.indexOf(cs[i]);
			}else
				list.add(cs[i]);
				
		}
		
		
	}
}
