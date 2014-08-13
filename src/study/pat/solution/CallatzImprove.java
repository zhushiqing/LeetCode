package study.pat.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CallatzImprove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		int [] sum = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			sum[i] = num[i];
		}
		
		int[] num1 = judge(sum);
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if(num1[i] == 0)
				list.add(i);
		}
		

		Object[] num3 = list.toArray();
 		int[] num2 = new int[list.size()];
 		for (int i = 0; i < num2.length; i++) {
			num2[i] = (Integer) num3[i];
		}
		sort(num2);
		for (int i = 0; i < num2.length; i++) {
			if(i==num2.length-1)
				System.out.print(num[num2[i]]);
			else
				System.out.print(num[num2[i]]+" ");
		}
	}
	
	
		
	
	public static void sort(int[] num){
		int temp = -1;
		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length-i-1; j++) {
				if(num[j]<num[j+1]){
					temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
					
			}
		}
	}
	
	public static int[] judge(int[] num){
		int [] result = new int[num.length];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			list.add(num[i]);
			result[i]= 	0;
		}
		for (int i = 0; i < num.length; i++) {
			while(num[i]!=1){
				if(num[i]%2==0){
					num[i]=num[i]/2;
					if(list.contains(num[i])){
						int j = list.indexOf(num[i]);
						result[j]=1;
					}
				}else{
					num[i]=3*num[i]+1;
					if(list.contains(num[i])){
						int j = list.indexOf(num[i]);
						result[j]=1;
					}
				}
			}
		}
		
		return result;
		
	}
	
}
