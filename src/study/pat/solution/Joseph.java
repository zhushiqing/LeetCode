package study.pat.solution;

import java.util.Arrays;
import java.util.Scanner;

/*   模拟约瑟夫问题 
 * 约瑟夫环问题：已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围。 
 * 从编号为k的人开始报数，数到m的那个人出列；他的下一个人又从1开始报数，数到m的那个人又出列； 
 * 依此规律重复下去，直到圆桌周围的人全部出列。例如：n = 9,k = 1,m = 5 
 */  
  
public class Joseph {  
	private static int count=0;   
	public static void main(String[] args) {   
		Scanner scanner=new Scanner(System.in);   
		System.out.println("请输入人数：");  
		int n=scanner.nextInt(); 
		System.out.println("请输入出局号码：");  
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
		System.out.println("出局顺序为："+Arrays.toString(arr));   
		System.out.println("最后出局人为："+arr[n-1]);  
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