package baseJava.operator.relationOperator;

//关系运算符
public class RelationOperator {
	
	public static void main(String[] args) {
		//是否相等
		System.out.println(7 == 3);
		//三目运算符
		@SuppressWarnings("unused")
		String str = 7!=3 ? "7不等于3":"7等于3";
		System.out.println(str);
		
		double math = 4;
		double result = Math.sqrt(math);
		System.out.println(result);
		
		double m = Math.pow(4, 2);
		System.out.println(m);
	}

}
