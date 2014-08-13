package huawei.interview.zsq;

import java.util.Scanner;

public class ProblemA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		//ÅÅÐò
		int temp;
		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length -i -1; j++) {
				if(num[j]<num[j+1]){
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		int max = num[0]*100+num[1]*10+num[2];
		
		if(max==0)
			System.out.println("000");
		else
			System.out.println(max);
		
	}
}
