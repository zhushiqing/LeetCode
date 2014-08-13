	package study.first.pat;
	
	import java.util.Scanner;
	
	
	public class MinNumber {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num[]= new int [10];
			for (int i = 0; i < 10; i++) {
				num[i]=sc.nextInt();
			}
			int n = 0;
			for (int i = 0; i < num.length; i++) {
				n = n +num[i];
			}
			int num1[] = new int[n];
			int k = 0;
			int temp;
			for (int i = 0; i < 10; i++) {
				temp = num[i];
				while(temp>0){
					num1[k]=i;
					temp--;
					k++;
				}
			}
			for (int i = 0; i < n; i++) {
				if(num1[0]==0){
					if(num1[i]!=0){
						temp=num1[i];
						num1[i]=num1[0];
						num1[0]=temp;
						break;
					}
				}
			}
			
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i <n; i++) {
				sb.append(num1[i]);
			}
			
			System.out.println(sb);
			
		}
	}
