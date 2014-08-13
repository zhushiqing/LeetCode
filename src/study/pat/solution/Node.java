package study.pat.solution;

import java.util.Scanner;

public class Node {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ge = 0;
		int shi = 0;
		int bai = 0;
		int count = 0;
		StringBuffer str = new StringBuffer();
		
		while(num != 0){
			if(count == 0){
				ge = num % 10;
			}else if(count == 1){
				shi = num % 10;
			}else{
				bai = num % 10;
			}
			count++;
			num = num /10;
		}
		while(bai > 0){
			str.append("B");
			bai -- ;
		}
		while(shi > 0){
			str.append("S");
			shi --;
		}
		for (int i = 1; i <= ge; i++) {
			str.append(i);
		}
		System.out.println(str.toString());
	}

}
