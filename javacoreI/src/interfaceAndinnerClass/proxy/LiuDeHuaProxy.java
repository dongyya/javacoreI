package interfaceAndinnerClass.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LiuDeHuaProxy {
	
	//��ס����������Ŀ�����
	private Person ldh = new LiuDeHua();
	
	public Person getProxy(){
		return (Person) Proxy.newProxyInstance(ldh.getClass().getClassLoader(), ldh.getClass().getInterfaces(), 
				new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
				if(method.getName().equals("sing")){
					System.out.println("�������»������ˣ�����������Ҫ��10��Ԫ��");
					return method.invoke(ldh, args);
				}
				if(method.getName().equals("dance")){
					System.out.println("�������»������ˣ�����������Ҫ��20��Ԫ��");
					return method.invoke(ldh, args);
				}
				return null;
			}
		}
		);
	}

}
