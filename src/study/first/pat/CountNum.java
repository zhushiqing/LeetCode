	package study.first.pat;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	
	public class CountNum {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String num = sc.nextLine();
			
			char[] cs = num.toCharArray();
			char temp;
			
			for (int i = 0; i < cs.length-1; i++) {
				for (int j = 0; j < cs.length-i-1; j++) {
					if(cs[j]>cs[j+1]){
						temp=cs[j];
						cs[j]=cs[j+1];
						cs[j+1]=temp;
					}
				}
			}
			
			int[] count = {0,0,0,0,0,0,0,0,0,0};
			List<Character> list = new ArrayList<Character>();
			
			for (int i = 0; i < cs.length; i++) {
				if(list.contains(cs[i]))
					count[list.indexOf(cs[i])]++;
				else{
					list.add(cs[i]);
					count[list.indexOf(cs[i])]++;
				}
			}
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i)+":"+count[i]);
			}
			
			
			
			
			
		}
	}
