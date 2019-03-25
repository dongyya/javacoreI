package interfaceAndinnerClass.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LiuDeHuaProxy {
	
	//记住代理类代理的目标对象
	private Person ldh = new LiuDeHua();
	
	public Person getProxy(){
		return (Person) Proxy.newProxyInstance(ldh.getClass().getClassLoader(), ldh.getClass().getInterfaces(), 
				new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
				if(method.getName().equals("sing")){
					System.out.println("我是刘德华代理人，找他唱歌需要交10万元。");
					return method.invoke(ldh, args);
				}
				if(method.getName().equals("dance")){
					System.out.println("我是刘德华代理人，找他跳舞需要交20万元。");
					return method.invoke(ldh, args);
				}
				return null;
			}
		}
		);
	}

}
