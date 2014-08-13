package study.pat.solution;

import java.util.Scanner;

class CallatzTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = guess(num);
		System.out.println(count);
	}
	public static int guess(int n){
		int count = 0;
		while(n != 1){
			if(n % 2 == 0){
				n = n / 2;
				count ++;
			}else{
				n = (3 * n + 1) / 2;
				count ++;
			}
		}
		return count;
	}
}
