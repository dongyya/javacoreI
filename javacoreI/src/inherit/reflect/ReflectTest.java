package inherit.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectTest {
	
	public static void main(String[] args) {
		ReflectEntity r = new ReflectEntity();
		r.setProperty("test");
		try{
			Class reflectEntity = r.getClass();
			Field field = reflectEntity.getDeclaredField("property");
			field.setAccessible(true);
			Object object = field.get(r);
			System.out.print(object.toString());
			field.set(r, "testnew");
			Object objectnew = field.get(r);
			System.out.print(objectnew.toString());
		}catch(NoSuchFieldException e1){
			e1.printStackTrace();
		}catch(IllegalAccessException e2){
			e2.printStackTrace();
		}
		System.exit(0);
	}
	
	public static void checkClass(){
		//接收用户输入的类名
				Scanner scan = new Scanner(System.in);
				System.out.println("请输入类名：");
				String className = scan.next();
				//根据类名获取该类实例
				try{
					Class c1 = Class.forName(className);
					//获取该类的父类
					Class c1super = c1.getSuperclass();
					//获取该类的修饰符
					String c1modifier = Modifier.toString(c1.getModifiers());
					if(c1modifier.length() > 0){
						System.out.print(c1modifier);
					}
					System.out.print(" class " + c1.getName());
					//如果该类有除了Object之外的超类
					if(c1super != null && c1super != Object.class){
						//将超类展示
						System.out.print(" extends " + c1super.getName());
					}
					System.out.print("\n{");
					//构造方法列表
					printConstrutors(c1);
					//普通方法列表
					printMethods(c1);
					//属性列表
					printFields(c1);
					System.out.print("\n}");
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				}
				System.exit(0);
	}
	
	public static void printFields(Class c1){
		//获取所有属性
		Field[] declaredFields = c1.getFields();
		if(declaredFields != null && declaredFields.length > 0){
			for(Field field : declaredFields){
				System.out.println();//换行
				System.out.print("    ");
				//属性修饰符
				String fieldModifier = Modifier.toString(field.getModifiers());
				if(fieldModifier.length() > 0){
					System.out.print(fieldModifier + " ");
				}
				//属性类型
				Class<?> type = field.getType();
				System.out.print(type.getName()+" ");
				//属性名
				System.out.print(field.getName() + ";");
			}
		}
	}
	
	public static void printMethods(Class c1){
		//获取所有的方法
		Method[] methods = c1.getMethods();
		if(methods != null){
			for(Method method:methods){
				System.out.println();//换行
				System.out.print("    ");
				//方法修饰符
				String modifier = Modifier.toString(method.getModifiers());
				if(modifier.length() > 0){
					System.out.print(modifier + " ");
				}
				//返回值
				Class<?> returnType = method.getReturnType();
				if(returnType != null){
					System.out.print(returnType.getName() + " ");
				}
				//方法名
				System.out.print(method.getName() + "(");
				//方法入参
				Class<?>[] parameterTypes = method.getParameterTypes();
				int params = 0;
				if(parameterTypes != null && parameterTypes.length > 0){
					params ++;
					for(Class param : parameterTypes){
						//参数类型
						System.out.print(param.getName());
						if(params != parameterTypes.length){
							System.out.print(",");
						}
					}
				}
				System.out.print(");");
			}
		}
	}
	
	public static void printConstrutors(Class c1){
		//获取所有构造方法
		Constructor[] declaredConstructors = c1.getDeclaredConstructors();
		if(declaredConstructors != null){
			for(Constructor constructor : declaredConstructors){
				System.out.println();//换行
				System.out.print("    ");
				//获取构造方法的修饰符
				String conModifier = Modifier.toString(constructor.getModifiers());
				if(conModifier.length() > 0){
					System.out.print(conModifier);
				}
				//构造方法名
				System.out.print(" " + constructor.getName() + "(");
				//构造方法参数
				Class[] parameterTypes = constructor.getParameterTypes();
				int params = 0;
				if(parameterTypes != null && parameterTypes.length > 0){
					for(Class param:parameterTypes){
						System.out.print(param.getName());
						params ++;
						if(params != parameterTypes.length){
							System.out.print(",");
						}
					}
				}
				System.out.print(");");
			}
		}
	}
	
}
