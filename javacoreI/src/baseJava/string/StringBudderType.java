package baseJava.string;
//线程安全的

public class StringBudderType {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer append = sb.append("我爱北京天安门");
		System.out.println(append.toString());
	}

}
