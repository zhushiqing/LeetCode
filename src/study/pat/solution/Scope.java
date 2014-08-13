package study.pat.solution;

import java.util.Scanner;

public class Scope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		int n = Integer.parseInt(n1);
		String[] str = new String[n];
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
			String s = str[i].substring(str[i].lastIndexOf(" ")+1);
			num[i] = Integer.parseInt(s);
			str[i]=str[i].substring(0, str[i].lastIndexOf(" "));
		}
		sc.close();
		
		int max = 0;
		int min = 0;
		
		for (int i = 1; i < num.length; i++) {
			if(num[min] > num[i]){
				min = i;
			}else if(num[max] < num[i]){
				max = i;
			}
		}
		
		System.out.println(str[max]);
		System.out.println(str[min]);
	}
}
