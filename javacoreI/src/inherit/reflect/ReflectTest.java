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
		//�����û����������
				Scanner scan = new Scanner(System.in);
				System.out.println("������������");
				String className = scan.next();
				//����������ȡ����ʵ��
				try{
					Class c1 = Class.forName(className);
					//��ȡ����ĸ���
					Class c1super = c1.getSuperclass();
					//��ȡ��������η�
					String c1modifier = Modifier.toString(c1.getModifiers());
					if(c1modifier.length() > 0){
						System.out.print(c1modifier);
					}
					System.out.print(" class " + c1.getName());
					//��������г���Object֮��ĳ���
					if(c1super != null && c1super != Object.class){
						//������չʾ
						System.out.print(" extends " + c1super.getName());
					}
					System.out.print("\n{");
					//���췽���б�
					printConstrutors(c1);
					//��ͨ�����б�
					printMethods(c1);
					//�����б�
					printFields(c1);
					System.out.print("\n}");
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				}
				System.exit(0);
	}
	
	public static void printFields(Class c1){
		//��ȡ��������
		Field[] declaredFields = c1.getFields();
		if(declaredFields != null && declaredFields.length > 0){
			for(Field field : declaredFields){
				System.out.println();//����
				System.out.print("    ");
				//�������η�
				String fieldModifier = Modifier.toString(field.getModifiers());
				if(fieldModifier.length() > 0){
					System.out.print(fieldModifier + " ");
				}
				//��������
				Class<?> type = field.getType();
				System.out.print(type.getName()+" ");
				//������
				System.out.print(field.getName() + ";");
			}
		}
	}
	
	public static void printMethods(Class c1){
		//��ȡ���еķ���
		Method[] methods = c1.getMethods();
		if(methods != null){
			for(Method method:methods){
				System.out.println();//����
				System.out.print("    ");
				//�������η�
				String modifier = Modifier.toString(method.getModifiers());
				if(modifier.length() > 0){
					System.out.print(modifier + " ");
				}
				//����ֵ
				Class<?> returnType = method.getReturnType();
				if(returnType != null){
					System.out.print(returnType.getName() + " ");
				}
				//������
				System.out.print(method.getName() + "(");
				//�������
				Class<?>[] parameterTypes = method.getParameterTypes();
				int params = 0;
				if(parameterTypes != null && parameterTypes.length > 0){
					params ++;
					for(Class param : parameterTypes){
						//��������
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
		//��ȡ���й��췽��
		Constructor[] declaredConstructors = c1.getDeclaredConstructors();
		if(declaredConstructors != null){
			for(Constructor constructor : declaredConstructors){
				System.out.println();//����
				System.out.print("    ");
				//��ȡ���췽�������η�
				String conModifier = Modifier.toString(constructor.getModifiers());
				if(conModifier.length() > 0){
					System.out.print(conModifier);
				}
				//���췽����
				System.out.print(" " + constructor.getName() + "(");
				//���췽������
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
