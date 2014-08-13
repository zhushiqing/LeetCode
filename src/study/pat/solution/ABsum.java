package study.pat.solution;

import java.util.Scanner;

public class ABsum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count1=0;
		int count2=0;
		
		String str = sc.nextLine();
		String[] s =str.split(" ");
		
		while(s[0].contains(s[1])){
			int n = s[0].indexOf(s[1]);
			s[0].replaceFirst(s[1], "b");
			count1++;
		}
		
		while(s[2].contains(s[3])){
			int n = s[2].indexOf(s[3]);
			s[2].replaceFirst(s[3], "b");
			count2++;
		}
		
		Long num1=Long.parseLong(s[1]);
		Long num2=Long.parseLong(s[3]);
		
		if(count1==0){
			num1= (long) 0;
		}else if(count2==0){
			num2 = (long) 0;
		}
		
		while(count1 > 1){
			num1=num1*10+num1;
			count1--;
		}
		while(count2 > 1){
			num2=num2*10+num2;
			count2--;
		}
		System.out.println(num1+num2);

		
	}

}
