
package study.first.pat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountPrimeNumberImprove {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		List<Integer> list =new LinkedList<Integer>();
		list.add(2);
		int count =0;
		int num = 3;
		while(list.size()<N){
			for (int i = 0; i < list.size(); i++) {
				count=i;
				if(num % list.get(i) == 0){
					num++;
					continue;
				}
			}
			if(count==(list.size()-1))
				list.add(num);
		}
		
		for (int i = 0; i < list.size() ; i++) {
			if(i==list.size()-1)
				System.out.print(list.get(i));
			else if((i + 1)%10==0&&i!=(list.size()-1))
				System.out.println(list.get(i));
			else
				System.out.print(list.get(i)+" ");
		}
				
		
	}
	static boolean isPrime(int num,List<Integer> list){
		int count = -1;
		for (int i = 0; i < list.size(); i++) {
			if(num % list.get(i) == 0)
				return false;
			count=i;
		}
		if(count==(list.size()-1))
			list.add(num);
		return true;
	}
}
