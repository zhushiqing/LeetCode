package study.pat.solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MoveRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int move = sc.nextInt();
		List<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < number; i++) {
			list.add(sc.nextInt());
		}
		if(move >= number)
			move = move%number;
		
		for (int i = 1; i <= (number- move); i++) {
			if(move==0)
				break;
			list.add(list.get(0));
			list.remove(0);
		}
		
		for (int i = 0; i < number; i++) {
			if(i==(number-1))
				System.out.print(list.get(i));
			else
				System.out.print(list.get(i)+" ");
		}
	}

}
