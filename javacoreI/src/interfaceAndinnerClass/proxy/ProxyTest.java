package interfaceAndinnerClass.proxy;

public class ProxyTest {
	
	public static void main(String[] args) {
		//获得代理
		LiuDeHuaProxy proxy = new LiuDeHuaProxy();
		//获取代理对象
		Person p = proxy.getProxy();
		//调用代理的sing方法
	    String value = p.sing("冰雨");
	    System.out.println(value);
	    //调用代理的dance方法
	    String danceValue = p.dance("江南style");
	    System.out.println(danceValue);
	}

}
