package study.pat.solution;

import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = new String[n];
		for(int i = 0; i < n; i++){
			str[i]=sc.nextLine();
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			System.out.println(judge(str[i]));
		}
		
	}
	public static String judge(String str){
		String result = null;
		int countP=0;
		int countA=0;
		int countT=0;
		if("PAT".equals(str))
			return result = "YES";
		char[] cs = str.toCharArray();
		for (int j = 0; j < cs.length; j++) {
			if(cs[j]=='P')
				countP++;
			else if(cs[j]=='A')
				countA++;
			else if(cs[j]=='T')
				countT++;
			if(!(cs[j]=='A'||cs[j]=='P'||cs[j]=='T'))
				return result ="NO";
		}
		if(!(countP>0&&countA>0&&countT>0))
			return result ="NO";
		String s1 = str.substring(0, str.indexOf("P")+1);
		String s2 = str.substring(str.lastIndexOf("T"));
		if(s1.length()==s2.length())
			return result="YES";
		else if((s1.length()-1)*2==(s2.length()-1)){
			int len1 = str.substring(str.indexOf("P"), str.indexOf("T")).length();
			if((len1-1)==(s1.length()-1))
				return result="YES";
		}
		return result="NO";
	}

}
