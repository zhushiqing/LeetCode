package study.pat.solution;

import java.util.Scanner;

public class Reserver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] output = str.split(" ");
		for (int i = output.length -1; i >= 0 ; i--) {
			if(i!=0)
				System.out.print(output[i]+" ");
			else
				System.out.print(output[i]);
		}
	}

}
