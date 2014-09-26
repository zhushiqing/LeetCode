package zju.zsq.solution;

import java.math.BigInteger;
import java.util.Scanner;

import org.junit.Test;

//关于输入的测试用例应该是非零&&无限大，所以需要用大数来处理
public class Multiply {
	@Test
	public void test1(){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();
		
		String result = multiply(num1,num2);
		System.out.println(result);
	}
	
	public String multiply(String num1, String num2) {
		if("0".equals(num2)||"0".equals(num1))
			return "0";
		//biginteger 可以直接接收字符串！
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        BigInteger number3 = number1.multiply(number2);
        return number3.toString();
    }
}
