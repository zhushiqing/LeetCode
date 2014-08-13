package study.pat.solution;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String [] str = new String[n];
		String [] s = new String[3];
		int count = 0;
		Long[] A = new Long[n];
		Long[] B = new Long[n];
		Long[] C = new Long[n];
		for (int i = 0; i < n; i++) {
			str[i]=sc.nextLine();
			s=str[i].split(" ");
			A[i]=Long.parseLong(s[0]);
			B[i]=Long.parseLong(s[1]);
			C[i]=Long.parseLong(s[2]);
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			count = i +1;
			if((A[i]+B[i])>C[i]){
				System.out.println("Case #"+ count +": true");
			}else{
				System.out.println("Case #"+ count +": false");
			}
			
		}
	}
}
