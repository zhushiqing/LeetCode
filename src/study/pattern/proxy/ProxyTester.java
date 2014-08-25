package study.pattern.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTester {

	@Test
	public void test1(){
		A impl = new AImpl();
		Handler handler = new Handler(impl);
		
		A hello = (A)Proxy.newProxyInstance(impl.getClass().getClassLoader(), impl.getClass().getInterfaces(), handler);
		
		hello.print("ÄãºÃ£¡");
		hello.sayHello("zhushiqing");
	}
}
