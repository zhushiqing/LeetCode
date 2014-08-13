package study.pat.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Linkloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆桌人数：");
		
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		System.out.println("请输入第几个人出局");
		int m = sc.nextInt();
		
		while(list.size()>1){
			int count = 0;
			if(m<=list.size()){
				count = m;
			}else{
				count = m%list.size();
			}
			for (int i = 1; i <= count ; i++) {
				if(i==count)
					list.remove(0);
				else{
					list.add(list.get(0));
					list.remove(0);
				}
				
			}
		}
		System.out.println("最后出局的是"+list.get(0));
	}

}
