package inherit.reflect;

import java.lang.reflect.Method;

public class InvokeTest {
	
	public static void main(String[] args) {
		try{
			Class c = Class.forName("inherit.reflect.InvokeTest");
			Object invokeTest = c.newInstance();
			Method method = c.getDeclaredMethod("sayHello",String.class,String.class);
			Object obj = method.invoke(null, "LiMing");
			System.out.println(obj.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	public static String sayHello(String name){
		return "Hello " + name;
	}

}
