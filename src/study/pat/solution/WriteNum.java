package study.pat.solution;

import java.util.Scanner;

class WriteNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cin = sc.next();
		int sum = 0;
		int number = 0;
		int[] num = new int[cin.length()];
		for (int i = 0; i < num.length; i++) {
			num[i] = cin.charAt(i)-'0';
			sum = sum + num [i];
		}
		while(sum % 10 != 0){
			number = number*10 + sum%10;
			sum = sum /10;
		}
		String s = Sum(number);
		System.out.println(s.trim());
		
	}
	public static String Sum(int num){
		String s = new String();
		if(num == 0){
			return new String("ling");
		}
		while(num % 10 != 0 ){
			switch (num % 10) {
			case 0:
				s=s+" ling";
				break;
			case 1:
				s=s+" yi";
				break;
			case 2:
				s=s+" er";
				break;
			case 3:
				s=s+" san";
				break;
			case 4:
				s= s + " si";
				break;
			case 5:
				s = s + " wu";
				break;
			case 6:
				s= s + " liu";
				break;
			case 7:
				s= s+" qi";
				break;
			case 8:
				s=s +" ba";
				break;
			case 9:
				s= s+" jiu";
				break;
			}
			num=num/10;
		}
		return s;
			
		
	}
	
	
}
