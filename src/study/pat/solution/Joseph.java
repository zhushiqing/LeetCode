package study.pat.solution;

import java.util.Arrays;
import java.util.Scanner;

/*   ģ��Լɪ������ 
 * Լɪ�����⣺��֪n���ˣ��Ա��1��2��3...n�ֱ��ʾ��Χ����һ��Բ����Χ�� 
 * �ӱ��Ϊk���˿�ʼ����������m���Ǹ��˳��У�������һ�����ִ�1��ʼ����������m���Ǹ����ֳ��У� 
 * ���˹����ظ���ȥ��ֱ��Բ����Χ����ȫ�����С����磺n = 9,k = 1,m = 5 
 */  
  
public class Joseph {  
	private static int count=0;   
	public static void main(String[] args) {   
		Scanner scanner=new Scanner(System.in);   
		System.out.println("������������");  
		int n=scanner.nextInt(); 
		System.out.println("��������ֺ��룺");  
		int m=scanner.nextInt();  
		sortP(n,m);    
	} 
	private static void sortP(int n, int m) {  
		if(n==1){     
			System.out.println(n);;   
		}else {    
			f1(n, m);   
		} 
	}     
	private static void f1(int n, int m) { 
		int[] arr = new int[n];   
		for(int j=0;j<n;j++){    
			for(int i = 0;i<m;i++){        
				count++;    
				if(j>0){    
					measure(j, arr);
				}
				if(count>n){     
					count=1;      
					measure(j,  arr);   
				}   
			}     
			arr[j]=count;  
		}    
		System.out.println("����˳��Ϊ��"+Arrays.toString(arr));   
		System.out.println("��������Ϊ��"+arr[n-1]);  
	}
	private static void measure(int n,int[] arr) {    
		for(int s = 0;s<n;s++){    
			for(int w=0;w<n;w++){      
				if(count==arr[w]) 
					count++;    
			}   
		}    
	} 
}  