package study.pattern.proxy;

public class AImpl implements A{

	@Override
	public void sayHello(String to) {
		System.out.println("Hello:"+to);
	}

	@Override
	public void print(String s) {
		System.out.println("Print:"+s);
	}

}
