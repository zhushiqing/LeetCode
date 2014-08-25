package study.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler{

	
	private Object dele;
	
	public Handler(Object obj){
		this.dele = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		doBefore();
		
		Object result = (Object)method.invoke(method, args);
		
		doAfter();
		return result;
	}
	
	
	private void doAfter() {
		System.out.println("after....");
	}
	private void doBefore() {
		System.out.println("before....");
	}
	
}
