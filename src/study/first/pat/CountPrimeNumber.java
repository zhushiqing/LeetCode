package study.first.pat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		List<Integer> list =new LinkedList<Integer>();
		
		int count =0;
		for (int i = 2; i <= 1000000000; i++) {
			if(!isPrime(i)&&count<M){
				continue;
			}else if(count < M &&  isPrime(i))
				count++;
		
			if(count >= M && count <= N && isPrime(i)){
				list.add(i);
				count++;
			}else if(count>N)
				break;
			
				
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
	static boolean isPrime(int num){
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
