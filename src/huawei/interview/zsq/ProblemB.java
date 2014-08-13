package huawei.interview.zsq;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> list = ComNum(n);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	static List<Integer> ComNum(int n){  
		List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++)  
        {  
            int sum = 0;  
            for(int j = 1; j < i; j++)  
            {  
                if(i % j == 0)  
                {  
                    sum = sum + j;    
                }     
            }  
            if(sum == i)  
            {  
                list.add(sum);
            }   
        }  
        return list; 
    }  
  
}
